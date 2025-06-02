package portugues;

import java.util.Scanner;

public class Humanismo extends EscolasLiterarias {

    private String definicaoHumanismo = "O Humanismo foi um movimento literário que marcou a transição entre a Idade Média e a Idade Moderna, ocorrendo entre os séculos XV e XVI.\n Ele se destacou por valorizar o ser humano, a razão e o conhecimento, rompendo com a visão teocêntrica medieval. Ademais, há o resgate da cultura greco-romana, com influência dos clássicos e o uso da prosa histórica e do teatro como formas de expressão.";
    private String autos;
    private String farsas;

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

        System.out.println("Quiz sobre Humanismo! Responda todas as perguntas com a letra da alternativa correta.\n");

        System.out.println("Quem foi o principal autor do teatro humanista português?");
        System.out.println("a) Gracialino Ramos");
        System.out.println("b) Machado de Assis");
        System.out.println("c) Gil Vicente");
        System.out.println("Resposta: ");
        String resposta = teclado.nextLine().trim().toLowerCase(); // esse "trim" remove espaços em branco do começo
                                                                   // e do fim da resposta (evita erros de leitura)

        if (resposta.equals("c")) {
            System.out.println("Resposta correta! Gil Vicente é o principal autor do teatro humanista português.");
            pontos++; //esse é para incrementar, aí soma-se +1
        } else {
            System.out.println("Resposta incorreta! A resposta correta é c) Gil Vicente.");
        }
        System.out.println();

        System.out.println("Onde surgiu o Humanismo?");
        System.out.println("a) Itália");
        System.out.println("b) França");
        System.out.println("c) Portugal");
        System.out.println("Resposta: ");
        String escolha = teclado.nextLine().trim().toLowerCase();

        if (escolha.equals("a")) {
            System.out.println("Resposta correta! O Humanismo surgiu na Itália, mais especificamente nas cidades de Florença, Roma e Veneza.");
            pontos++; // esse é para incrementar, aí soma-se +1
        } else {
            System.out.println("Resposta incorreta! A resposta correta é a) Itália.");
        }
        System.out.println();

        System.out.println("Qual é uma das principais características do humanismo?");
        System.out.println("a) Valorização do ser humano e da razão");
        System.out.println("b) Exaltação do misticismo e do sobrenatural");
        System.out.println("c) Foco na crítica social e na política");
        System.out.println("Resposta: ");
        String opcao = teclado.nextLine().trim().toLowerCase();

        if (opcao.equals("a")) {
            System.out.println(
                    "Resposta correta! Uma das principais características do Humanismo é a valorização do ser humano e da razão.");
            pontos++; // esse é para incrementar, aí soma-se +1
        } else {
            System.out.println("Resposta incorreta! A resposta correta é a) Valorização do ser humano e da razão.");
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
                System.out.println("\nParábens! Você ganhou a Medalha de Bronze");
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

        System.out.println("\nAlguns tipos de obras no Humanismo:");
        System.out.println("- Auto: " + getAutos());
        System.out.println("- Farsa:  " + getFarsas());
    }
}
