import java.util.Scanner;

public class StudentMarksCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0;

        System.out.println("Enter marks in 5 subjects:");

        for (int i = 1; i <= 5; i++) {
            int marks = sc.nextInt();

            if (marks < 0 || marks > 100) {
                System.out.println("Enter marks between 0 and 100.");
                sc.close();
                return;
            }

            total += marks;
        }

        double percentage = total / 5.0;

        System.out.println("Total Marks: " + total);
        System.out.println("Percentage: " + percentage + "%");

        if (percentage >= 90) {
            System.out.println("Grade: A");
        } else if (percentage >= 75) {
            System.out.println("Grade: B");
        } else if (percentage >= 50) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: D");
        }

        sc.close();
    }
}
