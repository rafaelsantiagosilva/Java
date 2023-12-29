package com.mycompany;

public class Peixe extends Animal {
     protected String corDaEscama;

     public Peixe(float peso, int idade, int membros, String corDaEscama){
          this.peso = peso;
          this.idade = idade;
          this.membros = membros;
          this.corDaEscama = corDaEscama;
     }

     @Override
     public void locomover() {
          System.out.println("Nadando!");
     }

     @Override
     public void alimentar() {
          System.out.println("Comendo substâncias!");
     }

     @Override
     public void emitirSom() {
          System.out.println("Peixe não faz som!");
     }

     public void soltarBolhas() {
          System.out.println("GLUB GLUB GLUB!");
     }

     public String getCorDaEscama() {
          return corDaEscama;
     }

     public void setCorDaEscama(String corDaEscama) {
          this.corDaEscama = corDaEscama;
     }
}
