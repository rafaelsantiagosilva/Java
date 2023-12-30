package com.mycompany;

public class Gafanhoto extends Pessoa {
     // Atributos
     private String login;
     private int totalDeVideosAssistidos;

     // Métodos
     public void viuMaisUm() {
          setTotalDeVideosAssistidos(this.totalDeVideosAssistidos + 1);
     }

     // Métodos especiais

     // Constructor
     public Gafanhoto(String nome, int idade, String sexo, int experiencia, String login, int totalDeVideosAssistidos) {
          this.nome = nome;
          this.idade = idade;
          this.sexo = sexo;
          this.experiencia = experiencia;
          this.login = login;
          this.totalDeVideosAssistidos = totalDeVideosAssistidos;
     }

     // Getters e Setters
     public String getLogin() {
          return login;
     }

     public void setLogin(String login) {
          this.login = login;
     }

     public int getTotalDeVideosAssistidos() {
          return totalDeVideosAssistidos;
     }

     public void setTotalDeVideosAssistidos(int totalDeVideosAssistidos) {
          this.totalDeVideosAssistidos = totalDeVideosAssistidos;
     }
}
