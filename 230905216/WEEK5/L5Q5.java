import java.util.GregorianCalendar;
import java.util.Scanner;

class Student {
    private int registrationNumber;
    private String fullName;
    private GregorianCalendar dateOfJoining;
    private short semester;
    private float gpa;
    private float cgpa;
    private static int studentCount = 1;

   
    public Student(String fullName, GregorianCalendar dateOfJoining, short semester, float gpa, float cgpa) {
        this.fullName = fullName;
        this.dateOfJoining = dateOfJoining;
        this.semester = semester;
        this.gpa = gpa;
        this.cgpa = cgpa;
        this.registrationNumber = generateRegistrationNumber(dateOfJoining);
        studentCount++;
    }

  
    private int generateRegistrationNumber(GregorianCalendar dateOfJoining) {
        int year = dateOfJoining.get(GregorianCalendar.YEAR);
        return (year % 100) * 100 + studentCount;
    }


    public void display() {
        System.out.println("Registration Number: " + registrationNumber);
        System.out.println("Full Name: " + fullName);
        System.out.println("Date of Joining: " + dateOfJoining.getTime());
        System.out.println("Semester: " + semester);
        System.out.println("GPA: " + gpa);
        System.out.println("CGPA: " + cgpa);
        System.out.println();
    }

 
    public static void listStudentsByNameStartsWith(Student[] students, char initial) {
        System.out.println("Students whose name starts with " + initial + ":");
        for (Student student : students) {
            if (student.fullName.charAt(0) == initial) {
                student.display();
            }
        }
    }

  
    public static void listStudentsByNameContains(Student[] students, String subString) {
        System.out.println("Students whose name contains " + subString + ":");
        for (Student student : students) {
            if (student.fullName.contains(subString)) {
                student.display();
            }
        }
    }

   
    public void modifyFullName() {
        String[] names = fullName.split(" ");
        StringBuilder modifiedName = new StringBuilder();
        for (int i = 0; i < names.length - 1; i++) {
            modifiedName.append(names[i].charAt(0)).append(". ");
        }
        modifiedName.append(names[names.length - 1]);
        fullName = modifiedName.toString();
    }
}

public class L5Q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
           System.out.println("Enter total number of students:");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        // Create an array of student records
        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for student " + (i + 1) + ":");

            System.out.print("Enter full name: ");
            String fullName = scanner.nextLine();

            System.out.print("Enter year of joining: ");
            int year = scanner.nextInt();
            System.out.print("Enter month of joining (0-11): ");
            int month = scanner.nextInt();
            System.out.print("Enter day of joining: ");
            int day = scanner.nextInt();
            GregorianCalendar dateOfJoining = new GregorianCalendar(year, month, day);

            System.out.print("Enter semester: ");
            short semester = scanner.nextShort();

            System.out.print("Enter GPA: ");
            float gpa = scanner.nextFloat();

            System.out.print("Enter CGPA: ");
            float cgpa = scanner.nextFloat();

            scanner.nextLine(); 

            students[i] = new Student(fullName, dateOfJoining, semester, gpa, cgpa);
        }

    
        System.out.println("Original Records:");
        for (Student student : students) {
            student.display();
        }

        
        System.out.print("Enter a character to list students whose name starts with this character: ");
        char initial = scanner.nextLine().charAt(0);
        Student.listStudentsByNameStartsWith(students, initial);

        System.out.print("Enter a substring to list students whose name contains this substring: ");
        String subString = scanner.nextLine();
        Student.listStudentsByNameContains(students, subString);

     
        for (Student student : students) {
            student.modifyFullName();
        }

       
        System.out.println("Modified Records:");
        for (Student student : students) {
            student.display();
        }
    }
}
