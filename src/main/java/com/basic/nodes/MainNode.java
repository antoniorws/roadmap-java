package com.basic.nodes;

public class MainNode {

    public static void main(String[] args) {
        Node meuNode = new Node(42);
        Node novoNode = new Node(55);
        meuNode.proximo = novoNode; // Atualiza a conexão para o próximo Node
        meuNode.proximo = meuNode.proximo.proximo; // Remove o Node com valor 55

        Node currentNode = meuNode;
        while (currentNode != null) {
            if (currentNode.dado == 42) {
                System.out.println("Encontrado o Node com valor 42!");
                break;
            }
            currentNode = currentNode.proximo;
        }
    }
}
