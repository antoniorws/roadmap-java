package com.basic.atributos.protegido;

public class Cachorro extends Animal {

    public void setNome(String novoNome) {
        super.nome = novoNome; // podemos acessar o atributo protegido 'nome' aqui
    }

}
