package com.mycompany;

import java.util.Random;

public class Luta {
     // Atributos
     private Lutador desafiado;
     private Lutador desafiante;
     private int rounds;
     private boolean aprovada;

     // Métodos públicos
     public void marcarLuta(Lutador lutador1, Lutador lutador2) {
          if (lutador1.getCategoria().equals(lutador2.getCategoria())
                    && lutador1 != lutador2) {
               setAprovada(true);
               setDesafiado(lutador1);
               setDesafiante(lutador2);
          } else {
               setAprovada(false);
               setDesafiado(null);
               setDesafiante(null);
          }
     }

     public void lutar() {
          if (isAprovada()) {
               System.out.println("\n### DESAFIADO ###");
               getDesafiado().apresentar();
               System.out.println("\n### DESAFIANTE ###");
               getDesafiante().apresentar();
               Random rand = new Random();
               int vencedor = rand.nextInt(3); // 0 1 2
               switch (vencedor) {
                    case 0:
                         System.out.println("\nEMPATE!");
                         getDesafiado().empatarLuta();
                         getDesafiante().empatarLuta();
                         break;
                    case 1:
                         System.out.println("\nVitória do " + getDesafiado().getNome());
                         getDesafiado().ganharLuta();
                         getDesafiante().perderLuta();
                         break;
                    case 2:
                         System.out.println("\nVitória do " + getDesafiante().getNome());
                         getDesafiante().ganharLuta();
                         getDesafiado().perderLuta();
                         break;
                    default:
                         System.out.println("\n!!!!!!!!!!!\nLUTA DESCLASSIFICADA!!!!!");
                         break;
               }
          } else {
               System.out.println("A luta não pode acontecer!");
          }
     }

     // Métodos especiais
     public Lutador getDesafiado() {
          return desafiado;
     }

     public Lutador getDesafiante() {
          return desafiante;
     }

     public int getRounds() {
          return rounds;
     }

     public boolean isAprovada() {
          return aprovada;
     }

     public void setDesafiado(Lutador desafiado) {
          this.desafiado = desafiado;
     }

     public void setDesafiante(Lutador desafiante) {
          this.desafiante = desafiante;
     }

     public void setRounds(int rounds) {
          this.rounds = rounds;
     }

     public void setAprovada(boolean aprovada) {
          this.aprovada = aprovada;
     }
}
