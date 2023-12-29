package com.mycompany;

public class Cachorro extends Mamifero {

     public Cachorro(float peso, int idade, int membros, String corDoPelo){
          super(peso, idade, membros, corDoPelo);
     }

     @Override
     public void locomover() {
          System.out.println("Andando!");
     }

     @Override
     public void emitirSom() {
          System.out.println("AuAu!");
     }
}
