package com.crimsonlogic.setexamples.userdefinedobjectsforset;

import java.util.Objects;

public class Product {
    private int productID;
    private String productName;
    private double productPrice;

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return productID == product.productID && Double.compare(productPrice, product.productPrice) == 0 && Objects.equals(productName, product.productName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productID, productName, productPrice);
    }

    @Override
    public String toString() {
        return "Product{" +
                "productID=" + productID +
                ", productName='" + productName + '\'' +
                ", productPrice=" + productPrice +
                '}';
    }
}
