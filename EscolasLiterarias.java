public abstract class EscolasLiterarias extends Materia{

    private String ExemploDeObras;

    public void setExemploDeObras (String ExemploDeObras){
        this.ExemploDeObras = ExemploDeObras;
    }

    public String getExemploDeObras (){
        return ExemploDeObras;
    }

    @Override
    public String definicao(){
        String r = "o";
        return r;
    }

    public abstract void quiz();

}