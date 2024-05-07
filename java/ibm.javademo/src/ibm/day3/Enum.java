package ibm.day3;


public class Enum {


	public enum daysOfWeek{
	
		MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY
	
	}

	public static void main(String[] args) {
		
		daysOfWeek today = daysOfWeek.FRIDAY;
		System.out.println(today);
		today = daysOfWeek.SUNDAY;
		System.out.println(today);
	}

}
