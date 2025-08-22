import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Student {
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
    String subjectName;
    String subjectCode;
    int units;
   public Student(String name, String lname, String course, int age, String gender, double scholar){
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
    
    private ArrayList<Subject> subjects = new ArrayList<>();

    public void setSubjects(ArrayList<Subject> subjects) {
        this.subjects = subjects;
    }

    public ArrayList<Subject> getSubjects() {
        return subjects;
    }

    public void displaySubjects() {
        if (subjects.isEmpty()) {
            System.out.println("No subjects assigned.");
        } else {
            System.out.println("Subjects for " + course + ":");
            for (Subject sub : subjects) {
                System.out.println(sub);
            }
        }
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
    }
}
