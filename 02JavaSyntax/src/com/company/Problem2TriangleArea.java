package com.company;

import java.util.Scanner;
/**
 * Created by Dyno on 22.3.2016 г..
 */
public class Problem2TriangleArea {
    public static void PrintTriangleArea() {
        Scanner console = new Scanner(System.in);

        int[] coord = new int[6];

        for (int i = 0; i < coord.length; i++) {
            coord[i] = console.nextInt();
        }

        int area = Math.abs((coord[0] * (coord[3] - coord[5]) + coord[2] * (coord[5] - coord[1] + coord[4] * (coord[1] - coord[3]))) / 2);
        if (area > 0) {
            System.out.println(area);
        } else {
            System.out.println(0);
        }
    }
}