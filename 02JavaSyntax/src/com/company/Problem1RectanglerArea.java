package com.company;
import java.util.Scanner;
/**
 * Created by Dyno on 22.3.2016 г..
 */
public class Problem1RectanglerArea {
    public static void RectangleArea() {

        Scanner console = new Scanner(System.in);

        int a = console.nextInt();
        int b = console.nextInt();

        int area = a * b;
        System.out.println(area);
    }
}
