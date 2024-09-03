import java.util.Scanner;
class Mixer {
   
    int arr[];
   public void accept() {
	    Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array:");
        int n = sc.nextInt();
        arr = new int[n];
        System.out.println("Enter the elements of the array in ascending order without duplicates:");
        
        for(int i=0;i<n;i++) {
         
            arr[i] = sc.nextInt();
        }
    }
   public Mixer mix(Mixer A) {
        int[] mergedArray=new int[arr.length+A.arr.length];
        int i=0,k=0,j=0;
       
       while(i<arr.length && j<A.arr.length)
       {
		   if(this.arr[i]<A.arr[j])
		   mergedArray[k++]=arr[i++];
		   else
		   mergedArray[k++]=A.arr[j++];
                }
                while(i<arr.length)
               { mergedArray[k++]=arr[i++];
}                
                 while(j<A.arr.length)
            {    mergedArray[k++]=A.arr[j++];
		 }   
                Mixer mixed=new Mixer();
                mixed.arr=mergedArray;
                return mixed;
    }
    
    
   public void display() {
        System.out.println("Elements of the array:");
        for(int i=0;i<arr.length;i++) 
            System.out.print(arr[i]+"\t");
         System.out.println();
        
    }
}

public class L3Q3 {
    public static void main(String args[]) {

        Mixer m1 = new Mixer();
        Mixer m2 = new Mixer();
        Mixer m3 = new Mixer();

        m1.accept();
        m2.accept();
        System.out.println("The merged array is:");
        m3 = m1.mix(m2);
        m3.display();
    }
}
