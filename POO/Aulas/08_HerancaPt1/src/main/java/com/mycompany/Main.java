package com.mycompany;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoas0 = new Pessoa();
        Aluno pessoas1 = new Aluno();
        Professor pessoas2 = new Professor();
        Funcionario pessoas3 = new Funcionario();

        pessoas0.setNome("Pedro");
        pessoas1.setNome("Maria");
        pessoas2.setNome("Cláudio");
        pessoas3.setNome("Fabiana");

        pessoas0.setSexo("Maculino");
        pessoas1.setSexo("Feminino");
        pessoas2.setSexo("Masculino");
        pessoas3.setSexo("Feminino");

        pessoas0.setIdade(25);
        pessoas1.setIdade(18);
        pessoas2.setIdade(50);
        pessoas3.setIdade(32);

        pessoas1.setCurso("Informática");
        pessoas2.setSalario(2500.75f);
        pessoas3.setSetor("Estoque");

        System.out.println(pessoas0.toString());
        System.out.println(pessoas1.toString());
        System.out.println(pessoas2.toString());
        System.out.println(pessoas3.toString());
    }
}