package ElementiMultimediali;

import interfaces.Playable;

public class Audio extends Multimedia implements Playable {
    //Attributi
    protected byte volume;

    //Costruttori
    public Audio(String nome, short durata, byte volume) {
        super(nome, durata);
        this.volume = volume;
    }

    //Metodi
    @Override
    public void play() {
        String volumeGrafico = "";
        for (int i = 0; i < this.volume; i++) {
            volumeGrafico += "!";

        }
        for (int i = 0; i < this.durata; i++) {
            System.out.println(this.nome);
            System.out.println("Volume: " + volumeGrafico);
        }
    }

    public void setVolume(byte volume) {
        this.volume = volume;

    }


}
