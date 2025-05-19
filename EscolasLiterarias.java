public abstract class EscolasLiterarias {

    private String nome;

    public void setNome (String nome){
        this.nome = nome;
    }

     public String getNome(){
        return nome;
    }

    private String ExemploDeObras;

    public void setExemploDeObras (String ExemploDeObras){
        this.ExemploDeObras = ExemploDeObras;
    }

    public String getExemploDeObras (){
        return ExemploDeObras;
    }

    public abstract String definicao();


    public abstract void quiz();

}