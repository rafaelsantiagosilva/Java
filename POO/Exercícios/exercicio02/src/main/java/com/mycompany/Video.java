package com.mycompany;

public class Video implements AcoesVideo {
     // Atributos
     private String titulo;
     private float avaliacao;
     private int views;
     private int curtidas;
     private boolean reproduzindo;

     // Métodos da interface
     public void play() {
          if (!isReproduzindo()) {
               setReproduzindo(true);
          } else {
               System.out.println("Já está reproduzindo!");
          }
     }

     public void pause() {
          if (isReproduzindo()) {
               setReproduzindo(false);     
          } else {
               System.out.println("Já está pausado!");
          }
     }

     public void like() {
          setCurtidas(this.curtidas + 1);
     }

     // Métodos especiais

     // Constructor
     public Video(String titulo, float avaliacao, int views, int curtidas) {
          this.titulo = titulo;
          this.avaliacao = avaliacao;
          this.views = views;
          this.curtidas = curtidas;
          this.reproduzindo = false;
     }

     // Getters e Setters
     public String getTitulo() {
          return titulo;
     }

     public void setTitulo(String titulo) {
          this.titulo = titulo;
     }

     public float getAvaliacao() {
          return avaliacao;
     }

     public void setAvaliacao(float avaliacao) {
          this.avaliacao = avaliacao;
     }

     public int getViews() {
          return views;
     }

     public void setViews(int views) {
          this.views = views;
     }

     public int getCurtidas() {
          return curtidas;
     }

     public void setCurtidas(int curtidas) {
          this.curtidas = curtidas;
     }

     public boolean isReproduzindo() {
          return reproduzindo;
     }

     public void setReproduzindo(boolean reproduzindo) {
          this.reproduzindo = reproduzindo;
     }
     
}
