package biologia;

import java.util.ArrayList;
import java.util.Scanner;

public class Animal extends Sistemas {
    private String digestorioCompleto;
    private String respiracaoBranquialOuPulmonar;
    private String sistemaNervosoSimplesOuComplexo;

    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_ORANGE = "\u001B[38;5;208m";

    private String tipoAnimal = "Animal";

    // construtores
    public Animal() {
        this.digestorioCompleto = "O sistema digestório dos animais é caracterizado por: Boca, Faringe, Esôfago, Estômago, Intestino Delgado, Intestin Grosso, Reto";
        this.respiracaoBranquialOuPulmonar = "A respiração branquial é o processo respiratório utilizado por animais aquáticos, como peixes, onde as brânquias são responsáveis por extrair oxigênio da água. A respiração pulmonar, por outro lado, é o processo respiratório utilizado por animais terrestres, como mamíferos, onde os pulmões são responsáveis por extrair oxigênio do ar.";
        this.sistemaNervosoSimplesOuComplexo = "Sistemas nervosos simples, como os encontrados em animais como as esponjas, são redes nervosas difusas, com células nervosas espalhadas sem uma organização centralizada. Já os sistemas nervosos complexos, presentes em animais mais evoluídos, como os vertebrados, são caracterizados por um sistema nervoso central (SNC) e um sistema nervoso periférico (SNP). \n";
    }

    // getters
    public String getDigestorioCompleto() {
        return digestorioCompleto;
    }

    public String getRespiracaoBranquialOuPulmonar() {
        return respiracaoBranquialOuPulmonar;
    }

    public String getSistemaNervosoSimplesOuComplexo() {
        return sistemaNervosoSimplesOuComplexo;
    }

    // sobrecarga de métodos

    @Override
    public String tipo() {
        return tipoAnimal;
    }

    @Override
    public void quiz() {
        Scanner teclado = new Scanner(System.in);
        int pontos = 0;
        ArrayList<String> respostas = new ArrayList<String>();
        int ordem =  1;
        System.out.println(
                "Quiz sobre o Sistema Animal! Responda todas as perguntas com a letra da alternativa correta.\n");

        System.out.println("1) Qual órgão é responsável por bombear o sangue em animais vertebrados?");
        System.out.println("a) Pulmão");
        System.out.println("b) Rins");
        System.out.println("c) Coração");
        System.out.print("Resposta: ");
        String resposta1 = teclado.nextLine().trim().toLowerCase();
        if (resposta1.equals("c")) {
            System.out.println(ANSI_GREEN + "Resposta correta! O coração bombeia o sangue." + ANSI_RESET);
            pontos++;
        } else {
            System.out.println(ANSI_RED +"Resposta incorreta! A correta é c) Coração."+ ANSI_RESET);
        }
        System.out.println();

        System.out.println("2) Qual sistema controla as funções do corpo, como movimento e sensações?");
        System.out.println("a) Sistema nervoso");
        System.out.println("b) Sistema respiratório");
        System.out.println("c) Sistema excretor");
        System.out.print("Resposta: ");
        String resposta2 = teclado.nextLine().trim().toLowerCase();
        if (resposta2.equals("a")) {
            System.out.println(ANSI_GREEN +"Resposta correta! O sistema nervoso controla funções corporais."+ ANSI_RESET);
            pontos++;
        } else {
            System.out.println(ANSI_RED +"Resposta incorreta! A correta é a) Sistema nervoso."+ ANSI_RESET);
        }
        System.out.println();

        System.out.println("3) Qual grupo de animais possui vértebras na coluna?");
        System.out.println("a) Invertebrados");
        System.out.println("b) Vertebrados");
        System.out.println("c) Artrópodes");
        System.out.print("Resposta: ");
        String resposta3 = teclado.nextLine().trim().toLowerCase();
        if (resposta3.equals("b")) {
            System.out.println(ANSI_GREEN +"Resposta correta! Vertebrados têm vértebras."+ ANSI_RESET);
            pontos++;
        } else {
            System.out.println(ANSI_RED + "Resposta incorreta! A correta é b) Vertebrados." + ANSI_RESET);
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
                System.out.println(ANSI_YELLOW +"\nParabéns! Você ganhou a Medalha de Ouro" + ANSI_RESET);
                System.out.println(ANSI_YELLOW +"  *********************" + ANSI_RESET);
                System.out.println(ANSI_YELLOW +"  *     CAMPEÃO(A)     *" + ANSI_RESET);
                System.out.println(ANSI_YELLOW +"  *********************" + ANSI_RESET);
                System.out.println(ANSI_YELLOW +"     \\o/    "+ ANSI_RESET);
                System.out.println(ANSI_YELLOW +"      |     "+ ANSI_RESET);
                System.out.println(ANSI_YELLOW +"     / \\   "+ ANSI_RESET);
                break;

            case 2:
                System.out.println(ANSI_CYAN + "\nParabéns! Você ganhou a Medalha de Prata" + ANSI_RESET);
                System.out.println(ANSI_CYAN +"  ********************  " + ANSI_RESET);
                System.out.println(ANSI_CYAN +"  ***   FOI QUASE LÁ!   ***" + ANSI_RESET);
                System.out.println(ANSI_CYAN +"  ********************  "+ ANSI_RESET);

                break;

            case 1:
                System.out.println(ANSI_ORANGE + "\nParábens! Você ganhou a Medalha de Bronze" + ANSI_RESET);
                System.out.println(ANSI_ORANGE +"  +++++++++++++++++" + ANSI_RESET);
                System.out.println(ANSI_ORANGE +"  +++++++++++++++++" + ANSI_RESET);
                System.out.println(ANSI_ORANGE +"  +     BOM       +" + ANSI_RESET);
                break;

            default:
                System.out.println("Que pena! Bora tentar de novo para ganhar uma medalha.");
                System.out.println("    (._.)    ");
                System.out.println("    <|>     ");
                System.out.println("    / \\    ");
                break;
        }
        System.out.println("\nRevise mais informações sobre o Sistema Animal:");
        System.out.println("- Respiratório: " + getRespiracaoBranquialOuPulmonar());
        System.out.println("- Digestório:  " + getDigestorioCompleto());
        System.out.println("- Nervoso:  " + getSistemaNervosoSimplesOuComplexo());
    }

}
