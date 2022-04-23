package bookstoragesystem;

/** Class containing template for books
 *
 * @author adits
 */
public class StorageClass {
    String title, auth, year;
    
    StorageClass(String a, String b, String c){
        title = a;
        auth = b;
        year = c;
        
    }
    void printinfo(){
        System.out.println(title + " | " + auth + " | " + year);
    }
    
}
