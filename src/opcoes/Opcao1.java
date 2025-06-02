package opcoes;

import portugues.*;
import java.util.Scanner;

public class Opcao1 {

    public void op1() {

    Scanner teclado = new Scanner(System.in);
    String escolhaEscolaLiteraria;
    String querFazerOquiz;


    System.out.println("Digite o nome da Escola Literária você deseja estudar (Barroco, Humanismo ou Romantismo) : ");
    escolhaEscolaLiteraria = teclado.nextLine().toLowerCase();
             

    if (escolhaEscolaLiteraria.equals("barroco")){

        EscolasLiterarias barroco = new Barroco ();
        barroco.setNome("Barroco");

        System.out.println(" Defina a Escola Literária Barroca com uma única palavra:");
        barroco.setCaracteristicaPrincipal(teclado.next());

        espaco();

        System.out.println(" Você escolheu a Escola Literária: "+barroco.getNome());
        espaco();
        System.out.println(" Você definiu o Barroco com a seguinte palavra: "+barroco.getCaracteristicaPrincipal());
        espaco();
        System.out.println(" A definição do Barroco é: "+mostrarDefinicaoDeEscolaLiteraria(barroco));
        espaco();


        System.out.println("Você deseja fazer um quiz para aprofundar e testar seus conhecimentos sobre o Barroco?");
        teclado.nextLine();
        querFazerOquiz = teclado.nextLine().toLowerCase();
                    

        if(querFazerOquiz.equals("sim")){
            barroco.quiz();
        }else{
            System.out.println("Que peninha...");
        }

        }

        if (escolhaEscolaLiteraria.equals("humanismo")){

            EscolasLiterarias humanismo = new Humanismo ();
            humanismo.setNome("Humanismo");

            System.out.println(" Defina a Escola Literária Humanismo com uma única palavra:");
            humanismo.setCaracteristicaPrincipal(teclado.next()); // pegar a primeira palavra

            espaco();

            System.out.println(" Você escolheu a Escola Literária: "+humanismo.getNome());
            espaco();
            System.out.println(" Você definiu o Humanismo com a seguinte palavra: "+humanismo.getCaracteristicaPrincipal());
            espaco();
            System.out.println(" A definição do Humanismo é: "+mostrarDefinicaoDeEscolaLiteraria(humanismo));
            espaco();


            System.out.println("Você deseja fazer um quiz para aprofundar e testar seus conhecimentos sobre o Humanismo?");
            teclado.nextLine();
            querFazerOquiz = teclado.nextLine().toLowerCase();
                    

            if(querFazerOquiz.equals("sim")){
                humanismo.quiz();
            }else{
                System.out.println("Que peninha...");
            }     
            } 

            if (escolhaEscolaLiteraria.equals("romantismo")){

                EscolasLiterarias romantismo = new Romantismo ();
                romantismo.setNome("Romantismo");

                System.out.println(" Defina a Escola Literária Romantismo com uma única palavra:");
                romantismo.setCaracteristicaPrincipal(teclado.next());

                espaco();

                System.out.println(" Você escolheu a Escola Literária: "+romantismo.getNome());
                espaco();
                System.out.println(" Você definiu o Romantismo com a seguinte palavra: "+romantismo.getCaracteristicaPrincipal());
                espaco();
                System.out.println(" A definição do Romantismo é: "+mostrarDefinicaoDeEscolaLiteraria(romantismo));
                espaco();

                System.out.println("Você deseja fazer um quiz para aprofundar e testar seus conhecimentos sobre o Romantismo?");
                teclado.nextLine();
                querFazerOquiz = teclado.nextLine().toLowerCase();
                    

                if(querFazerOquiz.equals("sim")){
                    romantismo.quiz();
                }else{
                    System.out.println("Que peninha...");
                }

                }
    }

    // métodos usados dentro do método op1

    public String mostrarDefinicaoDeEscolaLiteraria(EscolasLiterarias escolasLiterarias){  
            return escolasLiterarias.definicao();
    }
                                                                                            
    public void espaco(){
        System.out.println("-------------------------------");
    }

}