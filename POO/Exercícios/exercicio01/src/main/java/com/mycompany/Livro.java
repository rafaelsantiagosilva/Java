package com.mycompany;

import java.util.Scanner;

public class Livro implements Publicacao {
     // Scanner
     Scanner scan = new Scanner(System.in);

     // Atributos
     private String titulo;
     private String autor;
     private int totalDePaginas;
     private int paginaAtual;
     private boolean aberto;

     // Métodos publicos
     public void detalhes() {
          System.out.println("\n---------- Informações sobre o livro atual ----------");
          System.out.println("Título: " + getTitulo());
          System.out.println("Autor: " + getAutor());
          System.out.println("Total de páginas: " + getTotalDePaginas());
          System.out.println("Página atual: " + getPaginaAtual());
          System.out.print("Ele está ");
          if (isAberto()) {
               System.out.println("ABERTO");
          } else {
               System.out.println("FECHADO");
          }
          System.out.println("-----------------------------------------------------");
     }

     // Métodos da Interface
     public void abrir() {
          if (!isAberto()) {
               setAberto(true);
               System.out.println("\nO livro foi aberto!");
          } else {
               System.out.println("\nO livro já está aberto!");
          }
     }

     public void fechar() {
          if (isAberto()) {
               setAberto(false);
               System.out.println("\nO livro foi fechado!");
          } else {
               System.out.println("\bO livro já está fechado!");
          }
     }

     public void folhear() {
          int opcao = 0;

          if (!isAberto()) {
               System.out.println("\nImpossível folhear! Ele está fechado!");
          } else {
               System.out.println("\nOk. Você deseja folhear para atrás[0] ou para frente[1]?\nR: ");
               opcao = scan.nextInt();
               while (opcao != 0 && opcao != 1) {
                    System.out.print("\nPor favor, digite uma opção válida!: ");
                    opcao = scan.nextInt();
               }
               ;
               if (opcao == 0) {
                    if (getPaginaAtual() > 0) {
                         setPaginaAtual(getPaginaAtual() - 1);
                         System.out.println("\nFoi voltada uma página!");
                    } else {
                         System.out.println("\nImpossível voltar mais! O livro nem começou!");
                    }
                    System.out.println("Página atual: " + getPaginaAtual());
               } else {
                    if (getPaginaAtual() < getTotalDePaginas()) {
                         setPaginaAtual(getPaginaAtual() + 1);
                         System.out.println("\nFoi avançada uma página!");
                    } else {
                         System.out.println("\nImpossível avançar mais! O livro já acabou!");
                    }
                    System.out.println("Página atual: " + getPaginaAtual());
               }
          }

     }

     public void avancarPagina() {
          if (isAberto()) {
               System.out.println("\nQuantas páginas você deseja avançar?");
               System.out.println("Página atual: " + getPaginaAtual());
               System.out.print("R: ");
               int quantidadeDePaginas = scan.nextInt();

               while (quantidadeDePaginas > (getTotalDePaginas() - getPaginaAtual())) {
                    System.out.print("Por favor, insira um valor válido!\nR:");
                    quantidadeDePaginas = scan.nextInt();
               }

               setPaginaAtual(getPaginaAtual() + quantidadeDePaginas);
               System.out.println("\nForam avançadas " + quantidadeDePaginas + " páginas!");
               System.out.println("Página atual: " + getPaginaAtual());
          } else {
               System.out.println("\nO livro está fechado!");
          }
     }

     public void voltarPagina() {
          if (isAberto()) {
               System.out.println("\nQuantas páginas você deseja voltar?");
               System.out.println("Página atual: " + getPaginaAtual());
               System.out.print("R: ");
               int quantidadeDePaginas = scan.nextInt();

               while (quantidadeDePaginas > getPaginaAtual()) {
                    System.out.print("Por favor, insira um valor válido!\nR:");
                    quantidadeDePaginas = scan.nextInt();
               }

               setPaginaAtual(getPaginaAtual() - quantidadeDePaginas);
               System.out.println("\nForam voltadas " + quantidadeDePaginas + " páginas!");
               System.out.println("Página atual: " + getPaginaAtual());
          } else {
               System.out.println("\nO livro está fechado!");
          }
     }

     public void cadastrar() {

     }

     // Métodos especiais

     // Construtor
     public Livro(String titulo, String autor, int totalDePaginas, int paginaAtual) {
          setTitulo(titulo);
          setAutor(autor);
          setTotalDePaginas(totalDePaginas);
          setPaginaAtual(0);
          setAberto(false);
     }

     // Getters
     public String getTitulo() {
          return titulo;
     }

     public String getAutor() {
          return autor;
     }

     public int getTotalDePaginas() {
          return totalDePaginas;
     }

     public int getPaginaAtual() {
          return paginaAtual;
     }

     public boolean isAberto() {
          return aberto;
     }

     // Setters
     public void setTitulo(String titulo) {
          this.titulo = titulo;
     }

     public void setAutor(String autor) {
          this.autor = autor;
     }

     public void setTotalDePaginas(int totalDePaginas) {
          this.totalDePaginas = totalDePaginas;
     }

     public void setPaginaAtual(int paginaAtual) {
          this.paginaAtual = paginaAtual;
     }

     public void setAberto(boolean aberto) {
          this.aberto = aberto;
     }
}