package com.mycompany;

public class Main {
    public static void main(String[] args) {
        ControleRemoto controle = new ControleRemoto();
        controle.ligar();
        controle.maisVolume();
        controle.play();
        controle.abrirMenu();
        controle.fecharMenu();
    }
}