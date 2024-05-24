package ElementiMultimediali;

import interfaces.Show;

public class Immagine extends Multimedia implements Show {
    //Attributi
    protected byte luminosita;

    //Costruttori
    public Immagine(String nome, byte luminosita) {
        super(nome);
        this.luminosita = luminosita;
    }

    //Metodi

    @Override
    public void show() {
        String luminositaGrafica = "";

        for (int i = 0; i < this.luminosita; i++) {
            luminositaGrafica += "*";

        }

        System.out.println("Nome: " + this.nome);
        System.out.println("Luminosità: " + luminositaGrafica);
    }

    public void setLuminosita(byte luminosita) {
        this.luminosita = luminosita;

    }
}
