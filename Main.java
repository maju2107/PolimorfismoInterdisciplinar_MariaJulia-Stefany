import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcao;
        do {
            System.out.println("Seja bem-vindo ao Sistema Interdisciplinar!");
            System.out.println("Qual matéria você gostaria de estudar?");
            System.out.println("1- Português");
            System.out.println("2- Biologia");
            System.out.println("3- História");
            System.out.println("0- Sair");

            System.out.println("Digite o número da opção desejada: ");
            opcao = teclado.nextInt();

            if (opcao == 1|| opcao == 2 || opcao == 3 & opcao != isNaN(opcao)){

            }
    }
}

