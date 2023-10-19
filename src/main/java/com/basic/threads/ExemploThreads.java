package com.basic.threads;

public class ExemploThreads {
    public static void main(String[] args) {
        Thread fazerCafe = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Fazendo café");
                try {
                    Thread.sleep(1000); // Espere 1 segundo
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread prepararOvos = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Preparando ovos");
                try {
                    Thread.sleep(800); // Espere 0.8 segundos
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        // Iniciar as Threads
        fazerCafe.start();
        prepararOvos.start();

        // Aguardar até que ambas as Threads terminem
        try {
            fazerCafe.join();
            prepararOvos.join();
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Terminar a refeição
        System.out.println("Café da manhã está pronto!");
    }
}
