package biologia;

import java.util.Scanner;

public class Animal extends Sistemas{
    private String digestorioCompleto;
    private String respiracaoBranquialOuPulmonar;
    private String sistemaNervosoSimplesOuComplexo;

    private String tipoAnimal = "Animal";

    //construtores 
    public Animal(){
        this.digestorioCompleto = "O sistema digestório dos animais é caracterizado por: Boca, Faringe, Esôfago, Estômago, Intestino Delgado, Intestin Grosso, Reto, Ânus";
        this.respiracaoBranquialOuPulmonar = "A respiração branquial é o processo respiratório utilizado por animais aquáticos, como peixes, onde as brânquias são responsáveis por extrair oxigênio da água. A respiração pulmonar, por outro lado, é o processo respiratório utilizado por animais terrestres, como mamíferos, onde os pulmões são responsáveis por extrair oxigênio do ar.";
        this.sistemaNervosoSimplesOuComplexo = "Sistemas nervosos simples, como os encontrados em animais como as esponjas, são redes nervosas difusas, com células nervosas espalhadas sem uma organização centralizada. Já os sistemas nervosos complexos, presentes em animais mais evoluídos, como os vertebrados, são caracterizados por um sistema nervoso central (SNC) e um sistema nervoso periférico (SNP). ";
    }

    //getters
    public String getDigestorioCompleto (){
        return digestorioCompleto;
    }

     public String getRespiracaoBranquialOuPulmonar(){
        return respiracaoBranquialOuPulmonar;
    }

    public String getSistemaNervosoSimplesOuComplexo(){
        return sistemaNervosoSimplesOuComplexo;
    }
    
    @Override
    public String tipo(){
        return tipoAnimal;
    }

    @Override
    public void quiz(){
        Scanner teclado = new Scanner(System.in);
        int tentativas = 2;
        boolean acertou = false;

        System.out.println("O Sistema Respiratório dos animais é caracterizado por:");
        System.out.println("a) Respiração Branquial ou Pulmonar");
        System.out.println("b) Respiração Simples ou Complexa");
        System.out.println("c) Complexo");
        System.out.println("d) Simples");

        while (tentativas > 0 && !acertou) {
            System.out.print("Resposta: ");
            String resposta = teclado.nextLine().trim().toLowerCase(); // esse "trim" remove espaços em branco do começo
                                                                       // e do fim da resposta (evita erros de leitura)

            if (resposta.equals("a")) {
                System.out.println("Resposta correta! O Sistema Respiratório dos animais é caracterizado por Respiração Branquial ou Pulmonar.");
                acertou = true;
            } else {
                tentativas--; // decremento. Por exemplo, se a resposta do usuário for diferente de "a", as
                              // tentativas que valem 2, agora passam a valer 1.
                if (tentativas > 0) {
                    System.out.println("Resposta incorreta! Tente novamente.");
                } else {
                    System.out.println("Resposta incorreta! A resposta correta é a) Respiração Branquial ou Pulmonar.");
                }
            }
        }
        System.out.println("\nRevise mais informações sobre o Sistema Animal:");
        System.out.println("- Respiratório: " + getRespiracaoBranquialOuPulmonar());
        System.out.println("- Digestório:  " + getDigestorioCompleto());
        System.out.println("- Nervoso:  " + getSistemaNervosoSimplesOuComplexo());
    }
    
}
