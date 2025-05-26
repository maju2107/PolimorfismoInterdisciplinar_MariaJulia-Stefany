import java.util.Scanner;

public class Vegetal extends Sistemas{
    private String sistemaDermico;
    private String sistemaFundamental;
    private String sistemaVascular;

    private String tipoVegetal = "Vegetal";

    // construtores
    public Vegetal() {
        this.sistemaDermico = "É a camada mais externa da planta, responsável pela proteção e revestimento. Inclui a epiderme e o periderme. ";
        this.sistemaFundamental = "Envolve o tecido parenquimático, que preenche os órgãos da planta e desempenha funções de armazenamento, suporte e nutrição. ";
        this.sistemaVascular = "É responsável pelo transporte de água e nutrientes, e inclui os tecidos xilema (transporte de água) e floema (transporte de nutrientes). ";
    }

    // getters
    public String getSistemaDermico() {
        return sistemaDermico;
    }

    public String getSistemaFundamental() {
        return sistemaFundamental;
    }

    public String getSistemaVascular() {
        return sistemaVascular;
    }

    @Override
    public String tipo() {
        return tipoVegetal;
    }

    @Override
    public void quiz() {
        Scanner teclado = new Scanner(System.in);
        int tentativas = 2;
        boolean acertou = false;

        System.out.println("O Sistema Vegetal é composto por:");
        System.out.println("a) Respiratório, Nervoso, Endócrino");
        System.out.println("b) Dermico, Fundamental, Pulmonar");
        System.out.println("c) Digestório Complexo e Simples");
        System.out.println("d) Os itens'b' e 'c' estão corretas");

        while (tentativas > 0 && !acertou) {
            System.out.print("Resposta: ");
            String resposta = teclado.nextLine().trim().toLowerCase(); // esse "trim" remove espaços em branco do começo
                                                                       // e do fim da resposta (evita erros de leitura)

            if (resposta.equals("b")) {
                System.out
                        .println("Resposta correta! O Sistema Vegetal é composto por Dermico, Fundamental, Pulmonar.");
                acertou = true;
            } else {
                tentativas--; // decremento. Por exemplo, se a resposta do usuário for diferente de "a", as
                              // tentativas que valem 2, agora passam a valer 1.
                if (tentativas > 0) {
                    System.out.println("Resposta incorreta! Tente novamente.");
                } else {
                    System.out.println("Resposta incorreta! A resposta correta é b) Dermico, Fundamental, Pulmonar.");
                }
            }
        }
        System.out.println("\nRevise mais informações sobre o Sistema Vegetal:");
        System.out.println("- Dermico: " + getSistemaDermico());
        System.out.println("- Fundamental:  " + getSistemaFundamental());
        System.out.println("- Vascular:  " + getSistemaVascular());
    }
}
