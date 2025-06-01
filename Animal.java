import java.util.Scanner;

public class Animal extends Sistemas {
    private String digestorioCompleto;
    private String respiracaoBranquialOuPulmonar;
    private String sistemaNervosoSimplesOuComplexo;

    private String tipoAnimal = "Animal";

    // construtores
    public Animal() {
        this.digestorioCompleto = "O sistema digestório dos animais é caracterizado por: Boca, Faringe, Esôfago, Estômago, Intestino Delgado, Intestin Grosso, Reto, Ânus";
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

    @Override
    public String tipo() {
        return tipoAnimal;
    }

    @Override
    public void quiz() {
        Scanner teclado = new Scanner(System.in);
        int pontos = 0;
        System.out.println(
                "Quiz sobre o Sistema Animal! Responda todas as perguntas com a letra da alternativa correta.\n");

        System.out.println("1) Qual órgão é responsável por bombear o sangue em animais vertebrados?");
        System.out.println("a) Pulmão");
        System.out.println("b) Rins");
        System.out.println("c) Coração");
        System.out.print("Resposta: ");
        String r1 = teclado.nextLine().trim().toLowerCase();
        if (r1.equals("c")) {
            System.out.println("Resposta correta! O coração bombeia o sangue.");
            pontos++;
        } else {
            System.out.println("Resposta incorreta! A correta é c) Coração.");
        }
        System.out.println();

        System.out.println("2) Qual sistema controla as funções do corpo, como movimento e sensações?");
        System.out.println("a) Sistema nervoso");
        System.out.println("b) Sistema respiratório");
        System.out.println("c) Sistema excretor");
        System.out.print("Resposta: ");
        String r2 = teclado.nextLine().trim().toLowerCase();
        if (r2.equals("a")) {
            System.out.println("Resposta correta! O sistema nervoso controla funções corporais.");
            pontos++;
        } else {
            System.out.println("Resposta incorreta! A correta é a) Sistema nervoso.");
        }
        System.out.println();

        System.out.println("3) Qual grupo de animais possui vértebras na coluna?");
        System.out.println("a) Invertebrados");
        System.out.println("b) Vertebrados");
        System.out.println("c) Artrópodes");
        System.out.print("Resposta: ");
        String r3 = teclado.nextLine().trim().toLowerCase();
        if (r3.equals("b")) {
            System.out.println("Resposta correta! Vertebrados têm vértebras.");
            pontos++;
        } else {
            System.out.println("Resposta incorreta! A correta é b) Vertebrados.");
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
        System.out.println("\nRevise mais informações sobre o Sistema Animal:");
        System.out.println("- Respiratório: " + getRespiracaoBranquialOuPulmonar());
        System.out.println("- Digestório:  " + getDigestorioCompleto());
        System.out.println("- Nervoso:  " + getSistemaNervosoSimplesOuComplexo());
    }

}
