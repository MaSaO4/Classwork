package ibm.day4;

public class Java1314NewFeatures {

//	public static void main(String[] args) {
//		
//		String firstName = "abc";
////		String adjective="";
//		char ch = firstName.charAt(0);
//		
////		switch(ch) {
////		case 'a': adjective ="Attractive";
////		break;
////		default:adjective ="zzz";
////
////		}
//		
//		String adjective = switch(ch) {         // LAMBDA EXPRESSION IN SWITCH CASE
//		case 'a' -> "Attractive";
//		case 'b' -> "Beautiful";
//		default -> "zzz";
//		
//		};
//		System.out.println(ch);
//		System.out.println(adjective);
//
//		
//	}
	
	
	public static void main(String[] args) {        
		// Traditional approach using concatenation and escape characters
		String str = "<html>\r\n"
				+ "<head>\r\n"
				+ "    <script src='main.js'></script>\r\n"
				+ "</head>\r\n"
				+ "<body>\r\n"
				+ "    <h1>Java 14</h1>\r\n"
				+ "    <p>Java 14 new features</p>\r\n"
				+ "</body>\r\n"
				+ "</html>";
		
		// New approach using Text Blocks                             STRING EXPRESSION
		
	String str2 = """
<html>
<head>
    <script src='main.js'></script>
</head>
<body>
    <h1>Java 14</h1>
    <p>Java 14 new features</p>
</body>
</html>
			""";
	System.out.println(str2);
		
	}
}
