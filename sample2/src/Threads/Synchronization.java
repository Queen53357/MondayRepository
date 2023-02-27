package Threads;
class sync{
	synchronized void method()
	{
		Thread resource=Thread.currentThread();
		for(int i=1;i<=100;i++)
		{
			System.out.println(resource.getName()+":"+i);
		}
	}
}

public class Synchronization {

	public static void main(String[] args) {
		System.gc();
		final sync sy=new sync();
		Thread t2=new Thread("T2")
				{
				public void run()
				{
					sy.method();
				}
				};
				Thread t3=new Thread("T3")
						{
						public void run()
						{
							sy.method();
						}
						};
						t2.start();
						t3.start();

	}

}
