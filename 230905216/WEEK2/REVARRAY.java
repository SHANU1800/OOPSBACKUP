import java.util.*;

class REVARRAY
{

public static void main(String args[])
{
Scanner sc=new Scanner(System.in);

System.out.println("ENTER TOTAL VALUES IN ARRAY:");
   int n=sc.nextInt();
 int a[]= new int[n];
   System.out.println("ENTER VALUES IN ARRAY:");
   for(int i=0;i<n;i++)
   a[i]=sc.nextInt();

System.out.println("REV ARRAY IS");

   for(int i=n-1;i>=0;i--)
   	System.out.println(a[i]);

}
}