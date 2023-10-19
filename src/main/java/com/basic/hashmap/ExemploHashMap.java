package com.basic.hashmap;

import java.util.HashMap;

public class ExemploHashMap {
    public static void main(String[] args) {
        // Criando um HashMap de nomes e idades
        HashMap<String, Integer> mapaDeIdades = new HashMap<>();

        // Adicionando pares chave-valor ao HashMap11
        mapaDeIdades.put("Alice", 25);
        mapaDeIdades.put("Bob", 30);
        mapaDeIdades.put("Charlie", 28);

        // Acessando valores usando chave
        int idadeDaAlice = mapaDeIdades.get("Alice");
        System.out.println("Idade da Alice: " + idadeDaAlice);

        boolean temChaveBob = mapaDeIdades.containsKey("Bob");
        System.out.println("Tem a chave Bob? " + temChaveBob);

        mapaDeIdades.remove("Charlie");
        System.out.println("Tamanho do HashMap: " + mapaDeIdades.size());
    }
}
