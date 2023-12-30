package com.mycompany;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nome, sexo, login;
        int idade, experiencia, qtdVideos;

        System.out.print("====================");
        System.out.print("SISTEMA DE CADASTRO");
        System.out.print("====================");

        System.out.print("\nDigite eu nome: ");
        nome = scan.next();
        System.out.print("\nDigite sua idade: ");
        idade = scan.nextInt();
        do {
            System.out.print("\nDigite seu sexo [M/F]: ");
            sexo = scan.next();
        } while (!sexo.equals("M") && !sexo.equals("F"));

        do {
            System.out.print("\nDigite sua % de experiência[0/100]: ");
            experiencia = scan.nextInt();
        } while (experiencia < 0 || experiencia > 100);

        System.out.print("\nDigite seu login: ");
        login = scan.next();
        System.out.print("\nDigite a quantidade de vídeos que já assistiu: ");
        qtdVideos = scan.nextInt();
        Gafanhoto gafanhoto = new Gafanhoto(nome, idade, sexo, experiencia, login, qtdVideos);
        System.out.println("\nParabéns! Novo gafanhoto cadastrado: \n");
        System.out.println(
                "Nome: " + gafanhoto.getNome() + "\nIdade: " + gafanhoto.getIdade() + "\nSexo: " + gafanhoto.getSexo());
        System.out.println("Login: " + gafanhoto.getLogin() + "\nExperiência: " + gafanhoto.getExperiencia()
                + "%\nVídeos assistidos: " + gafanhoto.getTotalDeVideosAssistidos());
        System.out.println("========================================");

        Video filme = new Video("Melhor Filme Ever", 4.5f, 1212, 130);

        // Cansei. Mas já deu pra entender!
    }
}