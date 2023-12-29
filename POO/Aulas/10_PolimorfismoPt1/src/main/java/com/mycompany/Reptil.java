package com.mycompany;

public class Reptil extends Animal {
     protected String corEscama;

     public Reptil(float peso, int idade, int membros, String corDaEscama){
          this.peso = peso;
          this.idade = idade;
          this.membros = membros;
          this.corEscama = corDaEscama;
     }

     @Override
     public void locomover() {
          System.out.println("Rastejando!");
     }

     @Override
     public void alimentar() {
          System.out.println("Comer vegetais!");
     }

     @Override
     public void emitirSom() {
          System.out.println("Som de reptil!");
     }

     public String getCorEscama() {
          return corEscama;
     }

     public void setCorEscama(String corEscama) {
          this.corEscama = corEscama;
     }
}
