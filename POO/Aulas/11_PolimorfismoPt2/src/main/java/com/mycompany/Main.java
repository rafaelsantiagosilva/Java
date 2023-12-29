package com.mycompany;

public class Main {
    public static void main(String[] args) {
        Lobo lobinho = new Lobo();
        lobinho.emitirSom();

        Cachorro caozinho = new Cachorro();
        caozinho.emitirSom();
        caozinho.reagir(11, 45);
        caozinho.reagir(true);
        caozinho.reagir(false);
        caozinho.reagir("Ola");
        caozinho.reagir("Se liga na glock");
        caozinho.reagir(2, 12f);
        caozinho.reagir(17, 4.5f);
    }
}