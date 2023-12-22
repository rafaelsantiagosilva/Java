package com.mycompany;

public class Professor extends Pessoa /* Filha da classe Pessoa */ {
     // Atributos
     private String especialidade;
     private float salario;

     // Métodos
     public void receberAumento(float aumento) {
          setSalario(getSalario() + aumento);
     }

     // Métodos especiais
     public String getEspecialidade() {
          return especialidade;
     }

     public float getSalario() {
          return salario;
     }

     public void setEspecialidade(String especialidade) {
          this.especialidade = especialidade;
     }

     public void setSalario(float salario) {
          this.salario = salario;
     }

}
