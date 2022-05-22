
package bookstoragesystem;

/** Program to store books in a library using ArrayLists
 *  The program also searches for a book requested by the user
 * 
 * @author adits
 */
import java.util.*; //helps accept input
public class BookStorageSystem {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<StorageClass> lib = new ArrayList<StorageClass>(); 
        //ArrayList stores all books

        String title, auth, year, repl, srchrep;
        while (true){
            
            System.out.print("Enter title: ");
            title = sc.nextLine();
            System.out.print("Enter author: ");
            auth = sc.nextLine();
            System.out.print("Enter year of release: ");
            year = sc.nextLine();
            lib.add(new StorageClass(title, auth, year));
            System.out.print("Would you like to add more? (y/n) ");
            repl = sc.nextLine();
            if (!repl.equals("y")) break;
            
             
        }
        System.out.println("Would you like to search for a book? ");
        srchrep = sc.nextLine(); 
        if (srchrep.equals("y")) search(lib);
        
    }
    public static void search(ArrayList<StorageClass> lib){
        System.out.println("Would you like to search by: ");
        System.out.println("1. Title");
        System.out.println("2. Author");
        System.out.println("3. Year");
        int repl = sc.nextInt();
        String choice, item;
        sc.nextLine(); //Program ends without skipping line
        System.out.println("Enter content: ");
        item = sc.nextLine();
        for (StorageClass elem: lib){
            if (repl == 1) choice = elem.title;
            else if (repl == 2) choice = elem.auth;
            else choice = elem.year;
            
            if (item.equals(choice)) System.out.println(elem);
        }
    }
    
}
