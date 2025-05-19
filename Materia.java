public abstract class Materia {

    private String nome;

    public void setNome (String nome){
        this.nome = nome;
    }

     public String getNome (){
        return nome;
    }

    public abstract String definicao();

    
}
