package com.basic.poo;

public class MainPOO {

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("João", 25);

        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
    }
}
