/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany._media;
import java.util.Scanner;
/**
 *
 * @author rafas
 */
public class App {

    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
        System.out.print("Digite a primeira nota de um aluno: ");
        float nota1 = scan.nextFloat();
        System.out.print("Digite a segunda nota do aluno: ");
        float soma = nota1;
        nota1 = scan.nextFloat();
        soma += nota1;
        soma /= 2;
        System.out.println("A média é de "+ soma);
    }
}
