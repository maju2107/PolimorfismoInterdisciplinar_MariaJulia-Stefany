package portugues;

import java.util.ArrayList;
import java.util.Scanner;

public class Humanismo extends EscolasLiterarias {

    private String definicaoHumanismo = "O Humanismo foi um movimento literário que marcou a transição entre a Idade Média e a Idade Moderna, ocorrendo entre os séculos XV e XVI.\n Ele se destacou por valorizar o ser humano, a razão e o conhecimento, rompendo com a visão teocêntrica medieval. Ademais, há o resgate da cultura greco-romana, com influência dos clássicos e o uso da prosa histórica e do teatro como formas de expressão.";
    private String autos;
    private String farsas;

    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_ORANGE = "\u001B[38;5;208m";

    // construtores
    public Humanismo() {
        this.autos = "Auto da Barca do Inferno - Gil Vicente";
        this.farsas = "Farsa de Inês Pereira - Gil Vicente";
    }

    // getters
    public String getAutos() {
        return autos;
    }

    public String getFarsas() {
        return farsas;
    }

    @Override
    public String definicao() {
        return definicaoHumanismo;
    }

    @Override
    public void quiz() {
        Scanner teclado = new Scanner(System.in);
        int pontos = 0;
        ArrayList<String> respostas = new ArrayList<String>();
        int ordem =  1;

        System.out.println("Quiz sobre Humanismo! Responda todas as perguntas com a letra da alternativa correta.\n");

        System.out.println("Quem foi o principal autor do teatro humanista português?");
        System.out.println("a) Gracialino Ramos");
        System.out.println("b) Machado de Assis");
        System.out.println("c) Gil Vicente");
        System.out.println("Resposta: ");
        String resposta1 = teclado.nextLine().trim().toLowerCase(); // esse "trim" remove espaços em branco do começo
                                                                   // e do fim da resposta (evita erros de leitura)

        if (resposta1.equals("c")) {
            System.out.println(ANSI_GREEN+"Resposta correta! Gil Vicente é o principal autor do teatro humanista português."+ANSI_RESET);
            pontos++; //esse é para incrementar, aí soma-se +1
        } else {
            System.out.println(ANSI_RED+"Resposta incorreta! A resposta correta é c) Gil Vicente."+ANSI_RESET);
        }
        System.out.println();

        System.out.println("Onde surgiu o Humanismo?");
        System.out.println("a) Itália");
        System.out.println("b) França");
        System.out.println("c) Portugal");
        System.out.println("Resposta: ");
        String resposta2 = teclado.nextLine().trim().toLowerCase();

        if (resposta2.equals("a")) {
            System.out.println(ANSI_GREEN+"Resposta correta! O Humanismo surgiu na Itália, mais especificamente nas cidades de Florença, Roma e Veneza."+ANSI_RESET);
            pontos++; // esse é para incrementar, aí soma-se +1
        } else {
            System.out.println(ANSI_RED+"Resposta incorreta! A resposta correta é a) Itália."+ANSI_RESET);
        }
        System.out.println();

        System.out.println("Qual é uma das principais características do humanismo?");
        System.out.println("a) Valorização do ser humano e da razão");
        System.out.println("b) Exaltação do misticismo e do sobrenatural");
        System.out.println("c) Foco na crítica social e na política");
        System.out.println("Resposta: ");
        String resposta3 = teclado.nextLine().trim().toLowerCase();

        if (resposta3.equals("a")) {
            System.out.println(
                    ANSI_GREEN+"Resposta correta! Uma das principais características do Humanismo é a valorização do ser humano e da razão."+ANSI_RESET);
            pontos++; // esse é para incrementar, aí soma-se +1
        } else {
            System.out.println(ANSI_RED+"Resposta incorreta! A resposta correta é a) Valorização do ser humano e da razão."+ANSI_RESET);
        }
        System.out.println();

        respostas.add(resposta1); // alimentando o arraylist
        respostas.add(resposta2);
        respostas.add(resposta3);

        System.out.println("\nVocê acertou " + pontos + " de 3 perguntas!");
        System.out.println("E suas respostas foram: ");
       
        for (String i : respostas) {
            System.out.println( ordem +")" +i);
            ordem++;
        }

        switch (pontos) {
            case 3:
                System.out.println(ANSI_YELLOW+"\nParabéns! Você ganhou a Medalha de Ouro"+ANSI_RESET);
                System.out.println(ANSI_YELLOW+"  *********************"+ANSI_RESET);
                System.out.println(ANSI_YELLOW+"  *     CAMPEÃO(A)     *"+ANSI_RESET);
                System.out.println(ANSI_YELLOW+"  *********************"+ANSI_RESET);
                System.out.println(ANSI_YELLOW+"     \\o/    "+ANSI_RESET);
                System.out.println(ANSI_YELLOW+"      |     "+ANSI_RESET);
                System.out.println(ANSI_YELLOW+"     / \\   "+ANSI_RESET);
                break;

            case 2:
                System.out.println(ANSI_CYAN+"\nParabéns! Você ganhou a Medalha de Prata"+ANSI_RESET);
                System.out.println(ANSI_CYAN+"  ********************  "+ANSI_RESET);
                System.out.println(ANSI_CYAN+"  ***   FOI QUASE LÁ!   ***"+ANSI_RESET);
                System.out.println(ANSI_CYAN+"  ********************  "+ANSI_RESET);

                break;

            case 1:
                System.out.println(ANSI_ORANGE+"\nParábens! Você ganhou a Medalha de Bronze"+ANSI_RESET);
                System.out.println(ANSI_ORANGE+"  +++++++++++++++++"+ANSI_RESET);
                System.out.println(ANSI_ORANGE+"  +++++++++++++++++"+ANSI_RESET);
                System.out.println(ANSI_ORANGE+"  +     BOM       +"+ANSI_RESET);
                break;

            default:
                System.out.println("Que pena! Bora tentar de novo para ganhar uma medalha.");
                System.out.println("    (._.)    ");
                System.out.println("    <|>     ");
                System.out.println("    / \\    ");
                break;
        }

        System.out.println("\nAlguns tipos de obras no Humanismo:");
        System.out.println("- Auto: " + getAutos());
        System.out.println("- Farsa:  " + getFarsas());
    }
}
