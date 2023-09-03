package com.teachmeskills.hw11.exercise03;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Handler {
    public static int getValidCollectionSize(Scanner scanner) {
        int size = 0;
        boolean isValid = false;

        do {
            try {
                System.out.print("Введите размер коллекции: ");
                size = scanner.nextInt();
                isValid = true;

                if (size <= 0) {
                    System.out.println("Размер коллекции должен быть положительным числом.");
                    isValid = false;
                }
            } catch (InputMismatchException e) {
                System.out.println("Неверный формат ввода. Введите целое положительное число.");
                scanner.next();
            }
        } while (!isValid);

        return size;
    }

    public static ArrayList<Integer> generateRandomNumbers(int size) {
        ArrayList<Integer> collection = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            collection.add(random.nextInt(100));
        }

        return collection;
    }

    public static double calculateAverage(ArrayList<Integer> collection) {
        int sum = 0;
        for (int number : collection) {
            sum += number;
        }

        return (double) sum / collection.size();
    }
}
