package com.teachmeskills.hw11.exercise04;

import java.util.Comparator;

class OrderComparator implements Comparator<Order> {
    @Override
    public int compare(Order o1, Order o2) {
        // Сортируем заказы по цене по возрастанию
        return Double.compare(o1.getOrderCost(), o2.getOrderCost());
    }
}
