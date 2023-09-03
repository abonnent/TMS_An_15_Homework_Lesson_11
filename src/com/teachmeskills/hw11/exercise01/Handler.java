package com.teachmeskills.hw11.exercise01;

import java.util.ArrayList;
import java.util.Scanner;

public class Handler {
    public static void enteringIntegers() {
        Scanner console = new Scanner(System.in);
        System.out.print("Введи целое число: ");
        ArrayList<Integer> listNumbers = new ArrayList<>();

        while (console.hasNext()) {
            try {
                String line = console.nextLine();
                if (line.toLowerCase().equals("exit")) {
                    break;
                }

                int number = Integer.parseInt(line);
                listNumbers.add(number);
                System.out.print("Введи целое число: ");
            } catch (NumberFormatException e) {
                System.out.println("Необходимо ввести число!");
                System.out.print("Введи целое число: ");
            }
        }

        System.out.println();
        for (int number : listNumbers) {
            if (number % 2 == 0) {
                System.out.println(number);
            }
        }
    }
}
