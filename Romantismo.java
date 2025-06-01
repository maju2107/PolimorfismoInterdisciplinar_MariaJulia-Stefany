import java.util.Scanner;

public class Romantismo extends EscolasLiterarias {

    private String RomanceIndianista;
    private String RomanceUrbano;
    private String RomanceRegionalista;

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

        System.out.println("Quiz sobre Romantismo! Responda todas as perguntas com a letra da alternativa correta.\n");

        System.out.println("Quem é um dos principais autores do Romance Indianista?");
        System.out.println("a) José de Alencar");
        System.out.println("b) Gregório de Matos");
        System.out.println("c) Padre Antônio Vieira");
        System.out.println("Resposta: ");
        String resposta = teclado.nextLine().trim().toLowerCase(); // esse "trim" remove espaços em branco do começo
                                                                   // e do fim da resposta (evita erros de leitura)

        if (resposta.equals("a")) {
            System.out.println("Resposta correta! José de Alencar é um dos principais autores do Romance Indianista.");
            pontos++; // incremento, soma +1
        } else {
            System.out.println("Resposta incorreta! A resposta correta é a) José de Alencar.");
        }
        System.out.println();

        System.out.println(" Qual das opções abaixo é um Romance Urbano?");
        System.out.println("a) Vidas Secas");
        System.out.println("b) Iracema");
        System.out.println("c) A Moreninha");
        System.out.println("Resposta: ");
        String escolha = teclado.nextLine().trim().toLowerCase();

        if (escolha.equals("c")) {
            System.out.println(
                    "Resposta correta! 'A Moreninha' é um romance urbano que retrata a vida social e os conflitos amorosos da alta sociedade carioca do século XIX.");
            pontos++; // incremento, soma +1
        } else {
            System.out.println("Resposta incorreta! A resposta correta é c) A Moreninha.");
        }
        System.out.println();

        System.out.println("Qual é uma característica da segunda geração romântica?");
        System.out.println("a) Nacionalismo e religiosidade");
        System.out.println("b) Pessimismo e arrebatamento sentimental");
        System.out.println("c) Crítica social e tom político");
        System.out.println("Resposta: ");
        String opcao = teclado.nextLine().trim().toLowerCase();

        if (opcao.equals("b")) {
            System.out.println(
                    "Resposta correta! Pessimismo e arrebatamento sentimental é uma das características da segunda geração romântica.");
            pontos++; // incremento, soma +1
        } else {
            System.out.println("Resposta incorreta! A resposta correta é b) Pessimismo e arrebatamento sentimental.");
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

        System.out.println("\nAlguns tipos de romance do Romantismo Brasileiro:");
        System.out.println("- " + getRomanceUrbano());
        System.out.println("- " + getRomanceRegionalista());
    }
}