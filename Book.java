public class Book extends Document {
    private int page;
    private String author;
    private String editor;

    public Book(String title, int page, String author, String editor){
        super(title);
        this.page = page;
        this.author = author;
        this.editor = editor;
    }

    public String toString(){
        return super.toString() + " - Pages : " + page + " - Author : " + author + "- Editor" + editor;
    }
    
}
