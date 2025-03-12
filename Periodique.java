public class Periodique extends Document{
    private String frequence;
    private int page;

    public Periodique(String title, int page, String frequence){
        super(title);
        this.page = page;
        this.frequence = frequence;
    

    }
    public String toString(){
        return super.toString() + " - Pages : " + page + " - Fréquence : " + frequence;
    }
    
}
