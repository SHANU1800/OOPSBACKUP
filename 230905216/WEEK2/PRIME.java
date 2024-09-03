import java.util.*;

class PRIME
{


public static void isPrime(int a[],int n)
{
  int FLAG=0;
   for(int i=0;i<n;i++)
   {
    FLAG=0;
    for(int j=2;j<a[i];j++)
    {
      if(a[i]%j==0)
        FLAG=1;
    }

    if(a[i]<=1)
      FLAG=1;

    if(FLAG==0)
   System.out.println(a[i]+"is a prime no.");

   }
}





public static void main(String args[])
{
Scanner sc=new Scanner(System.in);

System.out.println("ENTER TOTAL VALUES IN ARRAY:");
   int n=sc.nextInt();
   int a[]= new int[n];
   System.out.println("ENTER INTEGERS IN ARRAY:");
   for(int i=0;i<n;i++)
   a[i]=sc.nextInt();

isPrime(a,n);

 }


}