package portugues;

import java.util.ArrayList;
import java.util.Scanner;

public class Romantismo extends EscolasLiterarias {

    private String RomanceIndianista;
    private String RomanceUrbano;
    private String RomanceRegionalista;

    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_ORANGE = "\u001B[38;5;208m";

    private String definicaoDoRomatismo = "O Romantismo foi um movimento literário que surgiu no final do século XVIII e se consolidou no século XIX, influenciado pela Revolução Francesa.\n Ele se caracteriza pela valorização das emoções, subjetividade, idealização do amor e da natureza, além da exaltação do nacionalismo.\n Possui 3 gerações românticas, a primeira maracada pelo nacionalismo, religiosidade e figura dos povos originários como heróis nacionais\n; a segunda marcada por pessimismo, gosto pelo mórbido, angústia e erotismo; e a terceira marcada por críticas socias e políticas, erotismo(sem culpa) e tom declamatório. ";

    // construtores
    public Romantismo() {
        this.RomanceIndianista = "Obra: Iracema, de José de Alencar";
        this.RomanceUrbano = "Obra: A Moreninha, de Joaquim Manuel de Macedo";
        this.RomanceRegionalista = "Obra: Vidas Secas, de Graciliano Ramos";
    }

    // getters
    public String getRomanceIndianista() {
        return RomanceIndianista;
    }

    public String getRomanceUrbano() {
        return RomanceUrbano;
    }

    public String getRomanceRegionalista() {
        return RomanceRegionalista;
    }

    @Override
    public String definicao() {
        return definicaoDoRomatismo;
    }

    @Override
    public void quiz() {
        Scanner teclado = new Scanner(System.in);
        int pontos = 0;
        ArrayList<String> respostas = new ArrayList<String>();
        int ordem =  1;

        System.out.println("Quiz sobre Romantismo! Responda todas as perguntas com a letra da alternativa correta.\n");

        System.out.println("Quem é um dos principais autores do Romance Indianista?");
        System.out.println("a) José de Alencar");
        System.out.println("b) Gregório de Matos");
        System.out.println("c) Padre Antônio Vieira");
        System.out.println("Resposta: ");
        String resposta1 = teclado.nextLine().trim().toLowerCase(); // esse "trim" remove espaços em branco do começo
                                                                   // e do fim da resposta (evita erros de leitura)

        if (resposta1.equals("a")) {
            System.out.println(ANSI_GREEN+"Resposta correta! José de Alencar é um dos principais autores do Romance Indianista."+ANSI_RESET);
            pontos++; // incremento, soma +1
        } else {
            System.out.println(ANSI_RED+"Resposta incorreta! A resposta correta é a) José de Alencar."+ANSI_RESET);
        }
        System.out.println();

        System.out.println(" Qual das opções abaixo é um Romance Urbano?");
        System.out.println("a) Vidas Secas");
        System.out.println("b) Iracema");
        System.out.println("c) A Moreninha");
        System.out.println("Resposta: ");
        String resposta2 = teclado.nextLine().trim().toLowerCase();

        if (resposta2.equals("c")) {
            System.out.println(
                    ANSI_GREEN+"Resposta correta! 'A Moreninha' é um romance urbano que retrata a vida social e os conflitos amorosos da alta sociedade carioca do século XIX."+ANSI_RESET);
            pontos++; // incremento, soma +1
        } else {
            System.out.println(ANSI_RED+"Resposta incorreta! A resposta correta é c) A Moreninha."+ANSI_RESET);
        }
        System.out.println();

        System.out.println("Qual é uma característica da segunda geração romântica?");
        System.out.println("a) Nacionalismo e religiosidade");
        System.out.println("b) Pessimismo e arrebatamento sentimental");
        System.out.println("c) Crítica social e tom político");
        System.out.println("Resposta: ");
        String resposta3 = teclado.nextLine().trim().toLowerCase();

        if (resposta3.equals("b")) {
            System.out.println(
                   ANSI_GREEN+ "Resposta correta! Pessimismo e arrebatamento sentimental é uma das características da segunda geração romântica."+ANSI_RESET);
            pontos++; // incremento, soma +1
        } else {
            System.out.println(ANSI_RED+"Resposta incorreta! A resposta correta é b) Pessimismo e arrebatamento sentimental."+ANSI_RESET);
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

        System.out.println("\nAlguns tipos de romance do Romantismo Brasileiro:");
        System.out.println("- " + getRomanceUrbano());
        System.out.println("- " + getRomanceRegionalista());
    }
}