package ibm.day2;

public class multithreading extends Thread {
	
	public void run() {
		printNums();
	}
	static void printNums(){
		for(int i=1;i<=10;i++) {
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		
		multithreading obj=new multithreading();
		obj.start();
		multithreading obj2 = new multithreading();
		obj2.start();
	}

}
