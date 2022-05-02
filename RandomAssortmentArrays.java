package arrays;

/** Program to enter n natural numbers in a random assortment using Arrays
 * 
 *
 * @author adits
 */
import java.util.*;
public class Arrays {

    public static void main(String[] args) {
       //Taking input
       Scanner sc = new Scanner(System.in);
       System.out.print("No. of elements you wish to enter: ");
       int var = sc.nextInt();
       
       //Initializing Array
       int[] list = new int[var];
       
       //Randomizing
       int j = 1;
       while (j<=var){
          while (true){
              int newnum = (int) (Math.random()*var);
              if (list[newnum]==0){
                  list[newnum] = j;
                  break;
              }
          }
          j++;
    }
       //Printing
       System.out.println("Randomized: ");
       for (int i = 1; i<list.length; i++){
           System.out.print(list[i] + " ");
       }
    }
}

