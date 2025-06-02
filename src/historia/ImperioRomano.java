package historia;

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
        int tentativas = 2;
        boolean acertou = false;

        System.out.println("Qual era uma das bases da economia do Império Romano?:");
        System.out.println("a) Confecção de roupas");
        System.out.println("b) Exportação de café");
        System.out.println("c) Trabalho dos camponeses e dos escravos");

        while (tentativas > 0 && !acertou) {
            System.out.print("Resposta: ");
            String resposta = teclado.nextLine().trim().toLowerCase(); // esse "trim" remove espaços em branco do começo
                                                                       // e do fim da resposta (evita erros de leitura)

            if (resposta.equals("c")) {
                System.out.println(
                        "Resposta correta! Uma das bases da economia do Império Romano era o trabalho dos camponeses e dos escravos.");
                acertou = true;
            } else {
                tentativas--; // decremento. Por exemplo, se a resposta do usuário for diferente de "a", as
                              // tentativas que valem 2, agora passam a valer 1.
                if (tentativas > 0) {
                    System.out.println("Resposta incorreta! Tente novamente.");
                } else {
                    System.out.println("Resposta incorreta! A resposta correta é c) Trabalho dos camponeses e dos escravos.");
                }
              }
            }
    }
    
    @Override
    public String resumo(){
        String resumo = "O Império Romano foi a terceira fase da civilização romana, segundo a periodização utilizada pelos historiadores.\n Esse período iniciou-se em 27 a.C., com a coroação de Otávio como imperador de Roma, e estendeu-se até 476 d.C., quando o último imperador,\nRômulo Augusto, foi destituído do trono. Tal evento colocou fim no império em sua porção ocidental.";
        return resumo;
    }
    
}
