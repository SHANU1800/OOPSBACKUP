import java.util.*;
import java.lang.*;
class STACK
{
	int[] arr;
	int tos;

	public STACK(int n)
	{
		arr=new int[n];
		tos=-1;
	}

	void push(int value)
	{
		if(tos==arr.length-1)
			throw new StringIndexOutOfBoundsException("STACK OVERFLOW");
			
	tos++;
	arr[tos]=value;
    }
 int pop()
 {
 	if(tos==-1)
 		throw new StringIndexOutOfBoundsException("STACK UNDERFLOW");
tos--;
return arr[tos+1];
 }

void display()
{
if(tos==-1)
	throw new StringIndexOutOfBoundsException("STACK IS EMPTY");

	System.out.println("CONTENTS OF STACK ARE");
	for(int i=0;i<=tos;i++)
		System.out.print(arr[i]+"\t");
	System.out.println();
}
}

public class L3Q4
{
public static void main(String args[])
{
System.out.print("Enter stack size:");
Scanner sc=new Scanner(System.in);

int n=sc.nextInt();
STACK st=new STACK(n);

st.push(1);
st.push(2);
st.push(3);
st.push(4);
st.pop();

st.display();


}
}