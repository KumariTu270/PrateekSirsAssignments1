package PrateekSirsQuestions;
import java.util.Scanner;

public class Main {

    public static void printOddTriangle(int n)
    {
        int k = 2*n-2; //number of spaces


        for(int i=0 ; i<n ; i=i+2)
        {

            for(int j=0 ; j<k ; j++)
            {
                System.out.print(" ");
            }

            k=k-2;

            for(int j =0 ; j<=i ; j++)
            {
                System.out.print("* ");
            }

            System.out.println();


        }
    }

    public static void printInvertedOddTriangle(int n)
    {
        int k = (2*n-1)/2;


        for(int i=n ; i>0 ; i=i-2)
        {
            for(int j=0 ; j<k ; j++)
            {
                System.out.print(" ");
            }

            for (int j=0 ; j<i ; j++ )
            {
                System.out.print("* ");
            }
            System.out.println();
             k= k+2;


        }
    }

    public static void betweenPattern(int n)
    {
        int i , j;


        for(i=0;i<n-2;i++)
        {
            for(int k = 0 ; k< (2*n-1)/2 ; k++ )
            {
                System.out.print(" ");
            }
            System.out.print("* ");
            //printing in the same line
            for(j=0;j<n-2;j++)
            {
                if(j==i)
                {
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println("* ");
        }



    }

    public static void pattern(int n )
    {
        printOddTriangle(n);
        betweenPattern(n);
        printInvertedOddTriangle(n);

    }

    public static void main(String[] args) {

	// triangle pattern
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an Odd number for the pattern : ");
        int odd = sc.nextInt();
        try {
            if (odd % 2 == 0) {
                throw new Exception("Entered wrong number");
            } else {
                pattern(odd);
            }

        }
        catch(Exception e )
        {
            System.out.println(e);
        }
        finally {
            System.out.println("            HOPE YOU ENJOYED TESTING THE CODE!!!!");
        }
    }
}
