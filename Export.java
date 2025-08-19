/* 
    import java.io.BufferedWriter;
    import java.io.FileWriter;
    import java.io.IOException;
    import java.util.Scanner;

    public class Export {
        public static String Filepath = "c:\\Users\\edwar\\Desktop\\Elmer\\Export file java\\EnolmmentRecord.txt";
        public static String fileSection = "C:\\Users\\edwar\\Desktop\\Elmer\\Export file java\\Section.txt";
        static Scanner sc = new Scanner(System.in);
        public static void writeToFile(Student s) {
            try {
                BufferedWriter writer = new BufferedWriter(new FileWriter(Filepath, true));
                java.io.File file = new java.io.File(Filepath);
                if (file.length() == 0) {
                    writer.write("ID\tFirst Name\tLast Name\tCourse\t" + "\t" + "Section\t" + "Date Enrolled\n");
                }
                    writer.write(
                    s.id + "\t" +
                    s.name + "\t" +"\t" 
                    + s.lname + "\t" + "\t" + s.course + "\t" + "\t" + 
                    (s.enrolled != null ? s.enrolled.format(java.time.format.DateTimeFormatter.ofPattern("MMMM d, yyyy")) : "N/A") + "\n"
                    );
                writer.close();
            } catch (IOException e) {
                System.out.println("Error writing to file: " + e.getMessage());
            }
        }

        public static void showSection(){
            try {
            System.out.print("Enter Course");
            String section = sc.nextLine();
            BufferedWriter wr = new BufferedWriter(new FileWriter(fileSection, true));
            
            for (Student s : TeacherPanel.stu) {
                if (s.course.equalsIgnoreCase(section)) {
                    wr.write("Course: " + s.course );
                    wr.write("Course: " + s.course );
                }
            }
            wr.close();
                } catch (Exception e) {
                    
            }
        }
        
    }

*/