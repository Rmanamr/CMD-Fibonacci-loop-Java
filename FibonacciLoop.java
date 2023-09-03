/*Print Fibonacci series from 0 to input(numberOfSeries) with for loop*/

import java.util.Scanner;

public class FibonacciLoop{
    public static void main(String args []){
        while(true){
            System.out.println("Please enter the number of fibonacci series :");
            Scanner input = new Scanner(System.in);
            int numberOfSeries = input.nextInt();
            fibonacciSerieLoop(numberOfSeries);
        }
    } 

    public static void fibonacciSerieLoop(int n){
        int first = 0;
        int second = 1;
        int third;
        for(int i=1; i<=n; i++){
            System.out.println(first);
            third = first+second;
            first = second;
            second = third;
        }   
        System.out.println("***************************"); 
    }
}


// by Arman Azarnik
// armanazarnik@gmail.com