package com.teachmeskills.hw11.exercise04;

public class Order {
    private int orderId;
    private double orderCost;

    public Order(int orderId, double orderCost) {
        this.orderId = orderId;
        this.orderCost = orderCost;
    }

    public int getOrderId() {
        return orderId;
    }

    public double getOrderCost() {
        return orderCost;
    }

    @Override
    public String toString() {
        return "ID: " + orderId + ", Цена: " + orderCost;
    }
}
