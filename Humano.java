import java.util.Scanner;

public class Humano extends Sistemas{
    private String sistemaDigestorio;
    private String sistemaRespiratorio;
    private String sistemaCirculatorio;
    private String sistemaNervoso;
    private String sistemaEndocrino;
    private String sistemaExcretor;
    private String sistemaEsqueletico;
    private String sistemaMuscular;
    private String sistemaImunologico;
    private String sistemaSensorial;
    private String sistemaTegumentar;
    private String sistemaReprodutor;

    private String tipoHumano = "Humano";

    // construtores
    public Humano() {
        this.sistemaDigestorio = "Processa os alimentos para que os nutrientes sejam absorvidos.";
        this.sistemaRespiratorio = "Responsável pela troca de gases, como oxigênio e dióxido de carbono.";
        this.sistemaCirculatorio = "Transporta sangue e nutrientes por todo o corpo.";
        this.sistemaNervoso = "Controla as atividades do corpo, incluindo pensamentos, emoções e movimentos.";
        this.sistemaEndocrino = "Produz hormônios que regulam diversas funções do corpo.";
        this.sistemaExcretor = "Elimina resíduos do metabolismo.";
        this.sistemaEsqueletico = "Fornece suporte e estrutura ao corpo.";
        this.sistemaMuscular = "Responsável pelos movimentos do corpo.";
        this.sistemaImunologico = "Defende o corpo contra doenças.";
        this.sistemaSensorial = "Permite que o corpo perceba o ambiente através dos sentidos.";
        this.sistemaTegumentar = "Protege o corpo de agentes externos, como a pele, unhas e pelos.";
        this.sistemaReprodutor = "Responsável pela reprodução.";
    }

    // getters
    public String getSistemaRespiratorio() {
        return sistemaRespiratorio;
    }

    public String getSistemaCirculatorio() {
        return sistemaCirculatorio;
    }

    public String getSistemaDigestorio() {
        return sistemaDigestorio;
    }

    public String getSistemaEsqueletico() {
        return sistemaEsqueletico;
    }

    public String getSistemaExcretor() {
        return sistemaExcretor;
    }

    public String getSistemaEndocrino() {
        return sistemaEndocrino;
    }

    public String getSistemaMuscular() {
        return sistemaMuscular;
    }

    public String getSistemaImunologico() {
        return sistemaImunologico;
    }

    public String getSistemaSensorial() {
        return sistemaSensorial;
    }

    public String getSistemaNervoso() {
        return sistemaNervoso;
    }

    public String getSistemaTegumentar() {
        return sistemaTegumentar;
    }

    public String getSistemaReprodutor() {
        return sistemaReprodutor;
    }

    @Override
    public String tipo() {
        return tipoHumano;
    }

    @Override
    public void quiz() {
        Scanner teclado = new Scanner(System.in);
        int tentativas = 2;
        boolean acertou = false;

        System.out.println("O esôfago é um orgão que faz parte de qual sistema?");
        System.out.println("a) Excretor");
        System.out.println("b) Nervoso");
        System.out.println("c) Circulatório");
        System.out.println("d) Digestório");

        while (tentativas > 0 && !acertou) {
            System.out.print("Resposta: ");
            String resposta = teclado.nextLine().trim().toLowerCase(); // esse "trim" remove espaços em branco do começo
                                                                       // e do fim da resposta (evita erros de leitura)

            if (resposta.equals("d")) {
                System.out.println("Resposta correta! O esôfago faz parte do sistema Digestório.");
                acertou = true;
            } else {
                tentativas--; // decremento. Por exemplo, se a resposta do usuário for diferente de "a", as
                              // tentativas que valem 2, agora passam a valer 1.
                if (tentativas > 0) {
                    System.out.println("Resposta incorreta! Tente novamente.");
                } else {
                    System.out.println("Resposta incorreta! A resposta correta é d) Digestório.");
                }
            }
        }
        System.out.println("\nRevise mais informações sobre o Sistema Humano:");
        System.out.println("- Digestório: " + getSistemaDigestorio());
        System.out.println("- Circulatório:  " + getSistemaCirculatorio());
        System.out.println("- Endócrino:  " + getSistemaEndocrino());
        System.out.println("- Esquelético:  " + getSistemaEsqueletico());
        System.out.println("- Excretor:  " + getSistemaExcretor());
        System.out.println("- Imunológico:  " + getSistemaImunologico());
        System.out.println("- Muscular:  " + getSistemaMuscular());
        System.out.println("- Nervoso:  " + getSistemaNervoso());
        System.out.println("- Respiratório:  " + getSistemaRespiratorio());
        System.out.println("- Sensorial:  " + getSistemaSensorial());
        System.out.println("- Digestório:  " + getSistemaDigestorio());
        System.out.println("- Tegumentar:  " + getSistemaTegumentar());
    }
}
