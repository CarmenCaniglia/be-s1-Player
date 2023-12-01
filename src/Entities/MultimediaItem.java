package Entities;

public abstract class MultimediaItem {
    //il titolo è l'unico elemento in comune tra le sottoclassi
    private final String title;

    public MultimediaItem(String title){
        this.title = title;
    }

    public String getTitle(){
        return title;
    }

}
