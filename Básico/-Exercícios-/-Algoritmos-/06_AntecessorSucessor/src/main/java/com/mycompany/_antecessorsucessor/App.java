package com.mycompany._antecessorsucessor;
import java.util.Scanner;
/**
 *
 * @author rafas
 */
public class App {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        int num = scan.nextInt();
        System.out.format("O antecessor é %d e o sucessor é %d!", num-1, num+1);
    }
}