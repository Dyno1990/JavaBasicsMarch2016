package com.company;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;


public class Main {

    private static final String FILE_PATH = "WorkFiles/users.txt";

    public static void main(String[] args) {

        File file = new File(FILE_PATH);
        BufferedReader reader = new BufferedReader(new FileReader(file));

    }
}
