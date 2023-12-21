package com.mycompany.tiposprimitivos;

import java.util.Scanner;

public class TiposPrimitivos {

    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {
            // Inteiros //
            int idade1 = 3;

            // Typecast
            int idade2 = (int) 3; // "considere este 3 como inteiro"

            // Com CLASSES WRAPPER, sendo um OBJETO
            Integer idade3 = new Integer(3); // Desnecessário este new Integer
            // TAMANHO: 4 bytes
            // Aceita até 2.147.483

            // Reais //
            float salario1 = 1825.54f;

            // Typecast
            float salario2 = (float) 1825.54;

            // Com CLASSES WRAPPER, sendo um OBJETO
            Float salario3 = new Float(1825.54);
            // TAMANHO: 4 bytes
            // Vai até 3.4e^+38

            // Caracteres //
            char letra1 = 'G';

            // Typecast
            char letra2 = (char) 'G';

            // Com CLASSES WRAPPER, sendo um OBJETO
            Character letra3 = new Character('G');

            /*
             * TAMANHO: 1 bit
             */
            // Strings //
            String str = "Rafael";

            // Booleanos //
            boolean casado1 = false;

            // Typecast
            boolean casado2 = (boolean) false;

            // Com CLASSES WRAPPER, sendo um OBJETO
            Boolean casado3 = new Boolean(false);

            /*
             * TAMANHO: 1 bit
             */
            // C O N V E R S Ã O //
            int valorint = 2;
            String valorstr = Integer.toString(valorint);

            String numstr = "30";
            int numint = Integer.parseInt(numstr);

            // S A Í D A D E D A D O S //
            float n = (float) 8.5;
            System.out.println("A sua nota é: " + n);
            System.out.print("A sua nota é: " + n);
            System.out.printf("A sua nota é: " + n);
            System.out.format("A sua nota é: " + n);

            System.out.println("");

            // E N T R A D A D E D A D O S //
            System.out.println("Digite o nome do aluno: ");
            String aluno = teclado.nextLine();

            System.out.println("Digite a nota do aluno: ");
            float nota = teclado.nextFloat();

            System.out.format("A nota de %s é %.1f \n", aluno, nota);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }
}
