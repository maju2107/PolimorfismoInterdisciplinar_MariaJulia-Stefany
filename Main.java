import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcao;
        String escolhaEscolaLiteraria;
        String querFazerOquiz;
            do {
            MenuDeOpcoes();

            System.out.println("Digite o número da opção desejada: ");
            opcao = teclado.nextInt();
            teclado.nextLine();

            switch (opcao) {
                case 1:

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

            
                    
                break;

                case 2:
                    
                break;

                case 3:
                    
                break;

                case 0:
                System.out.println("Voce saiuu..!");   
                break;
            
                default:
                 System.out.println("Opção não encontrada dentre as fornecidas pelo sistema!");   
                break;
            }

        } while(opcao!=0);
    }

    private static void MenuDeOpcoes(){
        espaco();
        espaco();
        System.out.println("Seja bem-vindo ao Sistema Interdisciplinar!");
        System.out.println("Qual matéria você gostaria de estudar?");
        System.out.println("1- Português (Escolas Literárias)");
        System.out.println("2- Biologia (Fisiologia Humana)");
        System.out.println("3- História ()");
        System.out.println("0- Sair");
    }

    public static String mostrarDefinicaoDeEscolaLiteraria(EscolasLiterarias escolasLiterarias){ // polimorfismo aplicado
        return escolasLiterarias.definicao();
    }


    public static void espaco(){
        System.out.println("-------------------------------");
    }
}

