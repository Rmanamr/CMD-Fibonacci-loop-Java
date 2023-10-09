import java.util.Scanner;

/**Java CMD program for printing Fibonacci series from 0 to input(number_Of_Series) with a for loop.
* using Java version 1.8.0
* @version : 1.0
* @license: MIT License
* @author : Arman Azarnik
* contact me at : armanazarnik@gmail.com
*/
public class CMD_Fibonacci_Loop{

    /** main class for interacting with the user */
    public static void main(String[] args){

        /** while loop to keep the program running */
        while(true){
            System.out.println("Please enter the number of fibonacci series :");
            Scanner input = new Scanner(System.in);

            /** reading the next integer number and storing it in an integer variable*/
            int number_Of_Series = input.nextInt();
            System.out.println("Your Fibonacci serie :");

            /** passing the number_Of_Series to Fibonacci_Serie_Generator_Loop method and storing the result in result array of long data type */
            long[] result = Fibonacci_Serie_Generator_Loop(number_Of_Series);
            long_Array_printer(result);
            System.out.println("**************************************************");
        }
    } 

    /** 
     * method for generating the Fibonacci series with a for loop.
     * @param number  int number of series
     * @return Fibonacci_Series    a long data type array of Fibonacci serie integers   
     * <pre>
     *      Fibonacci_Serie_Generator_Loop(0); // Output: []
     *      Fibonacci_Serie_Generator_Loop(6); // Output: [0, 1, 1, 2, 3, 5]
     * </pre>
    */
    public static long[] Fibonacci_Serie_Generator_Loop(int number){

        /** initializing an empty array with lenght of number */
        long[] Fibonacci_Series = new long[number];
        long first = 0;
        long second = 1;
        long third;
        for(int i=0; i<number; i++){
            Fibonacci_Series[i] = first;
            third = first+second;
            first = second;
            second = third;
        }
        return Fibonacci_Series; 
    }

    /** 
     * method for printing each array long data type element in a line.
     * @param array  array of long data type
     * <pre>
     *      long[] array_1 = [];
     *      long[] array_2 = [3, 7]
     *      long_Array_printer(array_1); // Output: 
     *      long_Array_printer(array_2); // Output: 3
     *                                             7
     * </pre>
    */
    public static void long_Array_printer(long[] array){
        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }
}