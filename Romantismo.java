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
        System.out.println("\nAlguns tipos de romance do Romantismo Brasileiro:");
        System.out.println("- " + getRomanceUrbano());
        System.out.println("- " + getRomanceRegionalista());
    }
}