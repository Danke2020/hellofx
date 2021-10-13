package org.openjfx;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    private String feedProductType;
    private String itemSku;
    private String brandName;
    private String itemName;
    private String externalProductId;
    private String externalProductIdType;
    private String outerMaterialType;
    private String recommendedBrowseNodes;
    private String materialComposition1;
    private String materialComposition2;
    private String materialComposition3;
    private String materialComposition4;
    private String materialComposition5;
    private String materialComposition6;
    private String materialComposition7;
    private String materialComposition8;
    private String materialComposition9;
    private String materialComposition10;
    private String sizeName;
    private String colorName;
    private String colorMap;
    private String departmentName;
    private String sizeMap;
    private String isAdultProduct;
    private String quantity;
    private String standardPrice;
    private String mainImageUrl;

    @Override
    public String toString() {
        return feedProductType + '\t' +
                itemSku + '\t' +
                brandName + '\t' +
                itemName + '\t' +
                externalProductId + '\t' +
                externalProductIdType + '\t' +
                outerMaterialType + '\t' +
                recommendedBrowseNodes + '\t' +
                materialComposition1 + '\t' +
                materialComposition2 + '\t' +
                materialComposition3 + '\t' +
                materialComposition4 + '\t' +
                materialComposition5 + '\t' +
                materialComposition6 + '\t' +
                materialComposition7 + '\t' +
                materialComposition8 + '\t' +
                materialComposition9 + '\t' +
                materialComposition10 + '\t' +
                sizeName + '\t' +
                colorName + '\t' +
                colorMap + '\t' +
                departmentName + '\t' +
                sizeMap + '\t' +
                isAdultProduct + '\t' +
                 quantity + '\t' +
                standardPrice + '\t' +
                mainImageUrl;
    }
}