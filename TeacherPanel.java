import java.util.ArrayList;
import java.util.Scanner;

public class TeacherPanel {
    static Scanner sc = new Scanner(System.in);
    public static ArrayList<Student> stu = new ArrayList<>();
    public static ArrayList<String> subj = new ArrayList<>();
        public static Student addStudent(){
        try {
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Last name: ");
            String lname = sc.nextLine();
            System.out.print("Gender: ");
            String gender = sc.nextLine();
            System.out.print("Age: ");
            int age = sc.nextInt();
            sc.nextLine();
            System.out.println("========Course========");
            System.out.println("BSIT");
            System.out.println("BSEDUC");
            System.out.println("Nursing");
            System.out.println("BSCRIM");
            System.out.println("BSHTM");
            System.out.println("=======================");
            System.out.print("Select: ");
            String course = sc.nextLine().toUpperCase();
                 course = switch (course){
                    case "BSIT", "IT" -> "BSIT";
                    case "BSEDUC","EDUC" -> "BSEDUC";
                    case "NURSING" -> "NURSING";
                    case  "BSCRIM", "CRIM" -> "BSCRIM";
                    case  "BSHTM", "HTM" -> "BSHTM";
                    default -> "Unknown";
                };

            if (course.isEmpty()){
                System.out.println("Unknown");
            }

            if (course.equalsIgnoreCase("BSIT")){

            }

            Student newStudent;
            double scholar = 0.0;

            System.out.print("You're Scholar? ");
            String ans = sc.nextLine();

            if (ans.equalsIgnoreCase("Yes")){
                System.out.print("Amount: ");
                double amount = sc.nextDouble();

                if (amount < 0.0){
                    System.out.println("Invalid amount");
                    Student isko = new Student(name, lname, course, age, gender, scholar);
                    isko.setScholar(scholar);
                } 
                newStudent = new Student(name, lname, course, age, gender, amount);
                
            } else {
                newStudent = new Student(name, lname, course, age, gender, scholar);
            }
            
            sc.nextLine();
            stu.add(newStudent);
            newStudent.setSubjects(Subject.assignSubjects(newStudent));
            newStudent.displayStudent();
            newStudent.displaySubjects();
            return newStudent;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
           
        }
            return null;
        }
}
