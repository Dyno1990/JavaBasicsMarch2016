package com.company;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by Dyno on 23.3.2016 г..
 */
public class Problem7RandomizeNumberBetweenMAndN {
    public static void RandomizeNumberBetweenMAndN(){
        Random random = new Random();
        Scanner console = new Scanner(System.in);
        int m = console.nextInt();
        int n = console.nextInt();
        int x = 0;

        if(m<n)
        {
            for (int i=0;i<(n-m); i++)
            {
                x = random.nextInt((n-m)+1)+m;
                System.out.printf("%d", x);
            }
        }
        else
        {
            for (int i=0;i<(m-n); i++)
            {
                x = random.nextInt((m-n)+1)+m;
                System.out.printf("%d", x);
            }
        }

    }
}
