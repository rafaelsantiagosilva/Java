/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany._nomeesalario;

import java.util.Scanner;

/**
 *
 * @author rafas
 */
public class App {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o nome: ");
        String nome = scan.next();
        System.out.print("Digite o salário: ");
        float salario = scan.nextFloat();
        System.out.println("Nome do funcionário: "+ nome);
        System.out.println("Salário do funcionário: "+ salario);
    }
}
