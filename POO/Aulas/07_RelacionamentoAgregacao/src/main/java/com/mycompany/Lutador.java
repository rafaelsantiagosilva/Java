package com.mycompany;

import java.util.Calendar;

public class Lutador implements AcoesLutador {
     // Objeto da classe importada
     Calendar data = Calendar.getInstance();

     // Constantes
     int anoAtual = data.get(Calendar.YEAR);

     // Atributos
     private String nome;
     private String nacionalidade;
     private int anoDeNascimento;
     private int idade;
     private float altura;
     private float peso;
     private String categoria;
     private int vitorias;
     private int derrotas;
     private int empates;

     // Métodos da Interface
     public void apresentar() {
          System.out.printf("\n------------ Lutador ------------\n");
          System.out.printf("Nome: " + this.getNome() + "\n");
          System.out.printf("Origem: %s\n", this.getNacionalidade());
          System.out.printf("Idade: %d anos\n", this.getIdade());
          System.out.printf("Altura: %.2fm\n", this.getAltura());
          System.out.printf("Pesando: %.2fkg\n", this.getPeso());
          System.out.printf("Categoria: %s\n", this.getCategoria());
          System.out.print("--------------------------------");
     }

     public void status() {
          System.out.printf("\n------------ Lutador ------------\n");
          System.out.printf("Nome: %s", this.getNome());
          System.out.printf("\nCategoria: %s", this.getCategoria());
          System.out.printf("\nVitórias: %d", this.getVitorias());
          System.out.printf("\nDerrotas: %d", this.getDerrotas());
          System.out.printf("\nEmpates: %d", this.getEmpates());
          System.out.printf("\n---------------------------------\n");
     }

     public void ganharLuta() {
          this.setVitorias(getVitorias() + 1);
     }

     public void perderLuta() {
          this.setDerrotas(getDerrotas() + 1);
     }

     public void empatarLuta() {
          this.setEmpates(getEmpates() + 1);
     }

     // Métodos especiais

     // Constructor
     public Lutador(String nome, String nacionalidade, int anoDeNascimento, float altura, float peso,
               int vitorias, int derrotas, int empates) {
          this.setNome(nome);
          this.setNacionalidade(nacionalidade);
          this.setAnoDeNascimento(anoDeNascimento);
          this.setIdade(anoAtual - this.getAnoDeNascimento());
          this.setAltura(altura);
          this.setPeso(peso);
          this.setCategoria();
          this.setVitorias(vitorias);
          this.setDerrotas(derrotas);
          this.setEmpates(empates);
     }

     // Getters
     public String getNome() {
          return this.nome;
     }

     public String getNacionalidade() {
          return this.nacionalidade;
     }

     public int getAnoDeNascimento() {
          return this.anoDeNascimento;
     }

     public int getIdade() {
          return this.idade;
     }

     public float getAltura() {
          return this.altura;
     }

     public float getPeso() {
          return this.peso;
     }

     public String getCategoria() {
          return this.categoria;
     }

     public int getVitorias() {
          return this.vitorias;
     }

     public int getDerrotas() {
          return this.derrotas;
     }

     public int getEmpates() {
          return this.empates;
     }

     // Setters
     public void setNome(String nome) {
          this.nome = nome;
     }

     public void setNacionalidade(String nacionalidade) {
          this.nacionalidade = nacionalidade;
     }

     public void setAnoDeNascimento(int anoDeNascimento) {
          this.anoDeNascimento = anoDeNascimento;
     }

     public void setIdade(int idade) {
          this.idade = idade;
     }

     public void setAltura(float altura) {
          this.altura = altura;
     }

     public void setPeso(float peso) {
          this.peso = peso;
     }

     public void setCategoria() {
          float peso = this.getPeso();
          if (peso < 52.2) {
               this.categoria = "INVÁLIDO";
          } else if (peso <= 70.3) {
               this.categoria = "LEVE";
          } else if (peso <= 83.9) {
               this.categoria = "MÉDIO";
          } else if (peso <= 120.2) {
               this.categoria = "PESADO";
          } else {
               categoria = "INVÁLIDO";
          }
     }

     public void setVitorias(int vitorias) {
          this.vitorias = vitorias;
     }

     public void setDerrotas(int derrotas) {
          this.derrotas = derrotas;
     }

     public void setEmpates(int empates) {
          this.empates = empates;
     }
}