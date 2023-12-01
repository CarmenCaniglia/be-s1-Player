import Entities.Audio;
import Entities.Image;
import Entities.Video;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        Image myImage = new Image("Foto ");
        /*String input;
       System.out.println("Configura la luminosità dell'immagine:");
        myImage.show();

        do{
            System.out.println("Scrivi 'up' per aumentare e 'down' per diminuire la luminosità.--> 'exit' se vuoi uscire.");
            input = scanner.nextLine();
             switch (input){
                 case "up":
                     myImage.brightUp();
                     break;
                 case "down":
                     myImage.brightDown();
                     break;
                 case "exit":
                     System.out.println("Fine della configurazione!");
                     break;
                 default:
                     System.out.println("Comando non valido!!!");
                     break;
             }
             myImage.show();
        }while (!input.equals("exit")); */

        Audio audio= new Audio("Song ", 120,10);
        Video video= new Video("Video ", 100, 10, 5);

        String input;
        do{
            System.out.println("Scegli un'opzione: 'audio', 'video', 'image'");
            input= scanner.nextLine();

            switch (input){
                case "audio":
                    audio.play();
                    break;
                case "video":
                    video.play();
                    break;
                case "image":
                    myImage.show();
                    break;
                default:
                    System.out.println("Comando non valido!!!");
                    break;
            }
        } while (!input.equals("exit"));

        scanner.close();
    }

}