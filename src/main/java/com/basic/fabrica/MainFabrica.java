package com.basic.fabrica;

public class MainFabrica {

    public static void main(String[] args) {
        Forma forma1 = FabricaFormas.criarForma("circulo");
        Forma forma2 = FabricaFormas.criarForma("quadrado");

        forma1.desenhar();
        forma2.desenhar();
    }

}
