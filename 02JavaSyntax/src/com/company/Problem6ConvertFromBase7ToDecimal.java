package com.company;

import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

/**
 * Created by Dyno on 23.3.2016 г..
 */
public class Problem6ConvertFromBase7ToDecimal {
    public static void ConvertFromBase7ToDecimal()
    {

        Scanner console = new Scanner(System.in);

        int x = console.nextInt();
        String toBase7 = Integer.toString(x,7);
        System.out.println(toBase7);

    }
}
