package portugues;

public abstract class EscolasLiterarias {

    private String nome;

    public void setNome (String nome){
        this.nome = nome;
    }

     public String getNome(){
        return nome;
    }

    private String CaracteristicaPrincipal ;

    public void setCaracteristicaPrincipal (String CaracteristicaPrincipal ){
        this.CaracteristicaPrincipal  = CaracteristicaPrincipal ;
    }

    public String getCaracteristicaPrincipal  (){
        return CaracteristicaPrincipal ;
    }

    public abstract String definicao();


    public abstract void quiz();

}