package org.openjfx;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Collectors;


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
    private String swatchImageUrl;
    private String otherImageUrl1;
    private String otherImageUrl2;
    private String otherImageUrl3;
    private String otherImageUrl4;
    private String otherImageUrl5;
    private String otherImageUrl6;
    private String otherImageUrl7;
    private String otherImageUrl8;
    private String parentChild;
    private String parentSku;
    private String relationshipType;
    private String variationTheme;
    private String updateDelete;
    private String partNumber;
    private String productDescription;
    private String heelType;
    private String closureType;
    private String modelYear;
    private String innerMaterialType1;
    private String innerMaterialType2;
    private String innerMaterialType3;
    private String innerMaterialType4;
    private String innerMaterialType5;
    private String bulletPoint1;
    private String bulletPoint2;
    private String bulletPoint3;
    private String bulletPoint4;
    private String bulletPoint5;
    private String genericKeywords;
    private String styleName;
    private String lifestyle1;
    private String lifestyle2;
    private String styleKeywords;
    private String collarStyle;
    private String neckStyle;
    private String seasons;
    private String platinumKeywords1;
    private String platinumKeywords2;
    private String platinumKeywords3;
    private String platinumKeywords4;
    private String platinumKeywords5;
    private String specificUsesKeywords;
    private String materialType;
    private String fitType;
    private String shaftStyleType;
    private String strapType;
    private String waistStyle;
    private String sleeveType;
    private String bottomStyle;
    private String shoeWidth;
    private String shaftHeight;
    private String waistSizeUnitOfMeasure;
    private String waistSize;
    private String inseamLengthUnitOfMeasure;
    private String inseamLength;
    private String sleeveLengthUnitOfMeasure;
    private String sleeveLength;
    private String neckSizeUnitOfMeasure;
    private String neckSize;
    private String chestSizeUnitOfMeasure;
    private String chestSize;
    private String websiteShippingWeightUnitOfMeasure;
    private String websiteShippingWeight;
    private String shaftHeightUnitOfMeasure;
    private String itemWidth;
    private String itemHeight;
    private String shoeWidthUnitOfMeasure;
    private String itemDimensionsUnitOfMeasure;
    private String itemLength;
    private String fabricType;
    private String batteriesRequired;
    private String areBatteriesIncluded;
    private String batteryType1;
    private String batteryType2;
    private String batteryType3;
    private String numberOfBatteries1;
    private String numberOfBatteries2;
    private String numberOfBatteries3;
    private String numberOfLithiumMetalCells;
    private String numberOfLithiumIonCells;
    private String lithiumBatteryPackaging;
    private String lithiumBatteryEnergyContent;
    private String lithiumBatteryEnergyContentUnitOfMeasure;
    private String lithiumBatteryWeight;
    private String lithiumBatteryWeightUnitOfMeasure;
    private String itemWeight;
    private String itemWeightUnitOfMeasure;
    private String itemVolume;
    private String itemVolumeUnitOfMeasure;
    private String countryOfOrigin;
    private String fulfillmentLatency;
    private String conditionType;
    private String conditionNote;
    private String standardPricePoints;
    private String salePricePoints;
    private String productSiteLaunchDate;
    private String merchantReleaseDate;
    private String listPrice;
    private String optionalPaymentTypeExclusion;
    private String deliveryScheduleGroupId;
    private String salePrice;
    private String saleFromDate;
    private String saleEndDate;
    private String restockDate;
    private String maxOrderQuantity;
    private String offeringCanBeGiftMessaged;
    private String offeringCanBeGiftwrapped;
    private String isDiscontinuedByManufacturer;
    private String merchantShippingGroupName;
    private String distributionDesignation;
    private String itemPackageQuantity;
    private String offeringEndDate;
    private String offeringStartDate;
    private String productTaxCode;
    private String businessPrice;
    private String quantityPriceType;
    private String quantityLowerBound1;
    private String quantityPrice1;
    private String quantityLowerBound2;
    private String quantityPrice2;
    private String quantityLowerBound3;
    private String quantityPrice3;
    private String quantityLowerBound4;
    private String quantityPrice4;
    private String quantityLowerBound5;
    private String quantityPrice5;
    private String progressiveDiscountType;
    private String progressiveDiscountLowerBound1;
    private String progressiveDiscountValue1;
    private String progressiveDiscountLowerBound2;
    private String progressiveDiscountValue2;
    private String progressiveDiscountLowerBound3;
    private String progressiveDiscountValue3;
    private String pricingAction;

    public Product(String source) {
        String[] split = source.split("\\t");
        Field[] declaredFields = this.getClass().getDeclaredFields();
        final int[] i = {0};
        Arrays.stream(split).forEach(val -> {
            try {
                declaredFields[i[0]++].set(this, Objects.toString(val, ""));
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        });
    }

    @Override
    public String toString() {
        return Arrays.stream(this.getClass().getDeclaredFields()).map(field -> {
            try {
                return Objects.toString(field.get(this), "");
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
            return "";
        }).collect(Collectors.joining("\t"));
    }
}