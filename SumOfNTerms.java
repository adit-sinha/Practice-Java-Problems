package sumofnterms;

/** Program to print n natural numbers and their sum
 *
 * @author adits
 */
import java.util.Scanner;
public class SumOfNTerms {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of terms: ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++){
            System.out.print(i + " ");
            sum += i;
        
        
        }  
        System.out.print("\nSum = " + sum); //formula for n terms could also be used
    }
    
}
