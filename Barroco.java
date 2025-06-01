import java.util.Scanner;

public class Barroco extends EscolasLiterarias {

    private String sermoesPadreAntonioVieira;
    private String sonetosGregorioDeMatos;

    private String definicaoDoBarroco = "O Barroco foi um movimento literário que surgiu no final do século XVI, influenciado pelo contexto da Reforma Protestante e da Contrarreforma Católica.\n Ele se caracteriza pelo culto ao contraste, explorando oposições como religiosidade x sensualidade, espiritualidade x materialismo, e efemeridade x eternidade.\n Utiliza muitas as figuras de linguagem antítese e paradoxo, apresenta temas como fragilidade humana, fugacidade do tempo e crítica à vaidade além de forte influência religiosa e moralizante. ";

    // construtores
    public Barroco() {
        this.sermoesPadreAntonioVieira = "'Sermão de Santo Antônio aos Peixes'. Este sermão sa os peixes como metáforas para criticar os vícios e exaltar as virtudes dos homens — especialmente os exploradores que se diziam cristãos, mas agiam com ganância e crueldade.";
        this.sonetosGregorioDeMatos = "'Pequei, Senhor'. Este soneto explora a temática religiosa e a busca do perdão divíno: o eu-lírico racionaliza sobre os próprios pecados pedindo clemência a Deus.";
    }

    // getters
    public String getSermoesPadreAntonioVieira() {
        return sermoesPadreAntonioVieira;
    }

    public String getSonetosGregorioDeMatos() {
        return sonetosGregorioDeMatos;
    }

    @Override
    public String definicao() {
        return definicaoDoBarroco;
    }

    @Override
    public void quiz() {
        Scanner teclado = new Scanner(System.in);
        int pontos = 0;
        System.out.println("Quiz sobre o Barroco! Responda todas as perguntas com a letra da alternativa correta.\n");

        System.out.println("1) Qual dos autores abaixo pertence ao Barroco Brasileiro?");
        System.out.println("a) Olavo Bilac");
        System.out.println("b) Gregório de Matos");
        System.out.println("c) Álvares de Azevedo");
        System.out.print("Resposta: ");
        String resposta1 = teclado.nextLine().trim().toLowerCase();
        if (resposta1.equals("b")) {
            System.out.println("Resposta correta! Gregório de Matos é um autor barroco.");
            pontos++;
        } else {
            System.out.println("Resposta incorreta! A correta é b) Gregório de Matos.");
        }
        System.out.println();

        System.out.println("2) Qual é uma característica marcante do Barroco?");
        System.out.println("a) Culto ao contraste e uso de antíteses");
        System.out.println("b) Valorização da natureza e do sentimento");
        System.out.println("c) Simplicidade e objetividade");
        System.out.print("Resposta: ");
        String resposta2 = teclado.nextLine().trim().toLowerCase();
        if (resposta2.equals("a")) {
            System.out.println("Resposta correta! O Barroco valoriza o contraste e as antíteses.");
            pontos++;
        } else {
            System.out.println("Resposta incorreta! A correta é a) Culto ao contraste e uso de antíteses.");
        }
        System.out.println();

        System.out.println("3) Qual obra pertence ao Padre Antônio Vieira?");
        System.out.println("a) 'Sermão de Santo Antônio aos Peixes'");
        System.out.println("b) 'Iracema'");
        System.out.println("c) 'A Moreninha'");
        System.out.print("Resposta: ");
        String resposta3 = teclado.nextLine().trim().toLowerCase();
        if (resposta3.equals("a")) {
            System.out.println("Resposta correta! 'Sermão de Santo Antônio aos Peixes' é dele.");
            pontos++;
        } else {
            System.out.println("Resposta incorreta! A correta é a) 'Sermão de Santo Antônio aos Peixes'.");
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

        System.out.println("\nAlguns tipos de obras no Barroco:");
        System.out.println("- Sermão: " + getSermoesPadreAntonioVieira());
        System.out.println("- Soneto:  " + getSonetosGregorioDeMatos());
    }

}