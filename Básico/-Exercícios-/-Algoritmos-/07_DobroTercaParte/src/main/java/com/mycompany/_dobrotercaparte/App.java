/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany._dobrotercaparte;
import java.util.Scanner;
/**
 *
 * @author rafas
 */
public class App {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um número: ");
        float num = scan.nextFloat();
        System.out.format("O dobro é: %.2f\nA terça parte é: %.5f", num*2, num/3);
    }
}
