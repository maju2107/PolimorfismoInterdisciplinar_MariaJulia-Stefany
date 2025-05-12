public abstract class EscolasLiterarias{

    private String nome;
    private String periodo;

    public void setNome (String nome){
        this.nome = nome;
    }

    public void setPeriodo (String perido){
        this.periodo = perido;
    }

    public String getNome (){
        return nome;
    }

    public String getPerido (){
        return periodo;
    }

    public abstract String definicao();
    public abstract void quiz();

}