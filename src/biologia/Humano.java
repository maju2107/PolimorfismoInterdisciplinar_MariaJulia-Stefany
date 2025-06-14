package biologia;

import java.util.ArrayList;
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

    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_ORANGE = "\u001B[38;5;208m";

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

    // sobrecarga de métodos

    @Override
    public String tipo() {
        return tipoHumano;
    }

    @Override
    public void quiz() {
        Scanner teclado = new Scanner(System.in);
        int pontos = 0;
        ArrayList<String> respostas = new ArrayList<String>();
        int ordem =  1;

        System.out.println(
                "Quiz sobre o Sistema Humano! Responda todas as perguntas com a letra da alternativa correta.\n");

        System.out.println("1) Qual órgão produz insulina no corpo humano?");
        System.out.println("a) Fígado");
        System.out.println("b) Pâncreas");
        System.out.println("c) Estômago");
        System.out.print("Resposta: ");
        String resposta1 = teclado.nextLine().trim().toLowerCase();
        if (resposta1.equals("b")) {
            System.out.println(ANSI_GREEN + "Resposta correta! O pâncreas produz insulina." +ANSI_RESET);
            pontos++;
        } else {
            System.out.println(ANSI_RED +"Resposta incorreta! A correta é b) Pâncreas." +ANSI_RESET);
        }
        System.out.println();

        System.out.println("2) Qual sistema transporta oxigênio e nutrientes por todo o corpo?");
        System.out.println("a) Sistema circulatório");
        System.out.println("b) Sistema digestório");
        System.out.println("c) Sistema esquelético");
        System.out.print("Resposta: ");
        String resposta2 = teclado.nextLine().trim().toLowerCase();
        if (resposta2.equals("a")) {
            System.out.println(ANSI_GREEN +"Resposta correta! O sistema circulatório faz esse transporte."+ANSI_RESET);
            pontos++;
        } else {
            System.out.println(ANSI_RED +"Resposta incorreta! A correta é a) Sistema circulatório."+ANSI_RESET);
        }
        System.out.println();

        System.out.println("3) Qual parte do cérebro é considerada centro de controle das funções vitais?");
        System.out.println("a) Córtex cerebral");
        System.out.println("b) Cerebelo");
        System.out.println("c) Tronco encefálico");
        System.out.print("Resposta: ");
        String resposta3 = teclado.nextLine().trim().toLowerCase();
        if (resposta3.equals("c")) {
            System.out.println(ANSI_GREEN +"Resposta correta! O tronco encefálico controla funções vitais."+ANSI_RESET);
            pontos++;
        } else {
            System.out.println(ANSI_RED +"Resposta incorreta! A correta é c) Tronco encefálico."+ANSI_RESET);
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
                System.out.println(ANSI_YELLOW +"\nParabéns! Você ganhou a Medalha de Ouro"+ANSI_RESET);
                System.out.println(ANSI_YELLOW +"  *********************"+ANSI_RESET);
                System.out.println(ANSI_YELLOW +"  *     CAMPEÃO(A)     *"+ANSI_RESET);
                System.out.println(ANSI_YELLOW +"  *********************"+ANSI_RESET);
                System.out.println(ANSI_YELLOW +"     \\o/    "+ANSI_RESET);
                System.out.println(ANSI_YELLOW +"      |     "+ANSI_RESET);
                System.out.println(ANSI_YELLOW +"     / \\   "+ANSI_RESET);
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
