package Entities;

public class Audio extends MultimediaItem implements Playable{
    private int volume;
    private int duration;

    public Audio (String title, int duration, int volume){
        super(title);
        this.duration = duration;
        this.volume = volume;
    }

    public int getDuration() {
        return duration;
    }

    //metodo play() per gli elementi riproducibili
    @Override
    public void play() {
        System.out.println("Riproduci audio: " + getTitle() + " per " + getDuration() + "sec");
        for (int i = 0; i<volume; i++){
            System.out.println("!");
        }
        System.out.println();
    }

    //metodi per il controllo del volume
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
