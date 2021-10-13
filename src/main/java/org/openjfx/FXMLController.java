package org.openjfx;

import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
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

public class FXMLController {

    public TextArea source;
    public TextArea copy;
    private final ObservableList<Color> data = FXCollections.observableArrayList(
            new Color("tianlanse", "ブルー"),
            new Color("kaqise", "カーキ"),
            new Color("kafeise", "グレージュ"),
            new Color("huilanse", "グレー")
    );
    public TextField key;
    public TextField name;
    public TableColumn<Color, String> colorKey;
    public TableColumn<Color, String> colorName;
    public TableView<Color> tableView;
    public TextField size;

    @FXML
    private void initialize() {
        colorKey.setCellValueFactory(celldata -> celldata.getValue().keyProperty());
        colorName.setCellValueFactory(celldata -> celldata.getValue().nameProperty());
        tableView.setItems(data);
    }

    public void sayHello() {
        String[] sizeSpilt = size.getText().split(",");
        String text = source.getText();
        String[] split = text.split("\\t");
        Product product = new Product(split[0],split[1],split[2],split[3],split[4],split[5],split[6],split[7],split[8],split[9],split[10],split[11],split[12],split[13],split[14],split[15],split[16],split[17],split[18],split[19],split[20],split[21],split[22],split[23],split[24],split[25],split[26]);
        String item_sku = product.getItemSku();
        StringBuilder sb = new StringBuilder(product.toString());
        sb.append("\n");
        for (Color color : data) {
            for (String s : sizeSpilt) {
                product.setItemSku(item_sku + "-" + color.getKey() + s);
                product.setSizeName(s);
                product.setSizeName(s);
                product.setColorName(color.getName());
                product.setColorMap(color.getName());
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
        data.add(new Color(key.getText(), name.getText()));
        key.clear();
        name.clear();
    }

    public static class Color {
        private final SimpleStringProperty key;
        private final SimpleStringProperty name;

        private Color(String key, String name) {
            this.key = new SimpleStringProperty(key);
            this.name = new SimpleStringProperty(name);
        }

        public String getKey() {
            return key.get();
        }

        public void setKey(String key) {
            this.key.set(key);
        }

        public SimpleStringProperty keyProperty() {
            return key;
        }

        public String getName() {
            return name.get();
        }

        public void setName(String name) {
            this.name.set(name);
        }

        public SimpleStringProperty nameProperty() {
            return name;
        }
    }
}