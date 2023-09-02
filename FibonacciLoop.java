/*Print Fibonacci series from 0 to input(numberOfSeries) with for loop*/

import java.util.Scanner;

public class FibonacciLoop{
    public static void main(String args []){
        while(true){
            System.out.println("Please enter the number of fibonacci series :");
            Scanner input = new Scanner(System.in);
            int numberOfSeries = input.nextInt();
            System.out.println("*********");
            int first = 0;
            int second = 1;
            int third;
            for(int i=1; i<=numberOfSeries; i++){
               System.out.println(first);
               third = first+second;
               first = second;
               second = third;
            }    
        }
    } 
}


//by Arman Azarnik