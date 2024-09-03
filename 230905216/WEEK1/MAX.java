import java.util.*;


class MAX
{


public static void max1(int x,int y,int z)
{

if(x>y && x>z)
       System.out.println(x+" is greatest");

else if(y>x && y>z)
	System.out.println( y+" is greatest");

else if(z>y && z>x)
	System.out.println(z+" is greatest");

}

public static void max2(int x,int y,int z)
{

if(x>y)
{
	if(x>z)
       System.out.println(x+" is greatest");

    if(z>x)
    	 System.out.println(z+" is greatest");
      
}

if(y>x)
{	
  if(y>z)
	System.out.println(y+" is greatest");

  if(z>y)
	System.out.println(z+" is greatest");

}
}


public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
   System.out.println("ENTER three numbers");
   int x=sc.nextInt();
   int y=sc.nextInt();
   int z=sc.nextInt();

   System.out.println("from method 1 ");
   max1(x,y,z);

   System.out.println("from method 2 ");
   max2(x,y,z);
}
}