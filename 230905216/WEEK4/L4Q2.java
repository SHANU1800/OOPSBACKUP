import java.util.*;
import java.lang.*;
class EMPLOYEE
{
	String Ename;
	int Eid;
	double Basic;
	double DA;
	double Gross_Sal,Net_Sal;

public EMPLOYEE()
{
	Ename="ANONYMOUS";
	Eid=0;
	Basic=0.0;
	DA=0.0;
	Gross_Sal=0.0;
	Net_Sal=0.0;

}

public EMPLOYEE(String name,int id,double basic)
{
	Ename=name;
	Eid=id;
	Basic=basic;
	compute_net_sal();

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
public class L4Q2
{

public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	EMPLOYEE emp1= new EMPLOYEE();
    
emp1.DISPLAY();
EMPLOYEE[] emp= new EMPLOYEE[n];
for(int i=0;i<n;i++){
 emp[i]= new EMPLOYEE(sc.next(),sc.nextInt(),sc.nextDouble());
emp[i].DISPLAY();
}


}}
