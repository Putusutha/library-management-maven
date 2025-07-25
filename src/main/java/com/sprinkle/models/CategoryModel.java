package com.sprinkle.models;

public class CategoryModel {
    private int categoryId;
    private String categoryName;

    public CategoryModel(int categoryId, String categoryName) {
        this.categoryId = categoryId;
        this.categoryName = categoryName;
    }

    // Getters & Setters
    public int getCategoryId() { return categoryId; }
    public void setCategoryId(int categoryId) { this.categoryId= categoryId; }
    public String getCategoryName() { return categoryName; }
    public void setCategoryName(String categoryName) { this.categoryName = categoryName; }
    @Override
    public String toString() {
        return categoryName; // agar yang tampil di ComboBox adalah nama
    }

}
