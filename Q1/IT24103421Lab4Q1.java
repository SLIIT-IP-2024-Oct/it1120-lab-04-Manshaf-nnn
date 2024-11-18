import java.util.Scanner;
class IT24103421Lab4Q1 {

    public static void main (String [] args){


        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();

        if (num > 0 ) {
            System.out.println("The number is : positive ");
        }
        else if  ( num < 0 ) {
            System.out.println("The number is : Negative ");
        }
        else {
            System.out.println("The number is Zero");
        }
       


    }
}