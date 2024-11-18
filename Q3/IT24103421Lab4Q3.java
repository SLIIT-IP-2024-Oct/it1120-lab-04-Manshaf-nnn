import java.util.Scanner;
class IT24103421Lab4Q3 {

    public static void main (String [] args ){

        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();

        String status = (num > 0 ) ? " Positive." : (num < 0 ) ? "  Negative." : " Zero";
        System.out.println("The number is : " + status);

    
    }
    
}
