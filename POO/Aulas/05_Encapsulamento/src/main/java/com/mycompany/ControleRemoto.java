package com.mycompany;

public class ControleRemoto implements Controlador {
     // Atributos
     private int volume;
     private boolean ligado;
     private boolean tocando;

     public void ligar() {
          if (!this.isLigado()) {
               setLigado(true);
          } else {
               System.out.println("Já está ligado!");
          }
     }

     public void desligar() {
          if (this.isLigado()) {
               setLigado(false);
          } else {
               System.out.println("Já está desligado!");
          }
     }

     public void abrirMenu() {
          System.out.println("Ligado: " + this.isLigado());
          System.out.println("Tocando: " + this.isTocando());
          System.out.print("Volume: " + this.getVolume());
          for (int i = 0; i <= this.getVolume(); i++) {
               System.out.print("[]");
          }
     }

     public void fecharMenu() {
          System.out.println("Fechando menu...");
     }

     public void maisVolume() {
          if (this.isLigado() && this.getVolume() < 100) {
               this.setVolume(this.getVolume() + 5);
          } else {
               System.out.println("Impossível aumentar o volume!");
          }
     }

     public void menosVolume() {
          if (this.isLigado() && this.getVolume() > 0) {
               this.setVolume(this.getVolume() - 5);
          } else {
               System.out.println("Impossível diminuir o volume!");
          }
     }

     public void ligarMudo() {
          if (this.isLigado() && this.getVolume() > 0) {
               this.setVolume(0);
          } else {
               System.out.println("Impossível ligar o mudo!");
          }
     }

     public void desligarMudo() {
          if (this.isLigado() && this.getVolume() == 0) {
               this.setVolume(50);
          } else {
               System.out.println("Impossível desligar o mudo!");
          }
     }

     public void play() {
          if (this.isLigado() && !this.isTocando()) {
               this.setTocando(true);
          } else {
               System.out.println("Impossível dar play!");
          }
     }

     public void pause() {
          if (this.isLigado() && this.isTocando()) {
               this.setTocando(false);
          } else {
               System.out.println("Impossível pausar!");
          }
     }

     // Métodos especiais

     // Construtor
     public ControleRemoto() {
          this.volume = 50;
          this.ligado = false;
          this.tocando = false;
     }

     // Getters
     public int getVolume() {
          return this.volume;
     }

     public boolean isLigado() {
          return this.ligado;
     }

     public boolean isTocando() {
          return this.tocando;
     }

     // Setters
     public void setVolume(int volume) {
          this.volume = volume;
     }

     public void setLigado(boolean ligado) {
          this.ligado = ligado;
     }

     public void setTocando(boolean tocando) {
          this.tocando = tocando;
     }
}
