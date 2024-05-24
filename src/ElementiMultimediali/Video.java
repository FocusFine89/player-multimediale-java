package ElementiMultimediali;

import interfaces.Playable;

public class Video extends Audio implements Playable {
    //Attributi
    protected byte luminosita;

    //Costruttori
    public Video(String nome, short durata, byte volume, byte luminosita) {
        super(nome, durata, volume);
        this.luminosita = luminosita;

    }

    //Metodi
    @Override
    public void play() {
        String volumeGrafico = "";
        String luminositaGrafica = "";

        for (int i = 0; i < this.luminosita; i++) {
            luminositaGrafica += "*";

        }

        for (int i = 0; i < this.volume; i++) {
            volumeGrafico += "!";

        }
        for (int i = 0; i < this.durata; i++) {
            System.out.println(this.nome);
            System.out.println("Volume: " + volumeGrafico);
            System.out.println("Luminosità: " + luminositaGrafica);
        }
    }

    public void setLuminosita(byte luminosita) {
        this.luminosita = luminosita;

    }

}
