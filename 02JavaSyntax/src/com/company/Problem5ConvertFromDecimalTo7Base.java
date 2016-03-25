package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Dyno on 23.3.2016 г..
 */
public class Problem5ConvertFromDecimalTo7Base {
    public static void ConvertDecimalTo7Base(){

        Scanner console = new Scanner(System.in);

        String base7 = console.nextLine();
        char[] base7array = base7.toCharArray();
        int result = 0, digit;
        for (int i = 0; i<base7array.length; i++)
        {
            digit = Integer.parseInt(String.valueOf(base7array[i]));
            result += digit;
            if (i == base7array.length -1){
                break;
            }
            result *= 7;
        }
        System.out.println(result);
    }
}
