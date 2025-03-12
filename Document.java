import java.util.Date;
public class Document {
        private String title;
        private Date creationDate;
    
  
    public Document(String title){
       
    }
    public Document(){
       
    }

    public String toString(){
        return geTitle() + getCreationdate();
    }
    public  String geTitle(){
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public  Date getCreationdate(){
        return creationDate;
    }
    public void setCreationdate(Date date) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setCreationdate'");
    }
   
}
