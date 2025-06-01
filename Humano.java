import java.util.Scanner;

public class Humano extends Sistemas {
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
        this.sistemaTegumentar = "Protege o corpo de agentes externos, como a pele, unhas e pelos.\n";
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
