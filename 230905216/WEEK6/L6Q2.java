import java.util.*;


class EMPLOYEE {
    String Ename;
    int Eid;
    double Basic;
    double DA;
    double Gross_Sal;
    double Net_Sal;

 
    void read() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Employee Name: ");
        this.Ename = scanner.nextLine();
        System.out.print("Enter Employee ID: ");
        Eid = scanner.nextInt();
        System.out.print("Enter Basic Salary: ");
        Basic = scanner.nextDouble();
    }


    void compute_net_sal(){
        DA = 0.52 * Basic;
        Gross_Sal = Basic + DA;
        Net_Sal = Gross_Sal - (0.30 * Gross_Sal); 
}

    void display(){
        System.out.println("Employee Name: " + Ename);
        System.out.println("Employee ID: " + Eid);
        System.out.println("Basic Salary: " + Basic);
        System.out.println("DA: " + DA);
        System.out.println("Gross Salary: " + Gross_Sal);
        System.out.println("Net Salary: " + Net_Sal);
    }
}

// Subclass PartTimeEmp
class PartTimeEmp extends EMPLOYEE {
    int hoursWorked;
    double HOURLY_RATE; 

    PartTimeEmp(int hours,double rate)
    {
        hoursWorked=hours;
        HOURLY_RATE=rate;
    }

    
    @Override
    void compute_net_sal() {
        Gross_Sal = hoursWorked * HOURLY_RATE;
        Net_Sal = Gross_Sal;
    }


    @Override
    void display() {
        System.out.println();
        super.display(); 
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Hourly Rate: " + HOURLY_RATE);
        System.out.println();
    }
}

// Subclass FullTimeEmp
class FullTimeEmp extends EMPLOYEE {
     double bonus;
    double deductions;

    FullTimeEmp(double setbonus,double setdeductions)
    {

        bonus=setbonus;
        deductions=setdeductions;
    }
   
    @Override
    void compute_net_sal() {
        DA = 0.52 * Basic;
        Gross_Sal = Basic + DA + bonus;
        Net_Sal = Gross_Sal - deductions;
    }

 
    @Override
    void display() {
        System.out.println();
        super.display(); 
        System.out.println("Bonus: " + bonus);
        System.out.println("Deductions: " + deductions);
        System.out.println();
    }
}


public class L6Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of employees: ");
        int N = scanner.nextInt();

        EMPLOYEE[] employees = new EMPLOYEE[N];

        for (int i = 0; i < N; i++)
        {
            System.out.println("Enter type of employee (1 for FullTime, 2 for PartTime): ");
            int type = scanner.nextInt();

            if (type == 1) { // FullTimeEmp
               
                System.out.println("Enter details of Full-Time employee " + (i + 1) + ":");
                
                System.out.print("Enter Bonus: ");
                double setBonus=scanner.nextDouble();
                System.out.print("Enter Deductions: ");
                double setDeductions=scanner.nextDouble();

                FullTimeEmp emp1 = new FullTimeEmp(setBonus,setDeductions);
                emp1.read();
                emp1.compute_net_sal();
                emp1.display();
            } 
            else if (type == 2) { // PartTimeEmp
                
                System.out.println("Enter details of Part-Time employee " + (i + 1) + ":");
                
                System.out.print("Hours Worked: ");
                int setHours=scanner.nextInt();
                  System.out.print("Hourly Rate: ");
                  double setrate=scanner.nextDouble();


                PartTimeEmp emp2 = new PartTimeEmp(setHours,setrate);
                emp2.read();
                emp2.compute_net_sal();
                emp2.display();
            }
            else {
                System.out.println("Invalid type. Skipping.");
                i--; 
            }
            System.out.println();
        }
    }
}
