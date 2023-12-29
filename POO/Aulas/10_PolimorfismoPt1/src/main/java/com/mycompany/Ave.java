package com.mycompany;

public class Ave extends Animal {
     private String corPena;

     public Ave(float peso, int idade, int membros, String corDaPena){
          this.peso = peso;
          this.idade = idade;
          this.membros = membros;
          this.corPena = corDaPena;
     }

     @Override
     public void locomover() {
          System.out.println("Voando!");
     }

     @Override
     public void alimentar() {
          System.out.println("Comendo frutas!");
     }

     @Override
     public void emitirSom() {
          System.out.println("Som de ave!");
     }

     public String getCorPena() {
          return corPena;
     }

     public void setCorPena(String corPena) {
          this.corPena = corPena;
     }
}
