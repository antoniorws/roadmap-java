package com.basic.nodes;

public class Node {
    int dado; // O dado armazenado no Node
    Node proximo; // A conexão para o próximo Node

    public Node(int dado) {
        this.dado = dado;
        this.proximo = null; // Inicialmente, não temos um próximo Node
    }
}
