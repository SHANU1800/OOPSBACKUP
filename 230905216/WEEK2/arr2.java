import java.util.*;

class arr2
{

public static void main(String args[])
{
Scanner sc=new Scanner(System.in);

System.out.println("ENTER TOTAL VALUES IN ARRAY:");
   int N=sc.nextInt();
 int a[]= new int[N];
  
   for(int i=0;i<N;i++)
   a[i]=i+1;
System.out.println("The values are");
 for(int x:a)
  System.out.println(x);

}}