package com.mycompany;

import java.util.Scanner;

public class Visualizacao {
     private Gafanhoto espectador;
     private Video filme;

     // Métodos
     public void avaliar() {
          Scanner scan = new Scanner(System.in);
          System.out.print("Digite um comentário: ");
          String comentario = scan.next();
          System.out.println("Comentário adicionado!\n" + comentario);
     }

     public void avaliar(float nota) {
          filme.setAvaliacao((filme.getAvaliacao() + nota) / 2);
          System.out.println("Filme avaliado!\nNova nota: " + filme.getAvaliacao());
     }

     public void avaliar(int porcetangem) {
          filme.setAvaliacao(filme.getAvaliacao() * porcetangem / 100);
          System.out.println("Filme avaliado!\nNova nota: " + filme.getAvaliacao());
     }

     // Métodos especiais

     // Constructor
     public Visualizacao(Gafanhoto espectador, Video filme) {
          this.espectador = espectador;
          this.filme = filme;
     }

     // Getters e Setters
     public Gafanhoto getEspectador() {
          return espectador;
     }

     public void setEspectador(Gafanhoto espectador) {
          this.espectador = espectador;
     }

     public Video getFilme() {
          return filme;
     }

     public void setFilme(Video filme) {
          this.filme = filme;
     }
}
