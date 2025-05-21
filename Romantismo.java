import java.util.Scanner;

public class Romantismo extends EscolasLiterarias {

    private String RomanceIndianista;
    private String RomanceUrbano;
    private String RomanceRegionalista;

    private String definicaoDoRomatismo = "O romantismo é um estilo de época marcado pelo sentimentalismo e pela idealização amorosa";

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
        return RomanceIndianista;
    }

    public String getRomanceRegionalista() {
        return RomanceIndianista;
    }

    @Override
    public String definicao() {
        return definicaoDoRomatismo;
    }

    @Override
    public void quiz() {
        Scanner teclado = new Scanner(System.in);
        int tentativas = 2;
        boolean acertou = false;

        System.out.println("Quem é um dos principais autores do Romance Indianista?:");
        System.out.println("a) José de Alencar");
        System.out.println("b) Gregório de Matos");
        System.out.println("c) Padre Antônio Vieira");

        while (tentativas > 0 && !acertou) {
            System.out.print("Resposta: ");
            String resposta = teclado.nextLine().trim().toLowerCase(); // esse "trim" remove espaços em branco do começo
                                                                       // e do fim da resposta (evita erros de leitura)

            if (resposta.equals("a")) {
                System.out.println(
                        "Resposta correta! José de Alencar é um dos principais autores do Romance Indianista.");
                acertou = true;
            } else {
                tentativas--; // decremento. Por exemplo, se a resposta do usuário for diferente de "a", as
                              // tentativas que valem 2, agora passam a valer 1.
                if (tentativas > 0) {
                    System.out.println("Resposta incorreta! Tente novamente.");
                } else {
                    System.out.println("Resposta incorreta! A resposta correta é a) José de Alencar.");
                }
            }
        }
        System.out.println("\nOutros tipos de romance do Romantismo Brasileiro:");
        System.out.println("- " + getRomanceUrbano());
        System.out.println("- " + getRomanceRegionalista());
    }
}