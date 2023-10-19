package com.basic.lambdas;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaExemplos {

    public static void main(String[] args) {
        System.out.println("Ordenando uma lista de Strings");

        List<String> nomes = Arrays.asList("Bob", "Charlie", "Alice", "David");

        // Usando uma expressão lambda para ordenar
        Collections.sort(nomes, (a, b) -> a.compareTo(b));
        System.out.println(nomes); // [Alice, Bob, Charlie, David]

        System.out.println("Filtrando elementos de uma lista");

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);

        // Usando uma expressão lambda para filtrar números pares
        List<Integer> pares = numeros.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());

        System.out.println(pares);
    }
}
