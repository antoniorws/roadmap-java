package com.basic.hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExemplo {
    public static void main(String[] args) {
        Set<String> nomes = new HashSet<>();
        nomes.add("Lucas");
        nomes.add("Lucas"); // valor repetido
        nomes.add("Rodrigo");
        nomes.add("Antonio");
        nomes.add("Serra");

        // print 1
        Iterator<String> namesIterator = nomes.iterator();

        while (namesIterator.hasNext()) {
            String name = namesIterator.next();
            System.out.println(name);
        }

        // print 2
        nomes.forEach(n -> {
            System.out.println(n);
        });

        /*
         * Print console (Lucas não apareceu duas vezes)
         * Lucas
         * Rodrigo
         * Antonio
         * Serra
         */
    }
}
