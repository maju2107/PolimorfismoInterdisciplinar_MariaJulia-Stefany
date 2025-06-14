package biologia;

import java.util.ArrayList;
import java.util.Scanner;

public class Vegetal extends Sistemas {
    private String sistemaDermico;
    private String sistemaFundamental;
    private String sistemaVascular;

    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_ORANGE = "\u001B[38;5;208m";

    private String tipoVegetal = "Vegetal";

    // construtores
    public Vegetal() {
        this.sistemaDermico = "É a camada mais externa da planta, responsável pela proteção e revestimento. Inclui a epiderme e o periderme. ";
        this.sistemaFundamental = "Envolve o tecido parenquimático, que preenche os órgãos da planta e desempenha funções de armazenamento, suporte e nutrição. ";
        this.sistemaVascular = "É responsável pelo transporte de água e nutrientes, e inclui os tecidos xilema (transporte de água) e floema (transporte de nutrientes). \n";
    }

    // getters
    public String getSistemaDermico() {
        return sistemaDermico;
    }

    public String getSistemaFundamental() {
        return sistemaFundamental;
    }

    public String getSistemaVascular() {
        return sistemaVascular;
    }

    // sobrecarga de métodos

    @Override
    public String tipo() {
        return tipoVegetal;
    }

    @Override
    public void quiz() {
        Scanner teclado = new Scanner(System.in);
        int pontos = 0;
        ArrayList<String> respostas = new ArrayList<String>();
        int ordem =  1;

        System.out.println("Quiz sobre o Sistema Vegetal! Responda todas as perguntas com a letra da alternativa correta.\n");

        System.out.println("1) Qual estrutura é responsável pela fotossíntese nas plantas?");
        System.out.println("a) Raiz");
        System.out.println("b) Folha");
        System.out.println("c) Semente");
        System.out.print("Resposta: ");
        String resposta1 = teclado.nextLine().trim().toLowerCase();
        if (resposta1.equals("b")) {
            System.out.println(ANSI_GREEN+"Resposta correta! A fotossíntese ocorre nas folhas."+ANSI_RESET);
            pontos++;
        } else {
            System.out.println(ANSI_RED+"Resposta incorreta! A correta é b) Folha."+ANSI_RESET);
        }
        System.out.println();

        System.out.println("2) Qual tecido vegetal transporta água e minerais das raízes até as folhas?");
        System.out.println("a) Floema");
        System.out.println("b) Xilema");
        System.out.println("c) Parênquima");
        System.out.print("Resposta: ");
        String resposta2 = teclado.nextLine().trim().toLowerCase();
        if (resposta2.equals("b")) {
            System.out.println(ANSI_GREEN+"Resposta correta! O xilema transporta água e minerais."+ANSI_RESET);
            pontos++;
        } else {
            System.out.println(ANSI_RED+"Resposta incorreta! A correta é b) Xilema."+ANSI_RESET);
        }
        System.out.println();

        System.out.println("3) Como se chama o processo de liberação de água pelas folhas?");
        System.out.println("a) Transpiração");
        System.out.println("b) Germinação");
        System.out.println("c) Polinização");
        System.out.print("Resposta: ");
        String resposta3 = teclado.nextLine().trim().toLowerCase();
        if (resposta3.equals("a")) {
            System.out.println(ANSI_GREEN+"Resposta correta! A liberação de água pelas folhas é a transpiração."+ANSI_RESET);
            pontos++;
        } else {
            System.out.println(ANSI_RED+"Resposta incorreta! A correta é a) Transpiração."+ANSI_RESET);
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
                System.out.println(ANSI_ORANGE+"\nBoa, parábens! Você ganhou a Medalha de Bronze"+ANSI_RESET);
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
        System.out.println("\nRevise mais informações sobre o Sistema Vegetal:");
        System.out.println("- Dermico: " + getSistemaDermico());
        System.out.println("- Fundamental:  " + getSistemaFundamental());
        System.out.println("- Vascular:  " + getSistemaVascular());
    }
}
