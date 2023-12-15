package com.mycompany._classeobjeto;

import java.util.Scanner;

/**
 * @author rafas
 */
public class App {

    public static void main(String[] args) {
        // Usando a classe "Caneta.java" para criar um objeto
        Caneta canetaAzul = new Caneta();
        
        // Definindo o estado deste objeto
        canetaAzul.carga = 100;
        canetaAzul.cor = "Azul";
        canetaAzul.marca = "BIC";
        canetaAzul.ponta = (float) 0.5;
        canetaAzul.tampada = true;
        
        try (// Scanner
        Scanner scan = new Scanner(System.in)) {
            // Opção de método e de continuar
            int opc;
            String continuar = "S";
            
            // Perguntando para o User o que ele deseja fazer com a caneta
            do{
                System.out.println("O que você deseja fazer?");
                System.out.print("1) Tampar\n2) Destampar\n3) Rabiscar\n4) Ver status\nR:");
                opc = scan.nextInt();
                
                // As opções
                switch(opc){
                    case 1 -> canetaAzul.tampar();
                        
                    case 2 -> canetaAzul.destampar();
                        
                    case 3 -> canetaAzul.rabiscar();
                    
                    case 4 -> canetaAzul.status();
                        
                    default -> System.out.println("ERRO: Por favor, digite um valor válido!");
                }
                
                // Opção de reuso
                System.out.print("Deseja continuar? ");
                System.out.print("[S/N] \nR: ");
                continuar = scan.next();
                
            }while("S".equals(continuar) || "s".equals(continuar));
        }
    }
}
