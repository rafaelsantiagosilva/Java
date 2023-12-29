package com.mycompany;

public class Main {
    public static void main(String[] args) {
        // Animal novoAnimal = new Animal(); Errado pois é abstrata
        Mamifero novoMamifero = new Mamifero(35.3f, 6, 4, "Marrom");
        Reptil novoReptil = new Reptil(25.2f, 7, 4, "Verde");
        Peixe novoPeixe = new Peixe(4.5f, 2, 0, "Azul");
        Ave novaAve = new Ave(10f, 5, 4, "Vermelha");

        novoMamifero.alimentar();
        novaAve.locomover();
        novoPeixe.emitirSom();
        novoReptil.locomover();

        Canguru novoCanguru = new Canguru(45.6f, 8, 4, "Marrom Claro");
        novoCanguru.locomover();

        Cachorro novoCachorro = new Cachorro(20.4f, 1, 4, "Caramelo");
        novoCachorro.emitirSom();
    }
}