import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;

public class ManageStudentGrade {
    public static void main(String[] args) {
        System.out.println("I am not doing this If I don't like you😐🤨\n\n");
        JOptionPane.showMessageDialog(null, "I am not doing this If I don't like you😐🤨", "What ever hmppt", JOptionPane.INFORMATION_MESSAGE);
        ManageStudentApp();
    }

    static void ManageStudentApp() {
        ArrayList<Float> intGrades = new ArrayList<>();
        boolean isError = false;

        while (true) {
            float input;
            try {
                input = Float.parseFloat((JOptionPane.showInputDialog(null, "Enter integer grade [-1 to stop]: ")));
                System.out.print(input + " ");

                // only add if valid
                if (input >= 0 && input <= 100) {
                    intGrades.add(input);
                } else {
                    if (input == -1)
                        break;
                    JOptionPane.showMessageDialog(null, "Grades should be between 0 and 100", "Try again. You not thinking!", JOptionPane.WARNING_MESSAGE);
                    isError = true;
                    break;

                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Only integer is allowed", "You have a mind or what?", JOptionPane.WARNING_MESSAGE);
                System.out.println("Error: " + ex.getMessage());
                break;
            }
        }

        if (!isError) {
            Results(intGrades);
        } else {
            System.out.println("You've inputted wrong input therefore we are not displaying the results.");
            JOptionPane.showMessageDialog(null, "Kasalanan to ng mga babae.", "No result", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    static void Results(ArrayList<Float> grades) {
        float sum = 0;
        float highest = 0;
        float lowest = 0;
        float average = 0;

        // printing values for verification
        System.out.println("\nValues in ArrayList");
        for (var i : grades) {
            System.out.print(i + " ");
            sum += i;
        }
        System.out.println("\nSum: " + sum);

        // sort
        Collections.sort(grades);

        highest = grades.get(grades.size() - 1);
        lowest = grades.get(0);
        average = sum / grades.size();

        System.out.println("\n\nPrinting results....");
        System.out.println("Lowest grade: " + lowest);
        System.out.println("Highest grade: " + highest);
        System.out.println("Average: " + average);

        String result = String.format("Highest Grade: %s\nLowest Grade: %s\nAverage of Grades: %s", lowest, highest, average);
        JOptionPane.showMessageDialog(null, result, "Displaying Results [cute si Maron]", JOptionPane.INFORMATION_MESSAGE);

    }
}
