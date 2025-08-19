import java.util.Scanner;

public class StudentPanel {
    static Scanner sc = new Scanner(System.in);
     
    // Teacher pannel
    public static void DisplayStudent(){
        try {
            if(TeacherPanel.stu.isEmpty()){
                throw new IllegalArgumentException("no one found");
        }
            boolean isfound = false;
            for (Student stuu : TeacherPanel.stu) {
                stuu.displayStudent();
                isfound = true;
            }

            if (!isfound){
                System.out.println("Not found");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Error" + e.getMessage());
        }
    }

    public static Student course(){
        System.out.print("Enter Course: ");
        String sec = sc.nextLine().toUpperCase();
        
        boolean isfound =false;
        for (Student s : TeacherPanel.stu) {
            if (s.course != null && s.course.equalsIgnoreCase(sec)) {
                System.out.println(s.name + " " + s.lname + "\n" + s.course );
                isfound = true;
            } 
            
        }
        
        if (!isfound) {
            System.out.println("No section");
        }
        sc.next();
        return null;
    }

    public static Student findStudent(){
        System.out.print("Enter name: ");
        String name = sc.nextLine();

        boolean isfound = false;
        for (Student s : TeacherPanel.stu) {
            if(s.name.equalsIgnoreCase(name)){
                System.out.println("==========Found===============");
                System.out.println("ID: " + s.id + "\nName: " + s.name + "\n" + "Last Name: " + s.lname + "\n" + s.course );
                System.out.println("==============================");
                isfound = true;
            }
            
        }
            if (!isfound){
                System.out.println("no student like " + name);
            }

        return null;
    }
}
