import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();

        int totalMarks = 0;
        int[] marks = new int[numSubjects];

        // Input marks for each subject
        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter marks obtained in subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
            totalMarks += marks[i];
        }

        // Calculate total marks
        double averagePercentage = (double) totalMarks / numSubjects;

        // Calculate average percentage
        double percentage = (averagePercentage / 100) * 100;

        // Display total marks and average percentage
        System.out.println("Total Marks Obtained: " + totalMarks);
        System.out.printf("Average Percentage: %.2f%%\n", percentage);

        // Assign grades based on the average percentage
        char grade;
        if (percentage >= 90) {
            grade = 'A';
        } else if (percentage >= 80) {
            grade = 'B';
        } else if (percentage >= 70) {
            grade = 'C';
        } else if (percentage >= 60) {
            grade = 'D';
        } else if (percentage >= 50) {
            grade = 'E';
        } else {
            grade = 'F';
        }

        // Display the corresponding grade
        System.out.println("Your Grade is: " + grade);

        scanner.close();
    }
}