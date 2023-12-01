package Entities;

public class Video extends MultimediaItem implements Playable, Adjustable {
    private int volume;
    private int brightness;
    private int duration;
    public Video (String title, int duration, int volume, int brightness){
        super(title);
        this.duration= duration;
        this.brightness = brightness;
        this.volume = volume;
    }
    public int getDuration() {
        return duration;
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

    @Override
    public void play() {
        System.out.println("Riproduci video: "+getTitle() + " per " +getDuration()+"sec");
        for (int i = 0; i<volume; i++){
            System.out.println("!");
        }

        for (int i = 0; i < brightness; i++) {
            System.out.println("*");
        }
        System.out.println();
    }

    @Override
    public void volUp() {
        if(this.volume < 10) this.volume++;
        else System.out.println("Il volume è al MASSIMO!");
    }

    @Override
    public void volDown() {
        if(this.volume > 1)this.volume--;
        else System.out.println("Il volume è al MINIMO");
    }
}
