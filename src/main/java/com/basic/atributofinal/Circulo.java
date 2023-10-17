package com.basic.atributofinal;

public class Circulo {
    final double PI = 3.14159265359; // uma constante final

    final void desenhar() {
        // este método não pode ser sobrescrito por subclasses
        System.out.println("Desenhando um círculo!");
    }
}
