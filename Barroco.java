import java.util.Scanner;

public class Barroco extends EscolasLiterarias {
    
    private String sermoesPadreAntonioVieira ;
    private String sonetosGregorioDeMatos;

    private String definicaoDoBarroco = "O Barroco foi um movimento literário que surgiu no final do século XVI, influenciado pelo contexto da Reforma Protestante e da Contrarreforma Católica.\n Ele se caracteriza pelo culto ao contraste, explorando oposições como religiosidade x sensualidade, espiritualidade x materialismo, e efemeridade x eternidade.\n Utiliza muitas as figuras de linguagem antítese e paradoxo, apresenta temas como fragilidade humana, fugacidade do tempo e crítica à vaidade além de forte influência religiosa e moralizante. ";

    //construtores
    public Barroco (){
        this.sermoesPadreAntonioVieira = "'Sermão de Santo Antônio aos Peixes'. Este sermão sa os peixes como metáforas para criticar os vícios e exaltar as virtudes dos homens — especialmente os exploradores que se diziam cristãos, mas agiam com ganância e crueldade.";
        this.sonetosGregorioDeMatos = "'Pequei, Senhor'. Este soneto explora a temática religiosa e a busca do perdão divíno: o eu-lírico racionaliza sobre os próprios pecados pedindo clemência a Deus.";
    }

    //getters
    public String getSermoesPadreAntonioVieira (){
        return sermoesPadreAntonioVieira;
    }

     public String getSonetosGregorioDeMatos(){
        return sonetosGregorioDeMatos;
    }
    
    @Override
    public String definicao(){
        return definicaoDoBarroco;
    }

    @Override
    public void quiz(){
        Scanner teclado = new Scanner(System.in);
        int tentativas = 2;
        boolean acertou = false;

        System.out.println("Qual dos autores abaixo pertence ao Barroco Brasileiro?:");
        System.out.println("a) Olavo Bilac");
        System.out.println("b) Gregório de Matos");
        System.out.println("c) Álvares de Azevedo");

        while (tentativas > 0 && !acertou) {
            System.out.print("Resposta: ");
            String resposta = teclado.nextLine().trim().toLowerCase(); // esse "trim" remove espaços em branco do começo
                                                                       // e do fim da resposta (evita erros de leitura)

            if (resposta.equals("b")) {
                System.out.println(
                        "Resposta correta! Gregório de Matos é um autor que pertence ao Barroco Brasileiro.");
                acertou = true;
            } else {
                tentativas--; // decremento. Por exemplo, se a resposta do usuário for diferente de "a", as
                              // tentativas que valem 2, agora passam a valer 1.
                if (tentativas > 0) {
                    System.out.println("Resposta incorreta! Tente novamente.");
                } else {
                    System.out.println("Resposta incorreta! A resposta correta é b) Gregório de Matos.");
                }
            }
        }
        System.out.println("\nAlguns tipos de obras no Barroco:");
        System.out.println("- Sermão: " + getSermoesPadreAntonioVieira());
        System.out.println("- Soneto:  " + getSonetosGregorioDeMatos());
    }
    
}