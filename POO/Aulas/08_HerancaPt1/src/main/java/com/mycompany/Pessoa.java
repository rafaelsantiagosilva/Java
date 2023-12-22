package com.mycompany;

public class Pessoa {
     // Atributos
     private String nome;
     private int idade;
     private String sexo;

     // Métodos
     public void fazerAniversario() {
          setIdade(getIdade() + 1);
     }

     // Métodos especiais
     public String getNome() {
          return nome;
     }

     public int getIdade() {
          return idade;
     }

     public String getSexo() {
          return sexo;
     }

     public void setNome(String nome) {
          this.nome = nome;
     }

     public void setIdade(int idade) {
          this.idade = idade;
     }

     public void setSexo(String sexo) {
          this.sexo = sexo;
     }

     // Retornar todos os atributos e métodos da classe
     public String toString() {
          return "Pessoa{" + "nome=" + getNome() + ", idade=" + getIdade() + ", sexo=" + getSexo() + "}";
     }
}
