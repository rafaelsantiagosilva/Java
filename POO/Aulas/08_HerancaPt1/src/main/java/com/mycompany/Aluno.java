package com.mycompany;

public class Aluno extends Pessoa /* Filha da classe pessoa */ {
     // Atributos
     private int numeroMatricula;
     private String curso;

     // Métodos
     public void cancelarMatricula() {
          System.out.println("Matrícula será cancelada!");
     }

     // Métodos especiais
     public int getNumeroMatricula() {
          return numeroMatricula;
     }

     public String getCurso() {
          return curso;
     }

     public void setNumeroMatricula(int numeroMatricula) {
          this.numeroMatricula = numeroMatricula;
     }

     public void setCurso(String curso) {
          this.curso = curso;
     }
}
