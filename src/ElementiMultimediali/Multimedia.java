package ElementiMultimediali;

public abstract class Multimedia {
    //Attributi
    protected String nome;
    protected short durata;

    //Costruttori
    public Multimedia(String nome) {
        this.nome = nome;
    }


    public Multimedia(String nome, short durata) {
        this.nome = nome;
        this.durata = durata;
    }
    //Metodi


    public String getNome() {
        return nome;
    }
}
