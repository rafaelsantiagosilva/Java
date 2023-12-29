package com.mycompany;

public class Mamifero extends Animal {
     protected String corPelo;

     public Mamifero(float peso, int idade, int membros, String corDoPelo){
          this.peso = peso;
          this.idade = idade;
          this.membros = membros;
          this.corPelo = corDoPelo;
     }

     @Override
     public void locomover() {
          System.out.println("Correndo!");
     }

     @Override
     public void alimentar() {
          System.out.println("Mamando!");
     }

     @Override
     public void emitirSom() {
          System.out.println("Som de Mamífero!");
     }
     
     public String getCorPelo() {
          return corPelo;
     }

     public void setCorPelo(String corPelo) {
          this.corPelo = corPelo;
     }
}
