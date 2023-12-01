package Entities;

public class Image extends MultimediaItem implements Adjustable{
    private int brightness;

    public Image (String title, int brightness){
        super(title);
        this.brightness = brightness;
    }
    //show() solo per le immagini
    public void show(){
        System.out.println(getTitle());
        for(int i = 0; i < brightness; i++){
            System.out.println("*");
        }
    }
    @Override
    public void brightUp() {
        if (this.brightness < 5) this.brightness++;
        else System.out.println("Luminosità al MASSIMO");
    }

    @Override
    public void brightDown() {
        if (this.brightness > 1)this.brightness--;
        else System.out.println("Luminosità al MINIMO");
    }
}
