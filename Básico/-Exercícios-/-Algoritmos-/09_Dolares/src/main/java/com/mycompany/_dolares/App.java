/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany._dolares;
import java.util.Scanner;

/**
 *
 * @author rafas
 */
public class App {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Quanto dinheiro você tem na carteira? \nR: R$");
        float real = scan.nextFloat();
        System.out.format("Você pode comprar: US$%.2f", real/3.45);
        System.out.println("\nOBS: US$1,00 = R$3,45");
    }
}
