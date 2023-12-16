package com.mycompany;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            // Var
            String opcao_criar_conta = "";
            int opcao_modificar_conta = 0;
            String nome = "";
            int tipo_numero = 0;
            String tipo = "";
            float valor = 0;

            // Entrada
            System.out.println("=============================CONTAS BANCÁRIAS=============================");
            System.out.println("Deseja criar uma conta? [S/N]");
            System.out.print("R: ");
            opcao_criar_conta = scan.next();

            if (opcao_criar_conta.equals("s") || opcao_criar_conta.equals("S")) {
                // Criação de conta
                ContaBanco conta = new ContaBanco();

                // Receber o nome
                System.out.print("Certo...\nDigite seu nome\nR: ");
                nome = scan.next();
                conta.set_dono(nome);

                // "" tipo da conta
                System.out.println("Qual conta você deseja abrir?");
                System.out.print("1) Corrente\n2) Poupança\nR: ");

                do {
                    tipo_numero = scan.nextInt();
                    if (tipo_numero != 1 && tipo_numero != 2) {
                        System.out.println("ERRO: Por favor, digite somente uma das opções!");
                    }
                } while (tipo_numero != 1 && tipo_numero != 2);

                if (tipo_numero == 1) {
                    tipo = "c";
                } else {
                    tipo = "p";
                }

                conta.set_tipo(tipo);

                // Abrindo a conta
                conta.abrirConta();

                // Imprimindo as informações da conta
                conta.imprimir_informações();

                System.out.println("\n===============Manutenção da Conta===============");
                while (true) {
                    System.out.println("\n\nO que você deseja fazer?");
                    System.out.println("1) Abrir conta");
                    System.out.println("2) Fechar conta");
                    System.out.println("3) Verificar saldo");
                    System.out.println("4) Depositar dinheiro");
                    System.out.println("5) Sacar dinheiro");
                    System.out.println("6) Pagar mensalidade");
                    System.out.println("7) Verificar informações");
                    System.out.print("8) Sair\nR: ");
                    opcao_modificar_conta = scan.nextInt();

                    if (opcao_modificar_conta == 8) {
                        break;
                    }

                    switch (opcao_modificar_conta) {
                        case 1:
                            conta.abrirConta();
                            break;

                        case 2:
                            conta.fecharConta();
                            break;

                        case 3:
                            System.out.println("Saldo atual: R$" + conta.get_saldo());
                            break;
                        case 4:
                            System.out.print("Ok..\nQual o valor que deseja depositar [0,00]?\nR: ");
                            valor = scan.nextFloat();
                            conta.depositar(valor);
                            break;

                        case 5:
                            System.out.print("Ok..\nQual o valor que deseja sacar [0,00]?\nR: ");
                            valor = scan.nextFloat();
                            conta.sacar(valor);
                            break;

                        case 6:
                            conta.pagarMensal();
                            break;

                        case 7:
                            conta.imprimir_informações();
                            break;

                        default:
                            System.out.println("ERRO: Digite uma opção válida!");
                            break;
                    }
                }
                System.out.println("\nOk, até a próxima :)");
                System.out.println("==================================================");

            } else {
                System.out.println("Ok, até a próxima :)");
                System.out.println("====================================================================");
            }
        }
    }
}