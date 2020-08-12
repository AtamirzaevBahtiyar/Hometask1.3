package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        double[] array = new double[]{14.3, 25.5, -3.5, 4.2, 11.5, 6.5, 7.1, 8.3, 9.7, 64.9, 1.3, -12.5, 32.3, -14.2, 15.6};
        int quantity = 0;
        double sum = 0;
        double middleNumber = 0;
        boolean isNegativly = false;
        for (int i = 0; i < array.length; i++) {
            if (!isNegativly && array[i] < 0) {
                isNegativly = true;
            }
            if (isNegativly && array[i] > 0) {
                quantity += 1;
                sum += array[i];
            }
        }
        middleNumber = sum / quantity;
        System.out.println("Sum: " + sum);
        System.out.println("Quantity of numbers: " + quantity);
        System.out.println("Middle number: " + middleNumber);

        boolean isSorted = false;
        double number;
        while (!isSorted){
            isSorted = true;
            for (int i = 0; i < array.length -1 ; i++) {
                if (array[i] > array[i + 1]){
                    isSorted = false;
                number = array[i];
                array[i] = array[i+1];
                array[i+1] = number;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }

}
