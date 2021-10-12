package org.openjfx;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    String feed_product_type;
    String item_sku;
    String brand_name;
    String item_name;
    String external_product_id;
    String external_product_id_type;
    String outer_material_type;
    String recommended_browse_nodes;
    String material_composition1;
    String material_composition2;
    String material_composition3;
    String material_composition4;
    String material_composition5;
    String material_composition6;
    String material_composition7;
    String material_composition8;
    String material_composition9;
    String material_composition10;
    String size_name;
    String color_name;
    String color_map;
    String department_name;
    String size_map;
    String is_adult_product;
    String quantity;
    String standard_price;
    String main_image_url;

    @Override
    public String toString() {
        return  feed_product_type + '\t' +
                 item_sku + '\t' +
                 brand_name + '\t' +
                 item_name + '\t' +
                 external_product_id + '\t' +
                 external_product_id_type + '\t' +
                 outer_material_type + '\t' +
                 recommended_browse_nodes + '\t' +
                 material_composition1 + '\t' +
                 material_composition2 + '\t' +
                 material_composition3 + '\t' +
                 material_composition4 + '\t' +
                 material_composition5 + '\t' +
                 material_composition6 + '\t' +
                 material_composition7 + '\t' +
                 material_composition8 + '\t' +
                 material_composition9 + '\t' +
                 material_composition10 + '\t' +
                 size_name + '\t' +
                 color_name + '\t' +
                 color_map + '\t' +
                 department_name + '\t' +
                 size_map + '\t' +
                 is_adult_product + '\t' +
                 quantity + '\t' +
                 standard_price + '\t' +
                 main_image_url;
    }
}