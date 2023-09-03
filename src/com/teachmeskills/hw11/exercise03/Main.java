package com.teachmeskills.hw11.exercise03;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int collectionSize = Handler.getValidCollectionSize(scanner);
        ArrayList<Integer> collection = Handler.generateRandomNumbers(collectionSize);
        double average = Handler.calculateAverage(collection);
        System.out.println("Среднее арифметическое элементов коллекции: " + average);
        scanner.close();
    }


}
