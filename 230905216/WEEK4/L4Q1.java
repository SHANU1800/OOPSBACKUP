import java.util.*;
import java.lang.*;

class STUDENT
{
	String sname;
	int[] marks_array;
	int total;
	double avg;

	public STUDENT()
{
	this.sname="ANONYMOUS";
	this.marks_array=new int[]{0,0,0,0};
	total=0;
	avg=0.0;
}

public STUDENT(String sname,int[] marks_array)
{
	this.sname=sname;
	this.marks_array=marks_array;
	compute();
}


public void compute()
{
	total=0;
	for(int mark:marks_array)
		total+=mark;

	avg=(double)total/marks_array.length;
}
public void display()
{
	System.out.println("Student name:"+sname);
System.out.println("MARKS ARE:");
	
for(int mark:marks_array)
	System.out.print(mark+"\t");
System.out.println();
System.out.println("Total:"+total);
System.out.println("Average:"+avg);
}
}

public class L4Q1
{   
	public static void main(String[] args)
	{Scanner sc=new Scanner(System.in);
		
STUDENT s1=new STUDENT();
s1.display();
System.out.print("Enter name:");
		String name=sc.nextLine();
	int marks[]=new int[4];
	System.out.print("Enter marks for 4 subjects:");
	for(int i=0;i<4;i++)
	marks[i]=sc.nextInt();
	
STUDENT s2=new STUDENT(name,marks);
s2.display();




	}
}
