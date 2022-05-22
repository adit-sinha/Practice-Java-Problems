package bookstoragesystem;

/** Class containing template for books
 *
 * @author adits
 */
public class StorageClass {
    String title, auth, year;
    //StorageClass acts as a book
    StorageClass(String a, String b, String c){
        title = a;
        auth = b;
        year = c;
        
    }
    public String toString(){
        return title + " | " + auth + " | " + year;
    }
    
}

