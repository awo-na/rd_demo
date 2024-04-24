package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        try {
            System.out.printf("Hello and welcome!");
        } catch (Exception e) {
            new RuntimeException(e);
        }
    }

}
