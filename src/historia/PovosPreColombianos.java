package historia;

import java.util.ArrayList;
import java.util.Scanner;

public class PovosPreColombianos extends CivilizacoesAntigas {

    private String PovosMaias;
    private String PovosAstecas;
    private String PovosIncas;
    private String PovosInuites;
    private String PovosTupinambas;

    public PovosPreColombianos(){
        this.PovosMaias = " Os maias formaram uma grande civilização nas florestas tropicais da América Central,\n com suas principais cidades localizadas na região da Península de Iucatã e atuais Belize e Guatemala.\nOs maias cultivavam milho, tomate, abacate, feijões, abóbora, diversos tipos de pimentas e cacau.\nTambém criavam uma espécie de cachorro para o abate e perus.\nEntre as principais cidades maias, estavam Palenque, Tulum, Chichen Itzá e Tikal,esta última cidade teve, em seu auge, cerca de 50 mil habitantes.\nOs maias também tinham um refinado conhecimento em química, desenvolveram um sistema de escrita,\nelaboraram calendários e, na matemática, foram uma das poucas civilizações a desenvolverem o número zero.";
        this.PovosAstecas = "Os astecas eram povos originários provavelmente da região sul do atual Estados Unidos que migraram para uma ilha no Lago Texcoco,\nno início do século XIV. Essa ilha se tornaria, no século XV, a capital do império asteca, conhecida como Tenochtitlán.\nHoje no local de Tenochtitlán se localiza a Cidade do México, novamente uma das maiores cidades do mundo.";
        this.PovosIncas = "Os incas formaram na América do Sul, na região da Cordilheira dos Andes, um grande império nas Américas na época da chegada dos europeus,\no Império Inca. Cusco era a capital desse povo e seu território se estendia da Colômbia até o Chile e Argentina.\nUm dos grandes destaques da arquitetura inca é a cidade de Machu Picchu, localizada no Peru\nA medicina inca também alcançou grande desenvolvimento, com médicos realizando cirurgias cranianas, técnica conhecida como trepanação. ";        
        this.PovosInuites = "Muito conhecidos como esquimós, os povos inuítes vivem há mais de 10 mil anos no Ártico, na região dos atuais Canadá, Rússia, Alaska e Groenlândia.\nA pesca e a caça de mamíferos e aves são as principais fontes de alimentos deles, entre os principais\n animais caçados estão: baleias, focas, narvais e caribus.Antigamente os povos inuítes construíam suas casas com\nossos de baleia e com couro de foca. Os iglus, construídos com gelo, eram utilizados principalmente nos acampamentos de caça.\nAlguns povos ainda hoje fabricam iglus no Ártico.";
        this.PovosTupinambas = "Os tupinambás são um povo originário brasileiro, parte da família linguística Tupi-Guarani, que habitava extensas áreas do litoral do Brasil,\ndestacando-se nas regiões Nordeste, Sudeste e Sul.\nSua economia baseava-se na agricultura, pesca e caça, com o comércio entre comunidades indígenas contribuindo para a circulação de bens.\nViviam em aldeias organizadas, construindo casas com paredes de pau a pique e cobertura de palha, promovendo a convivência comunitária";
    }

    // sobrecarga de métodos

    @Override
    public void descubra(){
        System.out.println("Descubra um pouco sobre os povos Pré-Colombianos : Astecas, Incas, Maias, Inuítes e Tupinambás:");
        System.out.println("-Astecas: " + PovosAstecas);
        System.out.println("-Incas: " + PovosIncas );
        System.out.println("-Maias: " + PovosMaias);
        System.out.println("-Inuítes: " + PovosInuites);
        System.out.println("-Tupinambás: " + PovosTupinambas);
    }

    @Override
    public void quiz(){

    Scanner teclado = new Scanner(System.in);
    int pontos = 0;
    ArrayList<String> respostas = new ArrayList<String>();
    int ordem =  1;
        
        System.out.println("Quiz sobre os Povos Pré-Colombianos! Responda todas as perguntas com a letra da alternativa correta.\n");

        System.out.println("Qual dos povos abaixo em uma ilha em um lago?:");
        System.out.println("a) Tupinambás");
        System.out.println("b) Maias");
        System.out.println("c) Incas");
        System.out.println("d) Astecas");
        System.out.println("e) Inuítes");
            String resposta1 = teclado.nextLine().trim().toLowerCase();
        if (resposta1.equals("d")) {
            System.out.println("Resposta correta! O povo Asteca vivia na ilha de Tenochtitlán, localizada no lago Texcoco.");
            pontos++;
        } else {
            System.out.println("Resposta incorreta! A correta é d) Astecas.");
        }
        System.out.println();

        System.out.println("2) Quando Cristóvão Colombo chegou à América?");
        System.out.println("a) Em 15 de novembro de 1400.");
        System.out.println("b) Em 22 de janeiro de 1510.");
        System.out.println("c) Em 12 de outubro de 1492.");
        System.out.println("d) Ele nunca chegou à América.");
        System.out.print("Resposta: ");
        String resposta2 = teclado.nextLine().trim().toLowerCase();
        if (resposta2.equals("c")) {
            System.out.println("Resposta correta! Cristóvão Colombo chegou à América em 12 de outubro de 1492.");
            pontos++;
        } else {
            System.out.println("Resposta incorreta! A correta é c) A Em 12 de outubro de 1492.");
        }
        System.out.println();

        System.out.println("3) Qual a alternativa falsa?");
        System.out.println("a) Os Maias tinham um refinado conhecimento em química.");
        System.out.println("b) Os Incas viviam na região da Cordilheira dos Andes.");
        System.out.println("c) Os Tupinambás são um povo um povo originário brasileiro");
        System.out.println("d) O povo Inuíte foi exterminado há 10 mil anos atrás.");
        System.out.print("Resposta: ");
        String resposta3 = teclado.nextLine().trim().toLowerCase();
        if (resposta3.equals("d")) {
            System.out.println("Resposta correta! O povo Inuíte vive há mais de 10 mil anos no Ártico.");
            pontos++;
        } else {
            System.out.println("Resposta incorreta! A correta é d) O povo Inuíte foi exterminado há 10 mil anos atrás.");
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
        String resumo = "Povos pré-colombianos são todos os povos que viveram na América antes da chegada de Cristóvão Colombo, em 12 de outubro de 1492.\n Foram muito diversos e tiveram as mais variadas características, tradições e costumes.";
        return resumo;
    }
    
}

