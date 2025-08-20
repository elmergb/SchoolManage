import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Student {
    ArrayList<Subject> subjects = new ArrayList<>();
    public static int nextId = 1;
    String name;
    String lname;
    String course;
    String id;
    int age;
    String gender;
    LocalDateTime enrolled;
    int year = LocalDateTime.now().getYear();
    double scholar;

   public Student(String name, String lname, String course, int age, String gender, double scholar, String subjectName, String subjectCode, int units){
        this.id = year + "-" + String.format("%03d",  nextId++); 
        this.name = name;
        this.lname = lname;
        this.age = age;
        this.gender = gender;
        this.course =  course;
        this.enrolled = LocalDateTime.now();
        this.scholar = scholar;
        
        
    }

    public double getScholar(){
        return scholar;
    }

    public void setScholar(double scholar){
        if (scholar < 0){
                 throw new IllegalArgumentException("Invalid amount");
        } 
        this.scholar = scholar;
    }
    void DisplaySchoolName(){
        System.out.println("Welcome to Saint Elmer School!");
    }

    public String getCourse(){
        return course;
    }

    public void assignSubjects() {
        switch (course) {
            case "BSIT" -> {
                subjects.add(new Subject("IT101", "Intro to Programming", 3));
                subjects.add(new Subject("IT102", "Database Systems", 3));
                
            }
            case "BSEDUC" -> {
                subjects.add(new Subject("EDU101", "Child Psychology", 3));
            }
            case "NURSING" -> {
                subjects.add(new Subject("NUR101", "Human Anatomy", 4));
            }
        }
    }

        @Override
        public String toString() {
            return subjectCode + " - " + subjectName + " (" + units + " units)";
        }

    
    public void displayStudent(){
        System.out.println("=============================");
        System.out.println(
        "ID: " + id + "\n" +
        "Name: " + name + "\n" +
        "Last Name: " + lname + "\n" +
        "Age: " + age +
        "\nGender: " + gender +
        "\nCourse: " + course + "\n" + 
        "Enrolled: " + (enrolled != null ? enrolled.format(DateTimeFormatter.ofPattern("MMMM d, yyyy")) : "N/A") +
        "\nScholar $ " + scholar
        );
        System.out.println("========Subject=========");
        System.out.println(subjects);
        System.out.println("========Subject=========");
    }
}
