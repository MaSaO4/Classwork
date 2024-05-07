package ibm.day3;

public class Throws {
	
	public static void printNums() throws InterruptedException {
		for(int i=0;i<11;i++) {
			System.out.println(i);
			Thread.sleep(500);
		}
	}
	
	public static void callToPrint() throws InterruptedException {
		Throws.printNums();
	}

	public static void main(String[] args){
		
		try {
			Throws.callToPrint();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
