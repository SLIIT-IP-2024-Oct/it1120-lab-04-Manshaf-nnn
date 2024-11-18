import java.util.Scanner;

class IT24103421Lab4Q2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Please enter exam marks (out of 100): ");
        double examMarks = sc.nextDouble();

        if (examMarks < 0 || examMarks > 100) {
            System.out.println("Invalid input for exam mark. Terminating program");
            return;  
        }

        
        System.out.print("Please enter  lab submission mark (out of 100): ");
        double labMarks = sc.nextDouble();
        if (labMarks < 0 || labMarks > 100) {
            System.out.println("Invalid input for lab submission mark. Terminating program.");
            return;  
        }

        
        System.out.print("Please enter the percentage given for the exam: ");
        double examPercentage = sc.nextDouble();

        System.out.print("Please enter the percentage given for lab submission:  ");
        double labPercentage = sc.nextDouble();

        if (examPercentage + labPercentage != 100) {
            System.out.println("The percentages must add up to 100. Terminating program.");
            return;  
        }

        
        double finalMark = (examMarks * examPercentage / 100) + (labMarks * labPercentage / 100);

        
        System.out.println("Final exam mark is : " + finalMark);

        
    }
}
