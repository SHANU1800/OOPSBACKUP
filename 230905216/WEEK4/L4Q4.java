
class Counter
{
	static int count=0;

	public Counter()
	{
		count++;
	}

	public static void showCount()
	{
       System.out.println("COUNT IS:"+count);
	}
}

public class L4Q4
{
	public static void main(String[] args)
	{	
Counter.showCount();
 System.out.println("creating two objects:");
		
        Counter c1=new Counter();
		Counter c2=new Counter();
			Counter.showCount();
			System.out.println("creating one more object:");
    	Counter c3=new Counter();
    	Counter.showCount();
}}