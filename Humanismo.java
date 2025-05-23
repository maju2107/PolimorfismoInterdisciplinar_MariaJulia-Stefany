import java.util.Scanner;

public class Humanismo extends EscolasLiterarias {

    private String definicaoHumanismo = "O humanismo é um movimento intelectual e cultural que valoriza a dignidade e o potencial do ser humano, buscando uma compreensão mais ampla da experiência humana.";

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
        int tentativas = 2;
        boolean acertou = false;

        System.out.println("Quem é o principal autor do teatro humanista português?:");
        System.out.println("a) Gracialino Ramos");
        System.out.println("b) Machado de Assis");
        System.out.println("c) Gil Vicente");

        while (tentativas > 0 && !acertou) {
            System.out.print("Resposta: ");
            String resposta = teclado.nextLine().trim().toLowerCase(); // esse "trim" remove espaços em branco do começo
                                                                       // e do fim da resposta (evita erros de leitura)

            if (resposta.equals("c")) {
                System.out.println(
                        "Resposta correta! Gil Vicente é o principal autor do teatro humanista português.");
                acertou = true;
            } else {
                tentativas--; // decremento. Por exemplo, se a resposta do usuário for diferente de "a", as
                              // tentativas que valem 2, agora passam a valer 1.
                if (tentativas > 0) {
                    System.out.println("Resposta incorreta! Tente novamente.");
                } else {
                    System.out.println("Resposta incorreta! A resposta correta é c) Gil VIcente.");
                }
            }
        }
        System.out.println("\nOutros tipos de obras no Humanismo:");
        System.out.println("- Auto: " + getAutos());
        System.out.println("- Farsa:  " + getFarsas());
    }
}
