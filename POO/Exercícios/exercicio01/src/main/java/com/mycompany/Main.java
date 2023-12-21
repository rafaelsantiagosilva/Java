package com.mycompany;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoas[] = new Pessoa[100];
        Livro livros[] = new Livro[100];
        pessoas[0] = new Pessoa("Rafael", 15, "M");
        livros[0] = new Livro("Definitivamente um Livro", "Roberto, o autor", 100, 0);
        Ler leitura = new Ler(pessoas[0], livros[0]);
        leitura.comecarALer();
    }
}