
package bookstoragesystem;

/** Program to store books in a library using OOP
 *
 * @author adits
 */
import java.util.Scanner; //helps accept input
public class BookStorageSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many books do you wish to enter? ");
        int num = sc.nextInt();
        
        StorageClass Temp;
        String title, auth, year; 
        int i = 1;
        sc.nextLine();
        while (i<=num){
            
            System.out.print("Enter title: ");
            
            title = sc.nextLine();
            System.out.print("Enter author: ");
            auth = sc.nextLine();
            System.out.print("Enter year of release: ");
            year = sc.nextLine();
            Temp = new StorageClass(title, auth, year);
            Temp.printinfo();
            i++;
        }
    }
    
}
