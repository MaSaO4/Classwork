package ibm.day1;

public class assignment {

	public static void main(String[] args) {
		int berthNo =72;
		int berthType =berthNo%8;
		if(berthNo <1 || berthNo>72) {
			System.out.println("Enter a valid berth number :)");
		}else {
		
		switch(berthType) {
		
		case 1 : System.out.println("Your berth number is: "+ berthNo+", berth type is lower!");break;
		case 2 : System.out.println("Your berth number is: "+ berthNo+", berth type is middle!");break;
		case 3 : System.out.println("Your berth number is: "+ berthNo+", berth type is upper!");break;
		case 4 : System.out.println("Your berth number is: "+ berthNo+", berth type is lower!");break;
		case 5 : System.out.println("Your berth number is: "+ berthNo+", berth type is middle!");break;
		case 6 : System.out.println("Your berth number is: "+ berthNo+", berth type is upper!");break;
		case 7 : System.out.println("Your berth number is: "+ berthNo+", berth type is side lower!");break;
		case 0 : System.out.println("Your berth number is: "+ berthNo+", berth type is side upper!");break;
//		default:System.out.println("Enter a valid berth number :)");
		}
	}

}
}