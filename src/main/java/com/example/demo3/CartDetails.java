
package com.example.demo3;

import java.util.List;

public class CartDetails {
    
    private List<String> product_name;
    private List<String> product_description;
    private List<String> product_price;
    private List<String> product_brand;

    public List<String> getProduct_name() {
        return product_name;
    }
    public void setProduct_name(List<String> product_name) {
        this.product_name = product_name;
    }
    public List<String> getProduct_description() {
        return product_description;
    }
    public void setProduct_description(List<String> product_description) {
        this.product_description = product_description;
    }

    public List<String> getProduct_price() {
        return product_price;
    }
    public void setProduct_price(List<String> product_price) {
        this.product_price = product_price;
    }
    public List<String> getProduct_brand() {
        return product_brand;
    }
    public void setProduct_brand(List<String> product_brand) {
        this.product_brand = product_brand;
    }
}
