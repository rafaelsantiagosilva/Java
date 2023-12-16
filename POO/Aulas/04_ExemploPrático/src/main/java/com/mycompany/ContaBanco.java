package com.mycompany;

import java.util.Random;

public class ContaBanco {
     // Atributos/Propriedades
     private int numero;
     private String dono;
     protected String tipo;
     private float saldo;
     private boolean status;
     private int vezes_que_foi_aberta = 0;

     // Constructor
     public ContaBanco() {
          set_numero();
          this.saldo = 0;
          this.status = false;
     }

     // Métodos específicos
     public void abrirConta() {
          boolean erro = false;
          float saldo_inicial = 0;
          if (!this.status) {
               if (this.vezes_que_foi_aberta == 0) {
                    switch (this.tipo) {
                         case "c":
                              saldo_inicial = 50;
                              break;

                         case "p":
                              saldo_inicial = 150;
                              break;

                         default:
                              System.out.println("\nERRO: Tipo não encontrado!");
                              erro = true;
                              break;
                    }
                    if (!erro) {
                         this.status = true;
                         this.saldo += saldo_inicial;
                         System.out.printf("\nConta aberta com sucesso! Depósito inicial gratuito de R$%.2f\n",
                                   this.saldo);
                         System.out.printf("Saldo atual: R$%.2f", this.saldo);
                    }
               } else {
                    this.status = true;
                    System.out.println("\nConta aberta com sucesso!");
               }

               this.vezes_que_foi_aberta++;
          } else {
               System.out.println("ERRO: A conta já está aberta!");
          }

     }

     public boolean verificarFecharConta() {
          boolean erro = false;
          if (this.saldo > 0) {
               erro = true;
               System.out.println("\nERRO: Você precisa terminar de gastar seu saldo para fechar a conta!");
               System.out.printf("Saldo atual: R$%.2f\n", this.saldo);
          }

          if (this.saldo < 0) {
               erro = true;
               System.out.println("\nERRO: Você precisa terminar de pagar suas dívidas para fechar a conta!");
               System.out.printf("Saldo atual: R$%.2f\n", this.saldo);
          }

          return (!erro);
     }

     public void fecharConta() {
          if (verificarFecharConta()) {
               if (this.status) {
                    this.status = false;
                    System.out.println("\nConta fechada com sucesso!");
               } else {
                    System.out.printf("\nA conta de número %d já está fechada!\n", this.numero);
               }
          }
     }

     public void depositar(float valor) {
          if (this.status) {
               this.saldo += valor;
               System.out.println("\nDepósito realizado com sucesso!");
               System.out.printf("Saldo atual: R$%.2f", this.saldo);
          } else {
               System.out.println("\nERRO: A conta está fechada!");
          }
     }

     public void sacar(float valor) {
          if (this.status) {
               if (valor <= this.saldo) {
                    this.saldo -= valor;
                    System.out.println("\nSaque realizado com sucesso!");
                    System.out.printf("Saldo atual: R$%.2f", this.saldo);
               } else {
                    System.out.println("\nERRO: Valor acima do permitido!");
                    System.out.printf("Saldo atual: R$%.2f", this.saldo);
               }
          } else {
               System.out.println("\nERRO: A conta está fechada!");
          }

     }

     public float pagarMensal() {
          float tarifa = 0;

          if (this.status) {
               tarifa = this.get_tarifa();

               this.saldo -= tarifa;
               System.out.printf("\nTarifa de R$%.2f paga!\n", tarifa);
               System.out.printf("Saldo atual: R$%.2f", this.saldo);

          } else {
               System.out.println("\nERRO: A conta está fechada!");
          }

          return (tarifa);
     }

     // Setters
     public void set_numero() {
          Random gerador_de_numeros = new Random();
          this.numero = gerador_de_numeros.nextInt(500) + 1;
     }

     public void set_dono(String nome) {
          this.dono = nome;
     }

     public void set_tipo(String tipo) {
          this.tipo = tipo;
     };

     public void set_saldo(float saldo) {
          this.saldo = saldo;
     }

     public void set_status(boolean status) {
          this.status = status;
     }

     // Getters
     public int get_numero() {
          return (this.numero);
     }

     public String get_dono() {
          return (this.dono);
     }

     public String get_tipo() {
          return (this.tipo);
     }

     public float get_saldo() {
          return (this.saldo);
     }

     public float get_tarifa() {
          if (this.tipo.equals("c")) {
               return (12);
          } else {
               return (20);
          }
     }

     public boolean get_status() {
          return (this.status);
     }

     // Imprimir todas as informações
     public void imprimir_informações() {
          System.out.println("\n\n===============Informações da Conta===============");
          System.out.println("Nome do dono: " + this.get_dono());
          System.out.println("Número da conta: " + this.get_numero());
          System.out.print("Tipo: ");
          if (get_tipo().equals("c")) {
               System.out.println("Corrente");
          } else {
               System.out.println("Poupança");
          }
          System.out.println("Saldo: R$" + this.get_saldo());
          System.out.println("Tarifa mensal: R$" + this.get_tarifa());
          System.out.print("Status: ");
          if (this.get_status()) {
               System.out.println("Aberta");
          } else {
               System.out.println("Fechada");
          }
          System.out.println("==================================================");

     }
}