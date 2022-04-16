package leap.year.prediction;

/** Program to determine whether input year is a leap year or not
 * @author adits
 */
import java.util.Scanner;
public class LeapYearPrediction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the year (AD): ");
        int yr = sc.nextInt();
        
        if (yr>0){
            if ((yr%4==0 && yr%100!=0)|| yr%400==0 ){ 
            //A mult of 100 must also be a mult of 400 to be a leap yr              
                System.out.println("It is a leap year.");
            }       
            else{
                System.out.println("Not a leap year.");
            }
        }
        else{
            System.out.println("Years are only positive.");
        }
        
    }
    
}
