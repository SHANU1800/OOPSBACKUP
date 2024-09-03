
import java.util.*;


class STUDENT {
    
     String sname;
     int[] marks_array;
     int total;
     double avg;

    
    public STUDENT() {}

    public STUDENT(String sname, int[] marks_array) {
        this.sname = sname;
        this.marks_array = marks_array;
    }

   
    public void display() {
        System.out.println("Student Name: " + sname);
        System.out.println("Marks: ");
        for (int mark : marks_array) {
            System.out.print(mark + "\t");
        }
        System.out.println();
        System.out.println("Total: " + total);
        System.out.println("Average: " + avg);
    }

  
    public void compute() {
        total = 0;
        for (int mark : marks_array) {
            total += mark;
        }
        avg = (double) total / marks_array.length;
    }


    public void assign(String sname, int[] marks_array) {
        this.sname = sname;
        this.marks_array = marks_array;
    }

   


  
}

///////////////////////////////////////

class ScienceStudent extends STUDENT {
     int practicalMarks;


    public ScienceStudent(String sname, int[] marks_array, int pMarks) {
        super(sname, marks_array); 
        practicalMarks = pMarks;
    }

   
    @Override
    public void compute() {
        int total = practicalMarks;
        for (int mark : marks_array) {
            total += mark;
        }
         avg = (double)total / (marks_array.length + 1);

    }

 
    public void displayPracticalMarks() {
        System.out.println("Practical Marks: " + practicalMarks);
    }
}




class ArtsStudent extends STUDENT {
     String electiveSubject;

    
    public ArtsStudent(String sname, int[] marks_array, String elective) {
        super(sname, marks_array); 
        electiveSubject = elective;
    }

    public void displayElectiveSubject() {
        System.out.println("Elective Subject: " + electiveSubject);
    }
}

public class L6Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        System.out.println("Enter the name of the student:");
        String studentName = sc.nextLine();
        System.out.println("Enter the number of subjects:");
        int n = sc.nextInt();
        int[] marks = new int[n];
        System.out.println("Enter marks:");
        for (int i = 0; i < n; i++) {
            marks[i] = sc.nextInt();
        }
        STUDENT student = new STUDENT(studentName, marks);
        student.compute();
        student.display();


        System.out.println("\nEnter the name of the science student:");
        sc.nextLine(); 
        String scienceStudentName = sc.nextLine();
        System.out.println("Enter the number of subjects:");
        n = sc.nextInt();
        int[] scienceMarks = new int[n];
        System.out.println("Enter the marks:");
        for (int i = 0; i < n; i++) {
            scienceMarks[i] = sc.nextInt();
        }
        System.out.println("Enter practical marks:");
        int practicalMarks = sc.nextInt();
        ScienceStudent scienceStudent = new ScienceStudent(scienceStudentName, scienceMarks, practicalMarks);
        scienceStudent.compute();
        scienceStudent.display();
        scienceStudent.displayPracticalMarks();

        //ArtsStudent object
        System.out.println("\nEnter the name of the arts student:");
        sc.nextLine(); 
        String artsStudentName = sc.nextLine();
        System.out.println("Enter the number of subjects:");
        n = sc.nextInt();
        int[] artsMarks = new int[n];
        System.out.println("Enter the marks:");
        for (int i = 0; i < n; i++) {
            artsMarks[i] = sc.nextInt();
        }
        System.out.println("Enter the elective subject:");
        sc.nextLine();
        String electiveSubject = sc.nextLine();
        ArtsStudent artsStudent = new ArtsStudent(artsStudentName, artsMarks, electiveSubject);
        artsStudent.compute();
        artsStudent.display();
        artsStudent.displayElectiveSubject();

        // Demonstrate dynamic polymorphism
        System.out.println("\nDemonstrating Dynamic Polymorphism:");
        STUDENT ref;
        
        ref = scienceStudent;
        ref.display();

        ref = artsStudent;
        ref.display(); 
    }
}
