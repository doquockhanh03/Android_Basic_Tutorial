package com.example.buoi_03;

public class Product {
    private String name;
    private double money;

    public Product(String name, double money) {
        this.name = name;
        this.money = money;
    }

    public Product() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}
