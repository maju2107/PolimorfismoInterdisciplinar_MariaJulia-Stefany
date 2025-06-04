package historia;

import java.util.ArrayList;
import java.util.Scanner;

public class ImperioRomano extends CivilizacoesAntigas {

    private String CriseDoImperioRomano;
    private String Economia ;
    private String ContribuicoesDeixadas;
    

    public ImperioRomano(){
        this.CriseDoImperioRomano = "A primeira manifestação dessa crise deu-se na economia, que demonstrou sinais de enfraquecimento.\nIsso porque, ao longo do período imperial, a dependência da economia romana, sobretudo na porção ocidental do império, do trabalho dos escravos tornou-se excessiva.\nPara agravar a situação, a corrupção e a disputa pelo poder em Roma contribuiram para desestabilizar o império, que estava no caminho do desmoronamento.\nO fator que teve peso decisivo no fim dele foram as invasões germânicas, que começaram a acontecer em larga escala a partir do século III d.C.";
        this.Economia = "A economia do Império Romano se baseava na agricultura, com o trabalho dos camponeses e dos escravos, e o comércio que se intensificou à medida que o império expandia seus territórios.\nDurante o período imperial, foram utilizadas diversas moedas de ouro, prata, bronze e cobre.\nAlgumas regiões tinham as suas próprias moedas para as trocas locais.";
        this.ContribuicoesDeixadas = "Entre as principais contribuições do Império Romano destacam-se: desenvolvimento de sofisticados sistemas rodoviários,sistema de leis, calendário juliano, latim, divisão de poderes,sistema de numeração romano, avanços na construção de aquedutos, esgoto e drenagens, dentre outras.";
    }

    // sobrecarga de métodos

    @Override
    public void descubra(){
        System.out.println("Descubra um pouco sobre a Crise do Império Romano, sua Economia e as Contribuições deixadas por ele:");
        System.out.println("-Crise do Império Romano: " + CriseDoImperioRomano);
        System.out.println("-Economia: " + Economia);
        System.out.println("-Contribuições deixadas: " + ContribuicoesDeixadas);
    }

     @Override
    public void quiz(){
        Scanner teclado = new Scanner(System.in);
        int pontos = 0;
        ArrayList<String> respostas = new ArrayList<String>();
        int ordem =  1;
        
        System.out.println("Quiz sobre o Império Romano! Responda todas as perguntas com a letra da alternativa correta.\n");

        System.out.println("Qual era uma das bases da economia do Império Romano?:");
        System.out.println("a) Confecção de roupas");
        System.out.println("b) Exportação de café");
        System.out.println("c) Trabalho dos camponeses e dos escravos");
        System.out.println("d) Venda de maçãs");
        System.out.print("Resposta: ");
        String resposta1 = teclado.nextLine().trim().toLowerCase();
        if (resposta1.equals("c")) {
            System.out.println("Resposta correta! Uma das bases da economia do Império Romano era o trabalho dos camponeses e dos escravos.");
            pontos++;
        } else {
            System.out.println("Resposta incorreta! A correta é c) Trabalho dos camponeses e dos escravos.");
        }
        System.out.println();

        System.out.println("2) Em qual aspecto houve a primeira manifistação da crise?");
        System.out.println("a) Na economia.");
        System.out.println("b) Nas relações com o povo.");
        System.out.println("c) Na construção estradas.");
        System.out.println("d) Na educação das pessoas.");
        System.out.print("Resposta: ");
        String resposta2 = teclado.nextLine().trim().toLowerCase();
        if (resposta2.equals("a")) {
            System.out.println("Resposta correta! A primeira manifestação da crise deu-se na economia.");
            pontos++;
        } else {
            System.out.println("Resposta incorreta! A correta é a) A Na economia.");
        }
        System.out.println();

        System.out.println("3) Qual a alternativa verdadeira?");
        System.out.println("a) As invasões germânicas começaram a partir de IV d.c.");
        System.out.println("b) O Império Romano não deixou nenhuma contribuição para a Sociedade.");
        System.out.println("c) O último imperador de Roma foi Rômulo Augusto.");
        System.out.println("d) O império tinha muita dificuldade de expandir novas terras.");
        System.out.print("Resposta: ");
        String resposta3 = teclado.nextLine().trim().toLowerCase();
        if (resposta3.equals("c")) {
            System.out.println("Resposta correta! O último imperador de Roma foi Rômulo Augusto.");
            pontos++;
        } else {
            System.out.println("Resposta incorreta! A correta é c) O último imperador de Roma foi Rômulo Augusto..");
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
    }
    
    @Override
    public String resumo(){
        String resumo = "O Império Romano foi a terceira fase da civilização romana, segundo a periodização utilizada pelos historiadores.\n Esse período iniciou-se em 27 a.C., com a coroação de Otávio como imperador de Roma, e estendeu-se até 476 d.C., quando o último imperador,\nRômulo Augusto, foi destituído do trono. Tal evento colocou fim no império em sua porção ocidental.";
        return resumo;
    }
    
}


