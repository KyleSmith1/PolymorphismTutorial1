package polymorphismtutorialproblem1;

import java.util.Scanner;

/**
 *
 * @author 14001835
 */
public class PolymorphismTutorialProblem1 {
    
    public static void main(String[] args) {
        Unit newUnit = new Unit("H123 D34", "Object Oriented Programming");
        String choice;
        Scanner kboard = new Scanner(System.in);
        while (true) {
            System.out.println("");
            System.out.println("Menu:");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students in Unit");
            System.out.println("3. Display Specific Student");
            System.out.println("4. Display All Passing Students");
            System.out.println("5. Display percentage success rate");
            System.out.println("6. Remove Student");
            System.out.println("7. Exit");
            choice = kboard.nextLine();
            switch (choice) {
                case "1":
                    newUnit.addStudent();
                    break;
                case "2":
                    newUnit.displayAll();
                    
                    break;
                case "3":
                    newUnit.displayStudent();
                    break;
                case "4":
                    newUnit.displayPassedStudents();
                    
                    break;
                case "5":
                    newUnit.displayPercentage();
                    break;
                case "6":
                    newUnit.removeStudent();
                    break;
                case "7":
                    System.out.println("Exiting program...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Input not valid");
                    break;
            }
            
        }
        
    }
    
}
