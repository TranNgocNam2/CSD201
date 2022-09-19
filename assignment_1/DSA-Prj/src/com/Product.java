/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

/**
 *
 * @author ADMIN
 */
public class Product {

    String code ="", name = "";
    int price = 0, warranty = 0;

    public Product() {
    }

    public Product(String c, String n, int s, int q) {
        code = c;
        name = n;
        price = s;
        warranty = q;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getWarranty() {
        return warranty;
    }

    public void setWaranty(int warranty) {
        this.warranty = warranty;
    }

    public boolean equals(Product pd) {
        return pd.getCode().equals(this.getCode()) && pd.getName().equals(this.getName()) && pd.getPrice() == this.getPrice() && pd.getWarranty() == this.getWarranty();
    }

    public String toString() {
        return code + "\t" + name + "\t" + price + "\t" + warranty;
    }
}
