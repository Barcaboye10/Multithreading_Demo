class Hii implements Runnable
{
	public void run() {
		for(int i=1;i<=5;i++)
		{
			System.out.println("Hi");
			try
			{
				Thread.sleep(500);
			}
			catch(Exception e)
			{
				
			}
		}
	}
}
class Helloo implements Runnable
{
	public void run() {
		for(int i=1;i<=5;i++)
		{
			System.out.println("Hello");
			try
			{
				Thread.sleep(500);
			}
			catch(Exception e)
			{
				
			}
		}
	}
}
public class ThreadDemoRunnable {
	public static void main(String[] args)
	{
		Runnable hi=new Hii() {
			
		};
		Runnable hello=new Helloo();
		
		Thread t1=new Thread(hi);
		Thread t2=new Thread(hello);
		t1.start();
		t2.start();

		
	}
}
