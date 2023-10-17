package com.basic.heranca;

public class MainHeranca {
    public static void main(String[] args) {
        Cachorro meuCachorro = new Cachorro();
        meuCachorro.comer();// isso chama o método comer() da classe Animal.
        meuCachorro.latir();// isso chama o método latir() da classe Cachorro.
    }
}
