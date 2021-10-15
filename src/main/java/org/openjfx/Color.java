package org.openjfx;

import javafx.beans.property.SimpleStringProperty;

public class Color {
    private final SimpleStringProperty key;
    private final SimpleStringProperty name;
    private final SimpleStringProperty imageUrl;

    Color(String key, String name, String imageUrl) {
        this.key = new SimpleStringProperty(key);
        this.name = new SimpleStringProperty(name);
        this.imageUrl = new SimpleStringProperty(imageUrl);
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

    public String getImageUrl() {
        return imageUrl.get();
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl.set(imageUrl);
    }

    public SimpleStringProperty imageUrlProperty() {
        return imageUrl;
    }
}
