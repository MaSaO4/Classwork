package ibm.day2;

import java.util.concurrent.*;

class Task implements Runnable{
	private String taskName;
	public Task(String taskName) {
		this.taskName=taskName;
	}
	@Override
	public void run() {
		System.out.println("Task started: " + taskName);
		try {
			Thread.sleep(500);
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("Task completed: "+ taskName);
	}
	
}

public class executor {

	public static void main(String[] args) {
		
		ExecutorService executor = Executors.newFixedThreadPool(5);
		
		for(int i=1;i<=10;i++) {
			Runnable obj=new Task("Task "+i);
			executor.submit(obj);
		}
		executor.shutdown();

	}

}
