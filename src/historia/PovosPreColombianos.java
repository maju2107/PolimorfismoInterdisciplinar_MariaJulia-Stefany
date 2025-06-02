package historia;

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
    int tentativas = 2;
    boolean acertou = false;

    System.out.println("Qual dos povos abaixo em uma ilha em um lago?:");
    System.out.println("a) Tupinambás");
    System.out.println("b) Maias");
    System.out.println("c) Astecas");
    System.out.println("d) Incas");
    System.out.println("e) Inuítes");

    while (tentativas > 0 && !acertou) {
    System.out.print("Resposta: ");
    String resposta = teclado.nextLine().trim().toLowerCase(); // esse "trim" remove espaços em branco do começo
                                                                       // e do fim da resposta (evita erros de leitura)

    if (resposta.equals("c")) {
        System.out.println("Resposta correta! O povo Asteca vivia na ilha de Tenochtitlán, localizada no lago Texcoco.");
            acertou = true;
    } else {
        tentativas--; // decremento. Por exemplo, se a resposta do usuário for diferente de "c", as tentativas que valem 2, agora passam a valer 1.
        if (tentativas > 0) {
            System.out.println("Resposta incorreta! Tente novamente.");
        } else {
            System.out.println("Resposta incorreta! A resposta correta é C) Astecas.");
           }
      }

    }

    }

    @Override
    public String resumo(){
        String resumo = "Povos pré-colombianos são todos os povos que viveram na América antes da chegada de Cristóvão Colombo, em 12 de outubro de 1492.\n Foram muito diversos e tiveram as mais variadas características, tradições e costumes.";
        return resumo;
    }
    
}
