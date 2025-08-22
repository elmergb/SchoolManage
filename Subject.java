import java.util.ArrayList;

class Subject {
    String subjectCode;
    String subjectName;
    int units;
 
    Subject (String subjectCode, String subjectName, int units){
        this.subjectCode = subjectCode;
        this.subjectName = subjectName;
        this.units = units;
    }


    
    @Override
    public String toString() {
    return subjectCode + " - " + subjectName + " (" + units + " units)";
}

public static ArrayList<Subject> assignSubjects(Student s) {
        ArrayList<Subject> subjects = new ArrayList<>();
        String course = s.getCourse().toUpperCase();
        
        switch (course) {
            case "BSIT" -> {
                subjects.add(new Subject("IT101", "Intro to Programming", 3));
                subjects.add(new Subject("IT102", "Database Systems", 3));
            }
            case "BSEDUC" -> {
                subjects.add(new Subject("EDU101", "Child Psychology", 3));
                subjects.add(new Subject("EDU102", "Teaching Strategies", 3));
            }
            case "NURSING" -> {
                subjects.add(new Subject("NUR101", "Human Anatomy", 4));
                subjects.add(new Subject("NUR102", "Fundamentals of Nursing", 3));
            }
            case "BSCRIM" -> {
                subjects.add(new Subject("CRIM101", "Intro to Criminology", 3));
                subjects.add(new Subject("CRIM102", "Criminal Law", 3));
            }
            case "BSHTM" -> {
                subjects.add(new Subject("HTM101", "Hospitality Basics", 3));
                subjects.add(new Subject("HTM102", "Tourism Management", 3));
            }
            default -> System.out.println("No subjects found for this course.");
        }

        return subjects;
    }


}

