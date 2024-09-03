import java.util.*;
import java.lang.*;
class STUDENT
{
	String sname;
	int[] marks_array;
	int total;
	double avg;

public void assign(String sname,int[] marks_array)
{
	this.sname=sname;
	this.marks_array=marks_array;
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

public class L3Q1
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
STUDENT s1=new STUDENT();

System.out.print("Enter Student name:");
String sname=sc.nextLine();
System.out.println("Enter total subjects:");
int n=sc.nextInt();
int marks[]=new int[n];
s1.assign(sname,marks);
System.out.println("Enter Marks:");
for(int i=0;i<n;i++)
marks[i]=sc.nextInt();

s1.compute();
s1.display();


	}
}