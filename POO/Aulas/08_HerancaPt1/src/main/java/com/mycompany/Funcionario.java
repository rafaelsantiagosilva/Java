package com.mycompany;

public class Funcionario extends Pessoa {
     // Atributos
     private String setor;
     private boolean trabalhando;

     // Métodos
     public void mudarTrabalho() {
          setTrabalhando(!isTrabalhando());
     }

     // Métodos especiais
     public String getSetor() {
          return setor;
     }

     public boolean isTrabalhando() {
          return trabalhando;
     }

     public void setSetor(String setor) {
          this.setor = setor;
     }

     public void setTrabalhando(boolean trabalhando) {
          this.trabalhando = trabalhando;
     }
}
