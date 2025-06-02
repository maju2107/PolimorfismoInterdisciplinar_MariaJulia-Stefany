package opcoes;

import java.util.Scanner;
import historia.*;


public class Opcao3 {

    public void op3() {

    Scanner teclado = new Scanner(System.in);
    String escolhaCivilizacao;
    String querFazerOquiz;


    System.out.println("Digite o nome da Civilização Antiga que você deseja estudar (Egito Antigo, Povos Pré-Colombianos, Império Romano) : ");
    escolhaCivilizacao = teclado.nextLine().toLowerCase();
             

    if (escolhaCivilizacao.equals("egito antigo")){

        CivilizacoesAntigas egitoAntigo = new EgitoAntigo();
        egitoAntigo.setNome("Egito Antigo");

        espaco();

        egitoAntigo.descubra();

        espaco();

        System.out.println("Digite qual você achou mais interessante: (Sociedade, Governo ou Mumificação):");
        egitoAntigo.setMaisInteressante(teclado.next());

        espaco();

        System.out.println(" Você escolheu a Civilização Antiga: "+egitoAntigo.getNome());
        espaco();
        System.out.println(" O aspecto que você achou mais interessante foi: "+egitoAntigo.getMaisInteressante());
        espaco();
        System.out.println(" Resumo sobre o Egito Antigo: "+mostrarResumoDeCivilizacao(egitoAntigo));
        espaco();


        System.out.println("Você deseja fazer um quiz para aprofundar e testar seus conhecimentos sobre o Egito Antigo?");
        teclado.nextLine();
        querFazerOquiz = teclado.nextLine().toLowerCase();
                    

        if(querFazerOquiz.equals("sim")){
            egitoAntigo.quiz();
        }else{
            System.out.println("Que peninha...");
        }

        }

    if (escolhaCivilizacao.equals("imperio romano")){

        CivilizacoesAntigas imperioRomano = new ImperioRomano();
        imperioRomano.setNome("Império Romano");

        espaco();

        imperioRomano.descubra();

        espaco();

        System.out.println("Digite qual você achou mais interessante: (a Crise, a Economia ou as Contribuições :");
        imperioRomano.setMaisInteressante(teclado.next());

        espaco();

        System.out.println(" Você escolheu a Civilização Antiga: " + imperioRomano.getNome());
        espaco();
        System.out.println(" O aspecto que você achou mais interessante foi: "+imperioRomano.getMaisInteressante());
        espaco();
        System.out.println(" Resumo sobre o Império Romano: "+mostrarResumoDeCivilizacao(imperioRomano));
        espaco();


        System.out.println("Você deseja fazer um quiz para aprofundar e testar seus conhecimentos sobre o Império Romano?");
        teclado.nextLine();
        querFazerOquiz = teclado.nextLine().toLowerCase();
                    

        if(querFazerOquiz.equals("sim")){
            imperioRomano.quiz();
        }else{
            System.out.println("Que peninha...");
        }
    } 

    if (escolhaCivilizacao.equals("povos pre-colombianos")){

        CivilizacoesAntigas povosPreColombianos = new PovosPreColombianos();
        povosPreColombianos.setNome("Povos Pré Colombianos");

        espaco();

        povosPreColombianos.descubra();

        espaco();
        
        System.out.println("Digite qual povo você achou mais interessante: (Astecas, Incas, Maias, Inuítes ou Tupinambás):");
        povosPreColombianos.setMaisInteressante(teclado.next());

        espaco();

        System.out.println(" Você escolheu a Civilização Antiga: "+povosPreColombianos.getNome());
        espaco();
        System.out.println(" O povo que você achou mais interessante foi: "+povosPreColombianos.getMaisInteressante());
        espaco();
        System.out.println(" Resumo sobre os Povos Pré Colombianos: "+mostrarResumoDeCivilizacao(povosPreColombianos));
        espaco();


        System.out.println("Você deseja fazer um quiz para aprofundar e testar seus conhecimentos sobre os POvos Pré-Colombianos?");
        teclado.nextLine();
        querFazerOquiz = teclado.nextLine().toLowerCase();
                    

        if(querFazerOquiz.equals("sim")){
            povosPreColombianos.quiz();
        }else{
            System.out.println("Que peninha...");
        }

    }

    }

    // métodos usados dentro do método op3

    public String mostrarResumoDeCivilizacao(CivilizacoesAntigas civilizacoesAntigas){  
            return civilizacoesAntigas.resumo();
    }
                                                                                            
    public void espaco(){
        System.out.println("-------------------------------");
    }
}
