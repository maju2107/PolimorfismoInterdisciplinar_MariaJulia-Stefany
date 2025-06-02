package biologia;

public abstract class Sistemas {
    private String nome;

    public Sistemas() {
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public abstract String tipo();

    public abstract void quiz();
}
