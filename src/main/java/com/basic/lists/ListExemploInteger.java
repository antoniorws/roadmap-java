package com.basic.lists;

import java.util.ArrayList;
import java.util.List;

public class ListExemploInteger {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();

        // Adicionar elementos à lista
        numeros.add(5);
        numeros.add(10);
        numeros.add(15);

        // Acessar elementos da lista
        System.out.println(numeros.get(0));
        System.out.println(numeros.get(1));
        System.out.println(numeros.get(2));

        // Tamnho da lista
        System.out.println("Tamanho da lista: " + numeros.size());

        // Remover elemento com valor 10
        numeros.remove(Integer.valueOf(10));

        for (Integer numero : numeros) {
            System.out.println(numero);
        }

    }
}
