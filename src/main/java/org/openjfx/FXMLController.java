package org.openjfx;

import javafx.collections.FXCollections;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public class FXMLController {

    private final ObservableList<Color> data = FXCollections.observableArrayList();

    public TextArea copy;
    public TextArea source;
    public TextField key;
    public TextField name;
    public TextField size;
    public TextField standardPrice;
    public TextField folder;
    public TextField brandName;
    public TableView<Color> tableView;
    public TableColumn<Color, String> colorKey;
    public TableColumn<Color, String> colorName;
    public TableColumn<Color, String> imageUrl;

    @FXML
    private void initialize() {
        colorKey.setCellValueFactory(celldata -> celldata.getValue().keyProperty());
        colorName.setCellValueFactory(celldata -> celldata.getValue().nameProperty());
        imageUrl.setCellValueFactory(celldata -> celldata.getValue().imageUrlProperty());
        tableView.setItems(data);
        data.addListener((ListChangeListener<? super Color>) change -> {
            while (change.next()) {
                if (change.wasReplaced()) {
                    break;
                }
                if (change.wasAdded()) {
                    List<? extends Color> addedSubList = change.getAddedSubList();
                    Color color = addedSubList.get(0);
                    int from = change.getFrom();
                    String key = color.getKey();
                    CompletableFuture.supplyAsync(() -> {
                        System.out.println("key = " + key);
                        try {
                            return CloudinaryUtils.searchFolder(folder.getText(), key);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        return null;
                    }).whenComplete((e, throwable) -> {
                        Color element = new Color(color.getKey(), color.getName(), e.getResources().get(0).getUrl());
                        System.out.println("url = " + element.getImageUrl());
                        data.set(from, element);
                    });
                }
            }
        });
    }

    public void sayHello() {
        String[] sizeSpilt = size.getText().split(",");
        Product product = new Product(source.getText());
        String itemSku = product.getItemSku();
        StringBuilder sb = new StringBuilder(product.toString());
        sb.append("\n");
        String fromDate = LocalDate.now().format(DateTimeFormatter.ISO_DATE);
        String endDate = LocalDate.now().plusYears(3).format(DateTimeFormatter.ISO_DATE);
        for (Color color : data) {
            for (String size : sizeSpilt) {
                String standardPriceStr = standardPrice.getText();
                BigDecimal standardPrice = new BigDecimal(standardPriceStr);
                BigDecimal salePrice = standardPrice.subtract(new BigDecimal("500"));
                BigDecimal divide = salePrice.divide(new BigDecimal("0.3"), RoundingMode.HALF_UP);
                product.setItemSku(itemSku + "-" + color.getKey() + "-" + size);
                product.setBrandName(brandName.getText());

                product.setStandardPrice(standardPriceStr);
                product.setSalePrice(salePrice.toString());
                product.setSaleFromDate(fromDate);
                product.setSaleEndDate(endDate);
                product.setListPrice(divide.toString());

                product.setParentSku(itemSku);
                product.setSizeName(size);
                product.setSizeMap(size);
                product.setColorName(color.getName());
                product.setColorMap(color.getName());

                product.setMainImageUrl(color.getImageUrl());
                product.setSwatchImageUrl(color.getImageUrl());

                product.setMaxOrderQuantity("5");
                product.setFulfillmentLatency("4");
                product.setParentChild("Child");
                product.setRelationshipType("Variation");
                product.setExternalProductIdType("GTIN");
                product.setOuterMaterialType("綿麻");
                sb.append(product.toString());
                sb.append("\n");
            }
        }
        copy.setText(sb.toString());
        StringSelection stringSelection = new StringSelection(sb.toString());
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(stringSelection, null);
    }

    public void addColorMap(ActionEvent actionEvent) {
        data.add(new Color(key.getText(), name.getText(), ""));
        key.clear();
        name.clear();
    }

}