import java.util.Scanner;

public class Lab7Q1BIT22201614 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        for (int student = 1; student <= 3; student++) {

            System.out.println("Student " + student);

            System.out.print("Enter marks: ");

            double mark1 = input.nextDouble();
            double mark2 = input.nextDouble();
            double mark3 = input.nextDouble();
            double mark4 = input.nextDouble();

            double average = (mark1 + mark2 + mark3 + mark4) / 4;

            String grade;

            if (average >= 75 && average <= 100) {
                grade = "Distinction";
            }
            else if (average >= 50) {
                grade = "Credit";
            }
            else {
                grade = "Fail";
            }

            System.out.println("Average is : " + average);
            System.out.println("Overall Grade is : " + grade);
            System.out.println();
        }
    }
}
