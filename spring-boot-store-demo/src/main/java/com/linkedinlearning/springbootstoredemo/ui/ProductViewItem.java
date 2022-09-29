package com.linkedinlearning.springbootstoredemo.ui;

import java.util.Objects;

/**
 * A UI-facing representation of a {@link com.linkedinlearning.springbootstoredemo.model.Product}
 */
public class ProductViewItem {
    private String name;
    private String description;
    private String thumbnail;
    private String displayDetails;

    public ProductViewItem(String name, String description, String thumbnail, String displayDetails) {
        this.name = name;
        this.description = description;
        this.thumbnail = thumbnail;
        this.displayDetails = displayDetails;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getDisplayDetails() {
        return displayDetails;
    }

    public void setDisplayDetails(String displayDetails) {
        this.displayDetails = displayDetails;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductViewItem that = (ProductViewItem) o;
        return Objects.equals(getName(), that.getName()) && Objects.equals(getDescription(), that.getDescription()) && Objects.equals(getThumbnail(), that.getThumbnail()) && Objects.equals(getDisplayDetails(), that.getDisplayDetails());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getDescription(), getThumbnail(), getDisplayDetails());
    }

    @Override
    public String toString() {
        return "ProductViewItem{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", thumbnail='" + thumbnail + '\'' +
                ", displayDetails='" + displayDetails + '\'' +
                '}';
    }
}
