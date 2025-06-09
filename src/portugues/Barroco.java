package portugues;

import java.util.ArrayList;
import java.util.Scanner;

public class Barroco extends EscolasLiterarias {

    private String sermoesPadreAntonioVieira;
    private String sonetosGregorioDeMatos;

    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_ORANGE = "\u001B[38;5;208m";

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
        ArrayList<String> respostas = new ArrayList<String>();
        int ordem =  1;

        System.out.println("Quiz sobre o Barroco! Responda todas as perguntas com a letra da alternativa correta.\n");

        System.out.println("1) Qual dos autores abaixo pertence ao Barroco Brasileiro?");
        System.out.println("a) Olavo Bilac");
        System.out.println("b) Gregório de Matos");
        System.out.println("c) Álvares de Azevedo");
        System.out.print("Resposta: ");
        String resposta1 = teclado.nextLine().trim().toLowerCase();
        if (resposta1.equals("b")) {
            System.out.println(ANSI_GREEN+"Resposta correta! Gregório de Matos é um autor barroco."+ANSI_RESET);
            pontos++;
        } else {
            System.out.println(ANSI_RED+"Resposta incorreta! A correta é b) Gregório de Matos."+ANSI_RESET);
        }
        System.out.println();

        System.out.println("2) Qual é uma característica marcante do Barroco?");
        System.out.println("a) Culto ao contraste e uso de antíteses");
        System.out.println("b) Valorização da natureza e do sentimento");
        System.out.println("c) Simplicidade e objetividade");
        System.out.print("Resposta: ");
        String resposta2 = teclado.nextLine().trim().toLowerCase();
        if (resposta2.equals("a")) {
            System.out.println(ANSI_GREEN+"Resposta correta! O Barroco valoriza o contraste e as antíteses."+ANSI_RESET);
            pontos++;
        } else {
            System.out.println(ANSI_RED+"Resposta incorreta! A correta é a) Culto ao contraste e uso de antíteses."+ANSI_RESET);
        }
        System.out.println();

        System.out.println("3) Qual obra pertence ao Padre Antônio Vieira?");
        System.out.println("a) 'Sermão de Santo Antônio aos Peixes'");
        System.out.println("b) 'Iracema'");
        System.out.println("c) 'A Moreninha'");
        System.out.print("Resposta: ");
        String resposta3 = teclado.nextLine().trim().toLowerCase();
        if (resposta3.equals("a")) {
            System.out.println(ANSI_GREEN+"Resposta correta! 'Sermão de Santo Antônio aos Peixes' é dele."+ANSI_RESET);
            pontos++;
        } else {
            System.out.println(ANSI_RED+"Resposta incorreta! A correta é a) 'Sermão de Santo Antônio aos Peixes'."+ANSI_RESET);
        }
        System.out.println();

        respostas.add(resposta1);
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
                System.out.println(ANSI_CYAN+"\nParabéns! Você ganhou a Medalha de Prata"+ ANSI_RESET);
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

        System.out.println("\nAlguns tipos de obras no Barroco:");
        System.out.println("- Sermão: " + getSermoesPadreAntonioVieira());
        System.out.println("- Soneto:  " + getSonetosGregorioDeMatos());
    }

}