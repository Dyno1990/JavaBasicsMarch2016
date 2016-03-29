package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    Scanner console = new Scanner(System.in);

        int numberOfElements = console.nextInt();
        int[] numbers = new int[numberOfElements];

        for (int i = 0; i<numbers.length; i++){
            numbers[i] = console.nextInt();
        }
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }
}
