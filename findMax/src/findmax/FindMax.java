
package findmax;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author sarvi
 */
public class FindMax {

    
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
          ArrayList<Double> test = new ArrayList<>();
          int n  ;
          double number = 0,base;
          System.out.println("how many numbers you wanna compare?");
          n=scn.nextInt();
          System.out.println("enter the numbers: ");
          for(int i =0 ; i<n ; i++)
          { number = scn.nextDouble(); 
             test.add(number);
          }         
          System.out.println(test);
    
          
          base= test.get(0); 
          for(int i =0 ; i<n ; i++)
          { 
            if (test.get(i)>test.get(0))
            { base=test.get(i);
            break;}
                
          }
        System.out.println("the max is: "+ base);
       
}
}

