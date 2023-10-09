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
    public static void main(String args []){

        /** while loop to keep the program running */
        while(true){
            System.out.println("Please enter the number of fibonacci series :");
            Scanner input = new Scanner(System.in);

            /** reading the next line of text and storing it in a string variable*/
            int number_Of_Series = input.nextInt();

            System.out.println("Your Fibonacci serie :");

            /** passing the number_Of_Series to Fibonacci_Serie_Generator_Loop method and storing the result in result array of integers */
            int [] result = Fibonacci_Serie_Generator_Loop(number_Of_Series);
            int_Array_printer(result);
            System.out.println("**************************************************");
        }
    } 

    /** 
     * method for generating the Fibonacci series with a for loop.
     * @param number  int number of series
     * @return Fibonacci_Series    an array of Fibonacci serie integers   
     * <pre>
     *      Fibonacci_Serie_Generator_Loop(0); // Output: []
     *      Fibonacci_Serie_Generator_Loop(6); // Output: [0, 1, 1, 2, 3, 5]
     * </pre>
    */
    public static int[] Fibonacci_Serie_Generator_Loop(int number){

        /** initializing an empty array with lenght of number */
        int[] Fibonacci_Series = new int[number];
        int first = 0;
        int second = 1;
        int third;
        for(int i=0; i<number; i++){
            Fibonacci_Series[i] = first;
            third = first+second;
            first = second;
            second = third;
        }
        return Fibonacci_Series; 
    }

    /** 
     * method for printing each array integer element in a line.
     * @param array  array of integers
     * <pre>
     *      int[] array_1 = [];
     *      int[] array_2 = [3, 7]
     *      int_Array_printer(array_1); // Output: 
     *      int_Array_printer(array_2); // Output: 3
     *                                             7
     * </pre>
    */
    public static void int_Array_printer(int[] array){
        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }
}