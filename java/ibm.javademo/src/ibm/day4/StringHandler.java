package ibm.day4;

public class StringHandler {

	public static void main(String[] args) {
		
		String str = "asda";
		String str1=new String("hiuj");
		String str2 = "asDA";
		
		System.out.println(str.indexOf("a"));  // returns the index number of the character 
		System.out.println(str.valueOf("sa"));
		System.out.println(str.charAt(2));   // return index of the character
		System.out.println(str.endsWith("a")); // returns boolean for the condition
		System.out.println(str.equalsIgnoreCase(str2)); //Ignores the case and compares the string
		System.out.println(str2.toUpperCase()); // converts string to UUPERCASE || toLowerCase  to convert it into LOWERCASE
		
		char [] ch = str.toCharArray(); //IMPORTANTTTTTTT.......
		
	}

}
