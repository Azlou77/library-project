public class Cassette extends Document{
    private String  author;
    private int time;

    public Cassette(String title, String author, int time){
        super(title);
        this.author = author;
        this.time = time;
    }
    public String toString(){
        return super.toString() +  " - Author : " + author + "- Time" + time;
    }
}
