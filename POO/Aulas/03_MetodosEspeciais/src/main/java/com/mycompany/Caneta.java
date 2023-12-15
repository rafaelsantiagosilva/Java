package com.mycompany;

public class Caneta {
     // Não pode acessar diretamente pelos atributos, somente por métodos
     private String modelo;
     private float ponta;
     private String cor;
     private boolean tampada;

     // Método construtor
     public Caneta(String modelo, String cor, float ponta) {
          this.modelo = modelo;
          this.ponta = ponta;
          this.tampar();
          this.cor = cor;
     }

     public String get_modelo() {
          return this.modelo;
     }

     public void set_modelo(String modelo) {
          this.modelo = modelo;
     }

     public float get_ponta() {
          return this.ponta;
     }

     public void set_ponta(float ponta) {
          this.ponta = ponta;
     }

     public void tampar() {
          this.tampada = true;
     };

     public void destampar() {
          this.tampada = false;

     };

     public void status() {
          System.out.println("SOBRE A CANETA:");
          System.out.println("Modelo: " + get_modelo());
          System.out.println("Ponta: " + get_ponta());
          System.out.println("Cor: "+ this.cor);
          System.out.println("Tampada: "+ this.tampada);
     }
}
