import Entities.Audio;
import Entities.Image;
import Entities.MultimediaItem;
import Entities.Video;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        //raggruppo tutto nell'array creando i singoli elemnti fino a 5
        MultimediaItem[] multimediaItemsArray = new MultimediaItem[5];

        for (int i=0; i < multimediaItemsArray.length; i++){
            System.out.println("Scegli un elemento multimediale da riprodurre/mostrare, tra 'audio', 'video' e 'image'.");
            String item = scanner.nextLine();

            System.out.println("Inserisci un titolo: ");
            String title= scanner.nextLine();

            switch (item.toLowerCase()){
                case "audio":
                    System.out.println("Inserisci la durata e il livello del volume: ");
                    int audioDuration = scanner.nextInt();
                    int audioVolume = scanner.nextInt();
                    scanner.nextLine(); //ho appena scoperto che va a capo solo così
                    multimediaItemsArray[i] = new Audio(title,audioDuration, audioVolume);
                    break;

                case "video":
                    System.out.println("Inserisci durata, volume e luminosità del tuo video: ");
                    int videoDuration = scanner.nextInt();
                    int videoVolume = scanner.nextInt();
                    int videoBrightness = scanner.nextInt();
                    scanner.nextLine();
                    multimediaItemsArray[i] = new Video(title, videoDuration,videoVolume,videoBrightness);
                    break;

                case "image":
                    System.out.println("Scegli la luminosità: ");
                    int imgBrightness = scanner.nextInt();
                    scanner.nextLine();
                    multimediaItemsArray[i] = new Image(title, imgBrightness);
                    break;

                default:
                    System.out.println("Elemento non riconosciuto!");
                    break;
            }
        }
        //ora posso scegliere quale mostrare tra gli elementi creati, con il controllo tra le classi
        int userChoise;
        do{
            System.out.println("Scegli un elemento da eseguire (da 1 a 5), oppure digita '0' per uscire.");
            userChoise = scanner.nextInt();
            if(userChoise > 0 && userChoise <= 5){
                MultimediaItem selectedItem = multimediaItemsArray[userChoise - 1];
                if (selectedItem instanceof Audio){
                    ((Audio)selectedItem).play();
                } else if (selectedItem instanceof Video){
                    ((Video)selectedItem).play();

                }else if (selectedItem instanceof Image){
                    ((Image)selectedItem).show();
                }
            }
        } while (userChoise != 0);


        scanner.close();
    }

}