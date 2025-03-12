import java.util.Date;

public class Main{
    public static void main(String[] args) {
           // Créer un objet Document en utilisant le constructeur par défaut
           Document doc1 = new Document();
           doc1.setTitle("Document par défaut");
           doc1.setCreationdate(new Date()); // Initialisation de la date
   
           // Créer un objet Document avec un titre passé en paramètre
           Document doc2 = new Document("Document personnalisé");
           doc2.setCreationdate(new Date()); // Initialisation de la date
   
           // Afficher les attributs des deux objets
           System.out.println("Document 1 : " + doc1.toString());
           System.out.println("Document 2 : " + doc2.toString());
       }
}
