package com.company.practice.objects;

public class Product {
    String productName;
    double productPrice;
    int productNum;
    boolean isProductAvailable;

    public Product(String productName, double productPrice, int productNum) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.productNum = productNum;
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

    public int getProductNum() {
        return productNum;
    }

    public void setProductNum(int productNum) {
        this.productNum = productNum;
    }

    public boolean isProductAvailable() {
        return isProductAvailable;
    }

    public void setProductAvailable(boolean productAvailable) {
        isProductAvailable = productAvailable;
    }

    public void changeProductNum(int productNum){
        setProductNum(productNum);
        if(productNum > 0){
            isProductAvailable = true;
        }else{
            isProductAvailable = false;
        }
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", productPrice=" + productPrice +
                ", productNum=" + productNum +
                ", isProductAvailable=" + isProductAvailable +
                '}';
    }
}
