/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany._somar;
import java.util.Scanner;

/**
 *
 * @author rafas
 */
public class App {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite um número: ");
        float n1 = scan.nextFloat();
        System.out.print("Digite outro número: ");
        float n2 = scan.nextFloat();
        System.out.format("A soma entre %.2f e %.2f é de %.2f", n1, n2, n1+n2);
    }
}
