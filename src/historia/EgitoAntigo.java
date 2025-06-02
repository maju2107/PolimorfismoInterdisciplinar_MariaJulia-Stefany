package historia;

import java.util.Scanner;

public class EgitoAntigo extends CivilizacoesAntigas{

    private static String Sociedade;
    private String Governo;
    private String Mumificacao;

    public EgitoAntigo(){
        this.Sociedade = "A sociedade egípcia era profundamente hierarquizada, portanto, havia grupos sociais com papéis muito bem definidos.\nO topo da sociedade egípcia era representado pelo faraó, o governante considerado a encarnação divina na Terra.\nAbaixo do faraó, vinham os outros grupos que compunham a sociedade egípcia: funcionários de Estado e sacerdotes, comerciantes, militares, artesões, camponeses e escravos.";
        this.Governo = "O Egito era governado pelo faraó, dono das terras, executor da justiça e comandante das tropas. Possuía uma série de burocratas que o auxiliavam no comando do reino, como o vizir, o segundo em comando nas terras egípcias.\nO poder do faraó era teocrático, porque ele era considerado um deus, e hereditário, porque era transmitido para os seus herdeiros.";
        this.Mumificacao = "Um dos hábitos mais tradicionais da cultura egípcia era a mumificação dos mortos.\nNessa prática funerária, os egípcios realizavam um processo para garantir a preservação do corpo da pessoa que havia morrido, e o objetivo dessa prática era que ela pudesse gozar da vida após sua morte.";
    }

    @Override
    public void descubra(){
        System.out.println("Descubra um pouco sobre a Sociedade, o Governo e a Mumificação do Egito Antigo:");
        System.out.println("-Sociedade: " + Sociedade);
        System.out.println("-Governo: " + Governo);
        System.out.println("-Mumificação: " + Mumificacao);
    }


    @Override
    public void quiz(){
        Scanner teclado = new Scanner(System.in);
        int tentativas = 2;
        boolean acertou = false;

        System.out.println("Quem governava o Egito Antigo?:");
        System.out.println("a) Os sacerdotes");
        System.out.println("b) As mulheres da linhagem real");
        System.out.println("c) Os camponeses tomavam as decisões");
        System.out.println("d) O Faraó");

        while (tentativas > 0 && !acertou) {
        System.out.print("Resposta: ");
        String resposta = teclado.nextLine().trim().toLowerCase(); // esse "trim" remove espaços em branco do começo
                                                                        // e do fim da resposta (evita erros de leitura)

        if (resposta.equals("d")) {
            System.out.println("Resposta correta! O Faraó era quem governava o Egito Antigo.");
                acertou = true;
        } else {
            tentativas--; // decremento. Por exemplo, se a resposta do usuário for diferente de "d", as tentativas que valem 2, agora passam a valer 1.
                if (tentativas > 0) {
                    System.out.println("Resposta incorreta! Tente novamente.");
                } else {
                    System.out.println("Resposta incorreta! A resposta correta é d) O Faraó.");
                }
            }

        }

    }

    @Override
    public String resumo(){
        String resumo = "-O Egito Antigo foi uma importante civilização da Antiguidade, desenvolvendo-se no nordeste do continente africano,\n às margens do Rio Nilo. O fenômeno das cheias do Nilo garantia a fertilidade do solo no Vale do Nilo, permitindo que os egípcios o cultivassem e tivessem uma das agriculturas mais prósperas da Antiguidade.";
        return resumo;
    }
    
}
