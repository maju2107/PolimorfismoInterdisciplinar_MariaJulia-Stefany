public abstract class EscolasLiterarias{
    
    private String nome;
    private String periodo;

    public void setNome (String nome){
        this.nome = nome;
    }

    public void setPeriodo (String perido){
        this.periodo = periodo;
    }

    public String getNome (){
        return nome;
    }

    public String getPeriodo (){
        return periodo;
    }

    public abstract String definicao();
    public abstract void quiz();

}