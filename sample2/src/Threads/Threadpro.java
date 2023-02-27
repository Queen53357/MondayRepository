package Threads;

public class Threadpro extends Thread{
	public void run() {
		System.out.println("Thread running");
	}
	public static void main(String[] args)throws InterruptedException {
		Thread t1=new Thread();
		Thread t2=new Thread();
		t1.sleep(100);
		t1.currentThread();
		t2.start();
		System.out.println(t2.getName());
		System.out.println(t2.getId());
		System.out.println(t1.getName());
		System.out.println(t1.getId());
		System.out.println(t2.isAlive());
		t1.start();
		t1.run();
		System.out.println(t1.isAlive());
		System.out.println(t2.getPriority());
		System.out.println(t1.getState());
		System.out.println(t1.isDaemon());
		Threadpro tp=new Threadpro();
		tp.run();
		System.out.println(tp.getState());
	}
}
