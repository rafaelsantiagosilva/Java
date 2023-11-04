/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany._conversormetros;

import java.util.Scanner;

/**
 *
 * @author rafas
 */
public class App {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite a distância em metros: ");
        float metros = scan.nextFloat();
        System.out.println("Em quilômetros [km]: "+ metros/1000 + "km");
        System.out.println("Em hectômetros [hm]: "+ metros/100 + "hm");
        System.out.println("Em decâmetros [dam]: "+ metros/10 + "dam");
        System.out.println("Em decímetros [dm]: "+ metros*10 + "dm");
        System.out.println("Em centímetros [cm]: "+ metros*100 + "cm");
        System.out.println("Em milímetros [mm]: "+ metros*1000 + "mm");
    }
}
