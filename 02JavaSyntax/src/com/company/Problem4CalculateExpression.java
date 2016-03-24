package com.company;

import java.util.Scanner;

/**
 * Created by Dyno on 23.3.2016 г..
 */
public class Problem4CalculateExpression {
    public static void CalculateExpressions(){
        Scanner console = new Scanner(System.in);

        double a = console.nextDouble();
        double b = console.nextDouble();
        double c = console.nextDouble();

        double f1 = Math.pow(((Math.pow(a, 2)+Math.pow(b,2))/(Math.pow(a, 2)-Math.pow(b,2))), (((a+b+c)/Math.sqrt(c))));
        double f2 = Math.pow(((Math.pow(a, 2)+Math.pow(b,2) + Math.pow(c,3)),(a-b));

        double numbersAverage = (a+b+c)/3;
        double fAverage = (f1+f2)/2;
        double diff = Math.abs(numbersAverage - fAverage);

        System.out.printf("F1 result: %.2f; F2 result: %.2f; Diff: %.2f", f1, f2, diff);
    }
}
