import java.util.Scanner;

public class Minelement {
    private static Scanner scanner =new Scanner(System.in) ;

    public static void main(String[] args) {
        System.out.println("Enter the size of an array");
        int toinput = scanner.nextInt() ;
        System.out.println("enter the elements");
        //readIntegers(toinput) ;
        System.out.println("The min value in the entered elements is " + findMin(readIntegers(toinput)));


    }

    public static int[] readIntegers(int count)
    {

        int[] input = new int[count] ;
        for (int i=0 ; i < input.length ; i++)
        {
            input[i] = scanner.nextInt() ;
        }
        for (int i=0 ; i < input.length ; i++)
        {
            System.out.println("element " + i + " is : " + input[i]);
        }

        return input ;
    }

    public static int findMin (int[] input)
    {
        int min = input[0];
        for (int i = 0 ; i < input.length - 1  ; i++)
        {

            if (input[i] < min)
            {
                min = input [i] ;
            }

        }
        return min ;
    }

}
