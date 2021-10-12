package org.openjfx;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.text.Text;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.util.HashMap;
import java.util.Map;

public class FXMLController {

    public Text hello;
    public TextArea source;
    public TextArea copy;

    public void sayHello() {
        Map<String,String> colorMap = new HashMap<>();
        colorMap.put("tianlanse", "ブルー");
        colorMap.put("kaqise", "カーキ");
        colorMap.put("kafeise", "グレージュ");
        colorMap.put("huilanse", "グレー");
        String[] size = {"M", "L", "XL", "XXL", "XXXL"};

        String text = source.getText();
        String[] split = text.split("\\t");
        Product product = new Product(split[0],split[1],split[2],split[3],split[4],split[5],split[6],split[7],split[8],split[9],split[10],split[11],split[12],split[13],split[14],split[15],split[16],split[17],split[18],split[19],split[20],split[21],split[22],split[23],split[24],split[25],split[26]);
        String item_sku = product.getItem_sku();
        StringBuilder sb = new StringBuilder(product.toString());
        sb.append("\n");
        for (String color : colorMap.keySet()) {
            for (String s : size) {
                product.setItem_sku(item_sku+"-"+color+s);
                product.setSize_name(s);
                product.setSize_map(s);
                product.setColor_name(colorMap.get(color));
                product.setColor_map(colorMap.get(color));
                sb.append(product.toString());
                sb.append("\n");
            }
        }
        copy.setText(sb.toString());
        StringSelection stringSelection = new StringSelection(sb.toString());
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(stringSelection, null);
    }
}