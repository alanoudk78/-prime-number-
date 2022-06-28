/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prime;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class Prime {

    /**
     * @param args the command line arguments
     */
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
