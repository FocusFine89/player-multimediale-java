import ElementiMultimediali.Audio;
import ElementiMultimediali.Immagine;
import ElementiMultimediali.Multimedia;
import ElementiMultimediali.Video;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Immagine immagine1 = new Immagine("immagine1", (byte) 3);
        Immagine immagine2 = new Immagine("immagine2", (byte) 10);

        Video video1 = new Video("video1", (short) 4, (byte) 5, (byte) 3);
        Audio audio1 = new Audio("audio1", (short) 2, (byte) 8);
        Audio audio2 = new Audio("audio2", (short) 8, (byte) 4);

        //-------------Programma-------------
        Multimedia[] arrayMultimedia = {immagine1, immagine2, video1, audio1, audio2};
        boolean trigger = true;

        while (trigger == true) {

            for (int i = 0; i < arrayMultimedia.length; i++) {
                System.out.println(i + 1 + " " + arrayMultimedia[i].getNome());

            }
            System.out.println("0 quit");
            int input = Integer.parseInt(sc.nextLine());
            switch (input) {
                case 1:
                    while (true) {
                        System.out.println("1 Show\n 2 imposta luminosità\n 3 quit");
                        input = Integer.parseInt(sc.nextLine());
                        if (input == 1) {
                            immagine1.show();
                        } else if (input == 2) {
                            System.out.println("A quanto vuoi impostare la luminosità (1-10):");
                            byte luminosita = Byte.parseByte(sc.nextLine());
                            immagine1.setLuminosita(luminosita);
                            immagine1.show();
                        } else {
                            break;
                        }
                    }
                    break;
                case 2:
                    while (true) {
                        System.out.println("1 Show\n 2 imposta luminosità\n 3 quit");
                        input = Integer.parseInt(sc.nextLine());
                        if (input == 1) {
                            immagine2.show();
                        } else if (input == 2) {
                            System.out.println("A quanto vuoi impostare la luminosità (1-10):");
                            byte luminosita = Byte.parseByte(sc.nextLine());
                            immagine2.setLuminosita(luminosita);
                            immagine2.show();
                        } else {
                            break;
                        }

                    }
                    break;
                case 3:
                    while (true) {
                        System.out.println("1 play\n 2 imposta volume\n 3 imposta luminosità\n 4 quit");
                        input = Integer.parseInt(sc.nextLine());
                        if (input == 1) {
                            video1.play();
                        } else if (input == 2) {
                            System.out.println("A quanto vuoi impostare il volume (1-10):");
                            byte volume = Byte.parseByte(sc.nextLine());
                            video1.setVolume(volume);
                            video1.play();
                        } else if (input == 3) {
                            System.out.println("A quanto vuoi impostare la luminosità (1-10):");
                            byte luminosita = Byte.parseByte(sc.nextLine());
                            video1.setLuminosita(luminosita);
                            video1.play();
                        } else {
                            break;
                        }

                    }
                    break;
                case 4:
                    while (true) {
                        System.out.println("1 Play\n 2 imposta volume\n 3 quit");
                        input = Integer.parseInt(sc.nextLine());
                        if (input == 1) {
                            audio1.play();
                        } else if (input == 2) {
                            System.out.println("A quanto vuoi impostare il volume (1-10):");
                            byte volume = Byte.parseByte(sc.nextLine());
                            audio1.setVolume(volume);
                            audio1.play();
                        } else {
                            break;
                        }

                    }
                    break;
                case 5:
                    while (true) {
                        System.out.println("1 Play\n 2 imposta volume\n 3 quit");
                        input = Integer.parseInt(sc.nextLine());
                        if (input == 1) {
                            audio2.play();
                        } else if (input == 2) {
                            System.out.println("A quanto vuoi impostare il volume (1-10):");
                            byte volume = Byte.parseByte(sc.nextLine());
                            audio2.setVolume(volume);
                            audio2.play();
                        } else {
                            break;
                        }

                    }
                    break;
                case 0:
                    trigger = false;
                    break;
            }
        }

    }
}