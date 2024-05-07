// GARBAGE - unusable objects

package ibm.day2;

public class Garbage {

	public static void main(String[] args) {
		
		String str = "abc";
		str = null;           // unused object - gets implicitly killed by java

	}

}
