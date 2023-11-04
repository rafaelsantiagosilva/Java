/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany._funcoes;
import java.util.Scanner;
/**
 *
 * @author rafas
 */
public class App {
    public static float soma(float a, float b){
        return a+b;
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite um número: ");
        float n1 = scan.nextFloat();
        System.out.print("\nDigite mais um número: ");
        float n2 = scan.nextFloat();
        System.out.print("\nA soma é: "+ soma(n1, n2));
        
    }
}
