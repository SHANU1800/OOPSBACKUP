import java.util.*;
import java.lang.*;
class EMPLOYEE
{
	String Ename;
	int Eid;
	double Basic;
	double DA;
	double Gross_Sal,Net_Sal;


	

void read()
{
	Scanner sc=new Scanner(System.in);
	
	System.out.print("Enter name: ");
     this.Ename=sc.nextLine();

	System.out.print("Enter employee id: ");
     this.Eid=sc.nextInt();

	System.out.print("Enter Basic salary: ");
     this.Basic=sc.nextDouble();

}

void compute_net_sal()
{
this.DA=0.52*Basic;
Gross_Sal=DA+Basic;
Net_Sal=Gross_Sal-0.30*Gross_Sal;
}

void DISPLAY()
{
	
	System.out.print("EMPLOYEE NAME:"+Ename);
	System.out.println();
	System.out.print("EMPLOYEE ID:"+Eid);
	System.out.println();
	System.out.print("EMPLOYEE Basic Salary:"+Basic);
	System.out.println();
	System.out.print("EMPLOYEE DA:"+DA);
	System.out.println();
	System.out.print("EMPLOYEE Gross Salary:"+Gross_Sal);
	System.out.println();
	System.out.print("EMPLOYEE Net Salary:"+Net_Sal);
	System.out.println();

}
}
public class L3Q2
{

public static void main(String args[])
{

	Scanner sc=new Scanner(System.in);
	int n;
	System.out.print("Enter total number of employees:");
    n=sc.nextInt();
    EMPLOYEE employees[]= new EMPLOYEE[n];



for(int i=0;i<n;i++)
{
	employees[i]= new EMPLOYEE();
	System.out.println("Enter details of employee"+(i+1)+" :");
employees[i].read();
employees[i].compute_net_sal();
employees[i].DISPLAY();
System.out.println();
}


}}