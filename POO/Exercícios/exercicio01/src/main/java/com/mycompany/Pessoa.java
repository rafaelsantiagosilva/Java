package com.mycompany;

public class Pessoa {
     // Atributos
     private String nome;
     private int idade;
     private String sexo;

     // Métodos publicos
     public void fazerAniversário() {
          setIdade(getIdade() + 1);
     }

     // Métodos especiais
     // Construtor
     public Pessoa(String nome, int idade, String sexo) {
          setNome(nome);
          setIdade(idade);
          setSexo(sexo);
     }

     // Getters
     public String getNome() {
          return nome;
     }

     public int getIdade() {
          return idade;
     }

     public String getSexo() {
          return sexo;
     }

     // Setters
     public void setNome(String nome) {
          this.nome = nome;
     }

     public void setIdade(int idade) {
          this.idade = idade;
     }

     public void setSexo(String sexo) {
          this.sexo = sexo;
     }
}
