package principal;

import opcoes.*;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcao;

            do {
            MenuDeOpcoes();

            System.out.println("Digite o número da opção desejada: ");
            opcao = teclado.nextInt();
            teclado.nextLine();

            switch (opcao) {
                case 1:

                Opcao1 opcao1 = new Opcao1();
                opcao1.op1();
                    
                break;

                case 2:

                Opcao2 opcao2 = new Opcao2();
                opcao2.op2();

                break;

                case 3:
                
                Opcao3 opcao3 = new Opcao3();
                opcao3.op3();

                break;

                case 0:
                System.out.println("Você saiuu...!");   
                break;
            
                default:
                System.out.println("Opção não encontrada dentre as fornecidas pelo sistema!");   
                break;
            }

        } while(opcao!=0);
    }

    private static void MenuDeOpcoes(){
        espaco();
        espaco();
        System.out.println("Seja bem-vindo ao Sistema Interdisciplinar!");
        System.out.println("Qual matéria você gostaria de estudar?");
        System.out.println("1- Português (Escolas Literárias)");
        System.out.println("2- Biologia (Sistemas)");
        System.out.println("3- História (Civilizações Antigas)");
        System.out.println("0- Sair");
    }

    public static void espaco(){
        System.out.println("-------------------------------");
    }
}

