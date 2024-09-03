
import java.util.*;



class FACT
{

public static int fact(int n)
{
	int f=1;
for(int i=1;i<=n;i++)
{
   f=f*i;
}
return f;
}


public static void main(String args[])
{
   Scanner sc=new Scanner(System.in);
   System.out.println("ENTER A NUMBER:");
   int a=sc.nextInt();
   System.out.println(fact(a));

System.out.println("enter N and R:");
int N=sc.nextInt();
int R=sc.nextInt();


int z=fact(N)/(fact(R)*fact(N-R));

System.out.println("NCR value is "+z);
}
}