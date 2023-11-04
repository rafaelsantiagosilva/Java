/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany._bemvindo;

import java.util.Scanner;

/**
 *
 * @author rafas
 */
public class App {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Qual é o seu nome?\nR:");
        String nome = scan.next();
        System.out.format("Bem-vindo %s!", nome);
    }
}
