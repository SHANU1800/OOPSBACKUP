import java.util.*;



class REVERSE
{

public static int reverse(int n)
{
	int sum=0;
	int rem;
 while(n>0)
{
 rem=n%10;
sum=sum*10+rem;
n=n/10;
}
return sum;
}


public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
   System.out.println("ENTER A NUMBER:");
   int a=sc.nextInt();
   System.out.println(reverse(a));


if(a==reverse(a))
{
	System.out.println("palindrome");
}
else
System.out.println("not a palindrome");


}
}
