package opcoes;

import java.util.Scanner;
import biologia.*;

public class Opcao2 {

    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_RED = "\u001B[31m";
    
    public void op2 () {

        Scanner teclado = new Scanner(System.in);
        String escolhaSistemas;
        String querFazerOquiz;
        String exemplo;

        System.out.println("Digite o nome do Sistema que você deseja aprender (Vegetal, Animal ou Humano): ");
        escolhaSistemas = teclado.nextLine().toLowerCase();

        if (escolhaSistemas.equals("vegetal")) {

            Sistemas vegetal = new Vegetal();
            vegetal.setNome("Sistema Vegetal");


            System.out.println(ANSI_GREEN +"Você escolheu estudar o " + vegetal.getNome() + "!" + ANSI_RESET);
            espaco();
            System.out.println(ANSI_GREEN +"Esse sistema é do tipo: " + vegetal.tipo() + ANSI_RESET);
            espaco();
            System.out.println(ANSI_GREEN +"Digite o nome de um ser vivo que possui este tipo de sistema:"+ ANSI_RESET);
            exemplo = teclado.nextLine();
            System.out.println("Você deu este exemplo:"+exemplo);

            System.out.println("Você deseja fazer um quiz para aprofundar e testar seus conhecimentos sobre o Sistema Vegetal?");
            querFazerOquiz = teclado.nextLine().toLowerCase();

            if (querFazerOquiz.equals("sim")) {
                vegetal.quiz();
            } else {
                System.out.println("Tudo bem! Você pode tentar novamente mais tarde.");
              }

        }

        if (escolhaSistemas.equals("animal")) {

            Sistemas animal = new Animal();
            animal.setNome("Sistema Animal");

            System.out.println(ANSI_BLUE+"Você escolheu estudar o " + animal.getNome() + "!"+ ANSI_RESET);
            espaco();
            System.out.println(ANSI_BLUE+"Esse sistema é do tipo: " + animal.tipo()+ ANSI_RESET);
            espaco();
            System.out.println(ANSI_BLUE +"Digite o nome de um ser vivo que possui este tipo de sistema:"+ ANSI_RESET);
            exemplo = teclado.nextLine();
            System.out.println("Você deu este exemplo:"+exemplo);

            System.out.println( "Você deseja fazer um quiz para aprofundar e testar seus conhecimentos sobre o Sistema Animal?");
            querFazerOquiz = teclado.nextLine().toLowerCase();

            if (querFazerOquiz.equals("sim")) {
                animal.quiz();
            } else {
                System.out.println("Tudo bem! Você pode tentar novamente mais tarde.");
                }

        }

        if (escolhaSistemas.equals("humano")) {

            Sistemas humano = new Humano();
            humano.setNome("Sistema Humano");

            System.out.println(ANSI_RED +"Você escolheu estudar o " + humano.getNome() + "!"+ ANSI_RESET);
            espaco();
            System.out.println(ANSI_RED +"Esse sistema é do tipo: " + humano.tipo()+ ANSI_RESET);
            espaco();
            System.out.println(ANSI_RED +"Digite o nome de um ser vivo que possui este tipo de sistema:"+ ANSI_RESET);
            exemplo = teclado.nextLine();
            System.out.println("Você deu este exemplo:"+exemplo);


            System.out.println("Você deseja fazer um quiz para aprofundar e testar seus conhecimentos sobre o Sistema Humano?");
            querFazerOquiz = teclado.nextLine().toLowerCase();

            if (querFazerOquiz.equals("sim")) {
                humano.quiz();
            }  else {
                System.out.println("Tudo bem! Você pode tentar novamente mais tarde.");
               }

        }
    }

    public void espaco(){
        System.out.println("-------------------------------");
    }

}
