package com.basic.polimorfismo;

public class Retangulo implements Forma {
    private double lado;
    private double altura;

    public Retangulo(double lado, double altura) {
        this.lado = lado;
        this.altura = altura;
    }

    public double getLado() {
        return this.lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getAltura() {
        return this.altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return lado * altura;
    }

}
