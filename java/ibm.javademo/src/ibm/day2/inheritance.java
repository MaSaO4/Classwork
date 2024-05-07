package ibm.day2;

class Phone {
	
	void sms() {
		System.out.println("Sending sms");
	}
	void call() {
		System.out.println("Calling");
	}
}

class SmartPhone extends Phone{
	
	void camera() {
		System.out.println("Clicking");
	}
}

class SuperSmartPhone extends SmartPhone{
	
	void facetime() {
		System.out.println("Facetime call initiated");
	}
	void camera() {
		System.out.println("Clicking portraits");
	}
}

public class inheritance {

	public static void main(String[] args) {
		
		System.out.println("SmartPhone");
		SmartPhone samsung=new SmartPhone();
		samsung.call();
		samsung.camera();
		samsung.sms();
		System.out.println();
		System.out.println("SuperSmartPhone");
	
		SuperSmartPhone iPhone=new SuperSmartPhone();
		iPhone .call();
		iPhone.facetime();
		iPhone.camera();

	}

}
