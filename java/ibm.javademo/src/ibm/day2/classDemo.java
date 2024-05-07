package ibm.day2;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class classDemo {

	static void gstBillPrint(double amount) {
		double gst=18;
		double billAmount = amount + (amount *(gst/100));
		System.out.println(billAmount);
	}
	static double gstBillCalc(double amount) {
		double gst=18;
		double billAmount = amount + (amount *(gst/100));
		return billAmount;
	}
	static void gstBillPrint(double amount, double gst) {
		double billAmount = amount + (amount *(gst/100));
		System.out.println(billAmount);
	}
	public static void main(String[] args) {
		System.out.println("Basic Print");
		classDemo.gstBillPrint(200);
		gstBillPrint(350);
		System.out.println();
		System.out.println("Calcualtor");
		System.out.println(classDemo.gstBillCalc(950));
		System.out.println();
		System.out.println("Method overloading");
		classDemo.gstBillPrint(200, 6);
		classDemo.gstBillPrint(350, 12);
		classDemo.gstBillPrint(100, 70);
		
		employee emp1=new employee("Sonu",25,50000);
		employee emp2=new employee("Tonu",30,2375);
		employee emp3=new employee("Monu",19,200);
		emp1.printEmployee();
		emp2.printEmployee();
		emp3.printEmployee();
	}

}
