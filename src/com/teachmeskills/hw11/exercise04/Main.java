package com.teachmeskills.hw11.exercise04;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Order> orders = new ArrayList<>();

        Order order1 = new Order(1, 50.0);
        Order order2 = new Order(2, 30.0);
        Order order3 = new Order(3, 70.0);

        orders.add(order1);
        orders.add(order2);
        orders.add(order3);

        System.out.println("Несортированная коллекция:");
        for (Order order : orders) {
            System.out.println(order);
        }

        Collections.sort(orders, new OrderComparator());

        System.out.println("\nОтсортированная коллекция:");
        for (Order order : orders) {
            System.out.println(order);
        }
    }
}
