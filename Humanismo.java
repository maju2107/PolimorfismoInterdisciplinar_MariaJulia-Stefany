public class Humanismo extends EscolasLiterarias {

    private String definicaoHumanismo = "O humanismo é um movimento intelectual e cultural que valoriza a dignidade e o potencial do ser humano, buscando uma compreensão mais ampla da experiência humana.";

    private String autos;
    private String farsas;

    public Humanismo(String autos, String farsas) {
        this.autos = autos;
        this.farsas = farsas;
    }

    @Override
    public String definicao() {
       return definicaoHumanismo;
    }

    @Override
    public void quiz(){
        return;
    }
}
