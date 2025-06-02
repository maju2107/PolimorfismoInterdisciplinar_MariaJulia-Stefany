package historia;

public abstract class CivilizacoesAntigas {

    private String nome;
    private String MaisInteressante;


    public void setNome (String nome){
        this.nome = nome;
    }

     public String getNome(){
        return nome;
    }

    public void setMaisInteressante(String MaisInteressante){
        this.MaisInteressante  = MaisInteressante;
    }

    public String getMaisInteressante(){
        return MaisInteressante;
    }

    public abstract String resumo();
    public abstract void quiz();
    public abstract void descubra();

}

