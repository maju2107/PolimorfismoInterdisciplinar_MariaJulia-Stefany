package biologia;

import java.util.Scanner;

public class Vegetal extends Sistemas {
    private String sistemaDermico;
    private String sistemaFundamental;
    private String sistemaVascular;

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

    @Override
    public String tipo() {
        return tipoVegetal;
    }

    @Override
    public void quiz() {
        Scanner teclado = new Scanner(System.in);
        int pontos = 0;
        System.out.println(
                "Quiz sobre o Sistema Vegetal! Responda todas as perguntas com a letra da alternativa correta.\n");

        System.out.println("1) Qual estrutura é responsável pela fotossíntese nas plantas?");
        System.out.println("a) Raiz");
        System.out.println("b) Folha");
        System.out.println("c) Semente");
        System.out.print("Resposta: ");
        String r1 = teclado.nextLine().trim().toLowerCase();
        if (r1.equals("b")) {
            System.out.println("Resposta correta! A fotossíntese ocorre nas folhas.");
            pontos++;
        } else {
            System.out.println("Resposta incorreta! A correta é b) Folha.");
        }
        System.out.println();

        System.out.println("2) Qual tecido vegetal transporta água e minerais das raízes até as folhas?");
        System.out.println("a) Floema");
        System.out.println("b) Xilema");
        System.out.println("c) Parênquima");
        System.out.print("Resposta: ");
        String r2 = teclado.nextLine().trim().toLowerCase();
        if (r2.equals("b")) {
            System.out.println("Resposta correta! O xilema transporta água e minerais.");
            pontos++;
        } else {
            System.out.println("Resposta incorreta! A correta é b) Xilema.");
        }
        System.out.println();

        System.out.println("3) Como se chama o processo de liberação de água pelas folhas?");
        System.out.println("a) Transpiração");
        System.out.println("b) Germinação");
        System.out.println("c) Polinização");
        System.out.print("Resposta: ");
        String r3 = teclado.nextLine().trim().toLowerCase();
        if (r3.equals("a")) {
            System.out.println("Resposta correta! A liberação de água pelas folhas é a transpiração.");
            pontos++;
        } else {
            System.out.println("Resposta incorreta! A correta é a) Transpiração.");
        }
        System.out.println();

        System.out.println("\nVocê acertou " + pontos + " de 3 perguntas!");

        switch (pontos) {
            case 3:
                System.out.println("\nParabéns! Você ganhou a Medalha de Ouro");
                System.out.println("  *********************");
                System.out.println("  *     CAMPEÃO(A)     *");
                System.out.println("  *********************");
                System.out.println("     \\o/    ");
                System.out.println("      |     ");
                System.out.println("     / \\   ");
                break;

            case 2:
                System.out.println("\nParabéns! Você ganhou a Medalha de Prata");
                System.out.println("  ********************  ");
                System.out.println("  ***   FOI QUASE LÁ!   ***");
                System.out.println("  ********************  ");

                break;

            case 1:
                System.out.println("\nBoa, parábens! Você ganhou a Medalha de Bronze");
                System.out.println("  +++++++++++++++++");
                System.out.println("  +++++++++++++++++");
                System.out.println("  +     BOM       +");
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
