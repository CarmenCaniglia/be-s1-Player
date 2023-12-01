import Entities.Image;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        Image myImage = new Image("Foto");
        String input;
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
        }while (!input.equals("exit"));

        scanner.close();
    }

}