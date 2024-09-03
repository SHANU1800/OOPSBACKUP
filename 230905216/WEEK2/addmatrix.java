import java.util.*;

class addmatrix
{

public static void main(String args[])
{
Scanner sc=new Scanner(System.in);

System.out.println("ENTER dimensions of matrix A:");
   int m=sc.nextInt();
   int n=sc.nextInt();
   int a[][]= new int[m][n];

System.out.println("ENTER dimensions of matrix B:");
   int x=sc.nextInt();
   int y=sc.nextInt();
   int b[][]= new int[x][y];

if(m!=x || n!=y)
{
   System.out.println("Not possible");
   
}

System.out.println("ENTER values in A:");
   for(int i=0;i<m;i++)
      for(int j=0;j<n;j++)
     a[i][j]=sc.nextInt();

  System.out.println("ENTER values in B:");
   for(int i=0;i<x;i++)
      for(int j=0;j<y;j++)
     b[i][j]=sc.nextInt();

int c[][]= new int[m][n];



  for(int i=0;i<m;i++)
         for(int j=0;j<n;j++)
         c[i][j]=a[i][j]+b[i][j];

      System.out.println("resultant matrix is");
      for(int w[]:c)
          {
            for(int z:w)
             System.out.print(z+"\t");
          
       System.out.println();
          }

         
}}
      




