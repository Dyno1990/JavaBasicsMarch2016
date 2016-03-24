package com.company;

import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

/**
 * Created by Dyno on 22.3.2016 г..
 */
public class Problem3FormatingNumbers {

    public static void FormatingNumbers(){
        int a;
        double b,c;
        Scanner console = new Scanner(System.in);
        a = console.nextInt();
        b = console.nextDouble();
        c = console.nextDouble();

        String HexA = Integer.toHexString(a);
        String BinA = Integer.toBinaryString(a);

        System.out.println(BinA);
        System.out.printf("|%-10s|%010d|%10.2f|%-10.3f|", HexA, BinA, b, c);

    }

}
