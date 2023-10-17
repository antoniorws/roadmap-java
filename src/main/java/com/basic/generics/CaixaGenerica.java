package com.basic.generics;

public class CaixaGenerica<T> {
    private T conteudo;

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T novoConteudo) {
        conteudo = novoConteudo;
    }
}