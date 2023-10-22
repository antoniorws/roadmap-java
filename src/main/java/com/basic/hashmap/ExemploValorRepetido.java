package com.basic.hashmap;

import java.util.HashMap;
import java.util.Map;

public class ExemploValorRepetido {
    public static void main(String[] args) {
        Map<String, Integer> mapaDeIdades = new HashMap<>();

        // Fazendo put da mesma chave duas vezes mas com values diferentes
        mapaDeIdades.put("Alice", 25);
        mapaDeIdades.put("Alice", 2);

        for (int idade : mapaDeIdades.values()) {
            // O útltimo value é o que prevalece
            System.out.println("idade: " + idade); // saída: idade: 2
        }
    }
}
