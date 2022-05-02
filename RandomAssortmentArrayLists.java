/** Program to enter n natural numbers in a random assortment using ArrayLists
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
       
       //Initializing ArrayList
       ArrayList<Integer> list = new ArrayList<Integer>();
       
       //Adding blank elements
       for (int i = 0; i<var; i++){
           list.add(0);
       }
       
       int j = 1;
       while (j<=var){
          while (true){
              int newnum = (int) (Math.random()*var);
              if (list.get(newnum)==0){
                  list.set(newnum, j);
                  break;
              }
          }
          j++;
    }
       //Printing
       System.out.println("Randomized: ");
       System.out.println(list);
    }
}

