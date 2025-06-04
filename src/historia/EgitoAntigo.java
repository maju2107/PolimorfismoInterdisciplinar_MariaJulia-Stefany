package historia;

import java.util.Scanner;
import java.util.ArrayList;

public class EgitoAntigo extends CivilizacoesAntigas{

    private static String Sociedade;
    private String Governo;
    private String Mumificacao;

    public EgitoAntigo(){
        this.Sociedade = "A sociedade egípcia era profundamente hierarquizada, portanto, havia grupos sociais com papéis muito bem definidos.\nO topo da sociedade egípcia era representado pelo faraó, o governante considerado a encarnação divina na Terra.\nAbaixo do faraó, vinham os outros grupos que compunham a sociedade egípcia: funcionários de Estado e sacerdotes, comerciantes, militares, artesões, camponeses e escravos.";
        this.Governo = "O Egito era governado pelo faraó, dono das terras, executor da justiça e comandante das tropas. Possuía uma série de burocratas que o auxiliavam no comando do reino, como o vizir, o segundo em comando nas terras egípcias.\nO poder do faraó era teocrático, porque ele era considerado um deus, e hereditário, porque era transmitido para os seus herdeiros.";
        this.Mumificacao = "Um dos hábitos mais tradicionais da cultura egípcia era a mumificação dos mortos.\nNessa prática funerária, os egípcios realizavam um processo para garantir a preservação do corpo da pessoa que havia morrido, e o objetivo dessa prática era que ela pudesse gozar da vida após sua morte.";
    }

    // sobrecarga de métodos

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
        int pontos = 0;
        ArrayList<String> respostas = new ArrayList<String>();
        int ordem =  1;

        System.out.println("Quiz sobre o Egito Antigo! Responda todas as perguntas com a letra da alternativa correta.\n");

        System.out.println("Quem governava o Egito Antigo?:");
        System.out.println("a) Os sacerdotes");
        System.out.println("b) As mulheres da linhagem real");
        System.out.println("c) Os camponeses tomavam as decisões");
        System.out.println("d) O Faraó");
        System.out.print("Resposta: ");
        String resposta1 = teclado.nextLine().trim().toLowerCase(); // trim: tirar os espaços, toLowerCase(): deixar a resposta em minúsculo
        if (resposta1.equals("d")) {
            System.out.println("Resposta correta! O Faraó era quem governava o Egito Antigo.");
            pontos++;
        } else {
            System.out.println("Resposta incorreta! A correta é d) o Faraó.");
        }
        System.out.println();

        System.out.println("2) Qual era um dos hábitos mais tradicionais da cultura egípcia?");
        System.out.println("a) A cremação dos mortos");
        System.out.println("b) Nadar no Rio Nilo");
        System.out.println("c) A mumificação dos mortos");
        System.out.println("d) Dormir em redes");
        System.out.print("Resposta: ");
        String resposta2 = teclado.nextLine().trim().toLowerCase(); 
        if (resposta2.equals("c")) {
            System.out.println("Resposta correta! A mumificação dos corpos era um dos hábitos mais comuns.");
            pontos++;
        } else {
            System.out.println("Resposta incorreta! A correta é c) A mumificação dos mortos.");
        }
        System.out.println();

        System.out.println("3) Qual a alternativa falsa?");
        System.out.println("a) A sociedade egípcia era hierarquizada.");
        System.out.println("b) Os camponeses poderiam facilmente subir para o topo da sociedade");
        System.out.println("c) O Faraó era considerado uma encarnação divina");
        System.out.println("d) O segundo em comando nas terras egípcias era o vizir.");
        System.out.print("Resposta: ");
        String resposta3 = teclado.nextLine().trim().toLowerCase();
        if (resposta3.equals("b")) {
            System.out.println("Resposta correta! Os camponeses não poderiam facilmente subir para o topo da sociedade.");
            pontos++;
        } else {
            System.out.println("Resposta incorreta! A correta é b) Os camponeses poderiam facilmente subir para o topo da sociedade.");
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
                System.out.println("\nBoa, parabéns! Você ganhou a Medalha de Bronze");
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

        System.out.println();

    }

    @Override
    public String resumo(){
        String resumo = "-O Egito Antigo foi uma importante civilização da Antiguidade, desenvolvendo-se no nordeste do continente africano,\n às margens do Rio Nilo. O fenômeno das cheias do Nilo garantia a fertilidade do solo no Vale do Nilo, permitindo que os egípcios o cultivassem e tivessem uma das agriculturas mais prósperas da Antiguidade.";
        return resumo;
    }
    
}

