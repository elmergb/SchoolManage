
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean run = true;
        while (run) { 
            try {
                System.out.println("======Entrace=======");
                System.out.println("1. Enrolled");
                System.out.println("2. Display student");
                System.out.println("3. Search section");
                System.out.println("4. Search Student");
                System.out.println("5. Exit");
                System.out.print("Select: ");
                int select = sc.nextInt();
                sc.nextLine();
                switch (select) {
                    case 1 -> {
                        Student newStudent = TeacherPanel.addStudent();
                     //   Export.writeToFile(newStudent);
                    }
                    case 2 -> StudentPanel.DisplayStudent();
                    case 3 -> {
                        StudentPanel.course();
                      //  Export.showSection();
                    }
                    case 4 -> StudentPanel.findStudent(); //search student
                    case 5 -> run = false;
                    default -> throw new AssertionError("Invalid menu choice: " + select);
                }
            } catch (Exception e) {
                e.printStackTrace();
                run = false;
            }
        }
        
    }
}
