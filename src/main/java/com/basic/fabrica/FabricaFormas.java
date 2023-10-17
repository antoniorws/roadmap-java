package com.basic.fabrica;

public class FabricaFormas {
    public static Forma criarForma(String tipo) {
        if (tipo.equalsIgnoreCase("circulo")) {
            return new Circulo();
        } else if (tipo.equalsIgnoreCase("quadrado")) {
            return new Quadrado();
        } else {
            throw new IllegalArgumentException("Tipo de forma inválido.");
        }
    }
}
