package com.company;

/**
 * Created by prasingh on 16/5/18.
 */
public class ThreadDemo extends Thread{
	public ThreadDemo(ThreadGroup group, String name) {
		super(group, name);
	}

	@Override
	public void run() {
		System.out.println("my thread class");
		try {
			Thread.sleep(5000);
		}
		catch (InterruptedException e){
			e.printStackTrace();
		}

	}
}

 class ThreadGroupDemo {
	 public static void main(String[] args) {
		 ThreadGroup pg = new ThreadGroup("Parent Group");
		 ThreadGroup sg = new ThreadGroup(pg , "SubGroup");
		 ThreadDemo t = new ThreadDemo(pg, "thread1");
		 ThreadDemo t1 = new ThreadDemo(pg , "thread2");
		 t.start();
		 t1.start();
		 System.out.println(pg.activeCount());
		 System.out.println(pg.activeGroupCount());
		 try {
			 Thread.sleep(10000);
		 }
		 catch (InterruptedException e){
			 e.printStackTrace();
		 }
		 pg.list();

		 System.out.println(pg.activeCount());
		 System.out.println(pg.activeGroupCount());
		 getSystemLevelThreads() ;
	 }

	 private static void getSystemLevelThreads(){
		 ThreadGroup system= Thread.currentThread().getThreadGroup().getParent();
		 Thread t[]= new Thread[system.activeCount()];
		 system.enumerate(t);
		 for (Thread t1 : t ){
			 System.out.println(t1.getName() +" -- " + t1.isDaemon());
		 }
	 }


 }
