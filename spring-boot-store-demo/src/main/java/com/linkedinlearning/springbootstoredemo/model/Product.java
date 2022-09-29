package com.linkedinlearning.springbootstoredemo.model;

import java.util.Objects;

/**
 * A product available in the store
 */
public class Product {
    private long upc;
    private String name;
    private String type;
    private String description;
    private String thumbnail;

    public Product() {}

    public Product(long upc, String name, String type, String description, String thumbnail) {
        this.upc = upc;
        this.name = name;
        this.type = type;
        this.description = description;
        this.thumbnail = thumbnail;
    }

    public long getUpc() {
        return upc;
    }

    public void setUpc(long upc) {
        this.upc = upc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return getUpc() == product.getUpc() && Objects.equals(getName(), product.getName()) && Objects.equals(getType(), product.getType()) && Objects.equals(getDescription(), product.getDescription()) && Objects.equals(getThumbnail(), product.getThumbnail());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getUpc(), getName(), getType(), getDescription(), getThumbnail());
    }

    @Override
    public String toString() {
        return "Product{" +
                "upc=" + upc +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", description='" + description + '\'' +
                ", thumbnail='" + thumbnail + '\'' +
                '}';
    }
}
