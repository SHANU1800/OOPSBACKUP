import java.util.*;


class Student 
{
    int registrationNumber;
    String Name;
    GregorianCalendar date;
    short semester;
    float gpa;
    float cgpa;
     static int count = 1;

   
    public Student(String Name, GregorianCalendar date, short semester, float gpa, float cgpa) {
        this.Name =Name;
        this.date = date;
        this.semester = semester;
        this.gpa = gpa;
        this.cgpa = cgpa;
        this.registrationNumber = generate(date);
        count++;
    }

   
      int generate(GregorianCalendar date) {
        int year = date.get(GregorianCalendar.YEAR);
        return (year % 100) * 100 + count;
    }

   
    void display() {
        System.out.println("Registration Number: " + registrationNumber);
        System.out.println("Full Name: " + Name);
        System.out.println("Date of Joining: " + date.getTime());
        System.out.println("Semester: " + semester);
        System.out.println("GPA: " + gpa);
        System.out.println("CGPA: " + cgpa);
        System.out.println();
    }
  
   
    public static void sortStudentsBySemesterAndCGPA(Student[] array) {

        for (int i = 0; i < array.length; i++)
            for (int j = i + 1; j < array.length; j++)
            {
                if (array[i].semester > array[j].semester)
                   {
                    Student temp = array[i];
                    array[i] = array[j];
                   array[j] = temp;
                   } 
            }   


        for (int i = 0; i < array.length; i++)
            for (int j = i + 1; j < array.length; j++)
            {
                if (array[i].semester == array[j].semester && array[i].cgpa > array[j].cgpa) 
                    {
                      
                        Student temp = array[i];
                        array[i] = array[j];
                        array[j] = temp;
                       
                    }
            }


        }
    

    
    public static void sortStudentsByName(Student[] array) {
        for (int i = 0; i < array.length; i++) 
            for (int j = i + 1; j < array.length; j++) {
                if ((array[i].Name).compareTo(array[j].Name) > 0) {
                    Student temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }


}


public class L5Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
           System.out.println("Enter total number of students:");
        int n = scanner.nextInt();
        scanner.nextLine();

        
        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for student " + (i + 1) + ":");

            System.out.print("Enter full name: ");
            String Name = scanner.nextLine();

            System.out.print("Enter year of joining: ");
            int year = scanner.nextInt();
            System.out.print("Enter month of joining (0-11): ");
            int month = scanner.nextInt();
            System.out.print("Enter day of joining: ");
            int day = scanner.nextInt();
            GregorianCalendar date = new GregorianCalendar(year, month, day);

            System.out.print("Enter semester: ");
            short semester = scanner.nextShort();

            System.out.print("Enter GPA: ");
            float gpa = scanner.nextFloat();

            System.out.print("Enter CGPA: ");
            float cgpa = scanner.nextFloat();

            scanner.nextLine(); 

            students[i] = new Student(Name, date, semester, gpa, cgpa);
        }

   
        

        Student.sortStudentsBySemesterAndCGPA(students);
        System.out.println("Records sorted by semester and CGPA:");
        for (Student student : students) {
            student.display();
        }

        
        Student.sortStudentsByName(students);
        System.out.println("Records sorted by name:");
        for (Student student : students) {
            student.display();
        }
    }
}