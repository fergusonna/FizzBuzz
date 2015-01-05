/**
 * Standard FizzBuzz practice project
 * @author Nick Ferguson
 */
public class FizzBuzz {
    public static void main(String[] args){
        
        System.out.println("Print the numbers 1 to 100");
        System.out.println("except, replace multiples of 3 with Fizz, multiples of 5 with Buzz");
        System.out.println("and multiples of both 3 and 5 with FizzBuzz\n");
        
        for (int i = 1; i<=100; i++)
        {
            if (i % 3 == 0){System.out.print("Fizz");}
            if (i % 5 == 0){System.out.print("Buzz");}
            if ((i % 3 != 0) && (i % 5 != 0)){
                System.out.print(i);
            }
            
            System.out.print(", ");
            
            //To make it easier to read
            if (i % 10 == 0){System.out.println();}
        }
    }
}
