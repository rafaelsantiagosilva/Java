package com.mycompany;

public class Main {
    public static void main(String[] args) {
        // Criando um array de objetos
        Lutador lutadores[] = new Lutador[6];

        lutadores[0] = new Lutador("Pretty Boy", "França", 1992, 1.75f, 68.9f, 11, 2, 1);
        lutadores[1] = new Lutador("Putsscript", "Brasil", 1995, 1.68f, 57.8f, 14, 2, 3);
        lutadores[2] = new Lutador("Snapshadow", "EUA", 1988, 1.65f, 80.9f, 12, 2, 1);
        lutadores[3] = new Lutador("Dead Code", "Austrália", 1995, 1.93f, 81.6f, 13, 0, 2);
        lutadores[4] = new Lutador("UF0Cobol", "Brasil", 1986, 1.70f, 119.3f, 5, 4, 3);
        lutadores[5] = new Lutador("Nerdaart", "EUA", 1993, 1.81f, 105.7f, 12, 2, 4);

        Luta UEC01 = new Luta();
        UEC01.marcarLuta(lutadores[0], lutadores[1]);
        UEC01.lutar();
    }
}