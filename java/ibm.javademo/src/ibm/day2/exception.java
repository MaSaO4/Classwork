package ibm.day2;

public class exception {

	public static void main(String [] args) {
		
		int i=10;
		int j= 0;
		try {
			int k=i/j;
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
}
	