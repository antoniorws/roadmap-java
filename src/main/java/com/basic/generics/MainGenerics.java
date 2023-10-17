package com.basic.generics;

public class MainGenerics {
    public static void main(String[] args) {
        // Vamos criar uma caixa mágica para maçãs 🍏!
        CaixaGenerica<String> caixaDeMacas = new CaixaGenerica<>();
        caixaDeMacas.setConteudo("Uma maçã verde");
        String maca = caixaDeMacas.getConteudo();
        System.out.println("Conteúdo da caixa de maçãs: " + maca);

        // Agora, uma caixa mágica para bananas 🍌!
        CaixaGenerica<Integer> caixaDeBananas = new CaixaGenerica<>();
        caixaDeBananas.setConteudo(5);
        int quantidadeDeBananas = caixaDeBananas.getConteudo();
        System.out.println("Quantidade de bananas na caixa: " + quantidadeDeBananas);
    }
}
