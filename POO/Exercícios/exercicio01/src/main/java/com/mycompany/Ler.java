package com.mycompany;

import java.util.Scanner;

public class Ler {
     Scanner scan = new Scanner(System.in);

     // Atributos
     private int paginaMarcada;
     private Livro livroSelecionado;
     private Pessoa leitor;

     // Métodos públicos
     public void comecarALer() {
          int opcao = 0;

          System.out.println("------------ Lendo... ------------");
          do {
               System.out.println("1) Abrir livro");
               System.out.println("2) Fechar livro");
               System.out.println("3) Avançar páginas");
               System.out.println("4) Voltar páginas");
               System.out.println("5) Folhear");
               System.out.println("6) Marcar página");
               System.out.println("7) Mostrar informações do livro");
               System.out.println("8) Parar de ler");
               System.out.print("R: ");
               opcao = scan.nextInt();

               switch (opcao) {
                    case 1:
                         getLivroSelecionado().abrir();
                         break;
                    case 2:
                         getLivroSelecionado().fechar();
                         break;
                    case 3:
                         getLivroSelecionado().avancarPagina();
                         break;
                    case 4:
                         getLivroSelecionado().voltarPagina();
                         break;
                    case 5:
                         getLivroSelecionado().folhear();
                         break;
                    case 6:
                         int pagina = getLivroSelecionado().getPaginaAtual();
                         System.out.println("\nA página " + pagina + " foi marcada!");
                         break;
                    case 7:
                         getLivroSelecionado().detalhes();
                         break;
                    default:
                         System.out.println("\nDigite uma opção correta! ");
                         break;
               }
          } while (opcao != 8);

          System.out.println("----------------------------------");
     }

     // Métodos especiais
     // Construtor
     public Ler(Pessoa pessoa, Livro livro) {
          setPaginaMarcada(0);
          setLivroSelecionado(livro);
          setLeitor(pessoa);
     }

     // Getters
     public int getPaginaMarcada() {
          return paginaMarcada;
     }

     public Livro getLivroSelecionado() {
          return livroSelecionado;
     }

     public Pessoa getLeitor() {
          return leitor;
     }

     // Setters
     public void setPaginaMarcada(int paginaMarcada) {
          this.paginaMarcada = paginaMarcada;
     }

     public void setLivroSelecionado(Livro livroSelecionado) {
          this.livroSelecionado = livroSelecionado;
     }

     public void setLeitor(Pessoa leitor) {
          this.leitor = leitor;
     }
}
