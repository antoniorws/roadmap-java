package com.basic.scanner;

import java.util.Scanner;

public class ExemploScanner {
    public static void main(String[] args) {
        // Crie um objeto Scanner para ler a entrada do teclado
        Scanner scanner = new Scanner(System.in);

        // Solicite ao usuário que insira um número inteiro
        System.out.print("Digite um número inteiro: ");

        // Use o Scanner para ler o número digitado pelo usuário
        int numero = scanner.nextInt();

        // Exiba o número inserido pelo usuário
        System.out.println("Você digitou o número: " + numero);

        // Não se esqueça de fechar o Scanner quando não precisar mais dele
        scanner.close();
    }
}
