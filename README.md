# -prime-number-
the number want to know if it's prime or no by java language 

package prime;
import java.util.Scanner

public class Prime {

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        boolean result=false;
        System.out.println("Enter the numer want to know if it's prime or no ");
        int number=input.nextInt();
        for(int i=2;i<number;i++){
            if(number%i==0){
                result=true;
                break;
                
            }
        }
          if(!result) 
              System.out.println(number+"is prime number ");
          else
                            System.out.println(number+"is not prime number ");

    }
    
}
