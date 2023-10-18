package com.basic.lists;

import java.util.ArrayList;
import java.util.List;

public class ListExemploString {
    public static void main(String[] args) {
        List<String> frutas = new ArrayList<>();

        frutas.add("Maçã");
        frutas.add("Banana");
        frutas.add("Laranja");

        for (String fruta : frutas) {
            System.out.println(fruta);
        }

    }
}
