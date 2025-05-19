import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcao;
            do {
            MenuDeOpcoes();

            System.out.println("Digite o número da opção desejada: ");
            opcao = teclado.nextInt();

            switch (opcao) {
                case 1:

                 System.out.println("Digite o nome da Escola Literária você deseja estudar (Barroco, Humanismo ou Romantismo) : ");
                 String escolhaEscolaLiteraria = teclado.nextLine().toLowerCase();

                 if (escolhaEscolaLiteraria == "barroco"){
                    Materia portugues = new Barroco();
                    EscolasLiterarias barroco = new Barroco ();
                    barroco.setNome("Barroco");

                    System.out.println("Digite o nome de um exemplo de obra literária Barroca :");
                    barroco.setExemploDeObras(teclado.nextLine());

                 }

                 if ( escolhaEscolaLiteraria == "humanismo"){
                    Materia portugues = new Humanismo ();
                 } 

                 if ( escolhaEscolaLiteraria == "romantismo"){
                    Materia portugues = new Romantismo ();
                 } 

            
                    
                break;

                case 2:
                    
                break;

                case 3:
                    
                break;
            
                default:
                 System.out.println("Opção não encontrada dentre as fornecidas pelo sistema!");   
                break;
            }

        
        } while(opcao!=0);
    }

    private static void MenuDeOpcoes(){
        System.out.println("Seja bem-vindo ao Sistema Interdisciplinar!");
        System.out.println("Qual matéria você gostaria de estudar?");
        System.out.println("1- Português (Escolas Literárias)");
        System.out.println("2- Biologia (Fisiologia Humana)");
        System.out.println("3- História ()");
        System.out.println("0- Sair");
    }

    public static String mostrarDefinicaoDaMateria(Materia materia){
        return materia.definicao();
    }
}

