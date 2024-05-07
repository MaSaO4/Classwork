/*
 FEATURES INTRODUCED IN JAVA 8
 
 1. Function Interface
 2. Lambda Expression
 3. Method Reference
 4. Stream API
 
*/
package ibm.day4;

import java.util.*;

import ibm.day2.employee;

interface FunInt{                               // FUNCTIONAL INTERFACE 
	void m1();
}

public class Java8NewFeatures {

	public static void main(String[] args) {
		
		FunInt obj = () -> {                    // LAMBDA EXPRESSION 
			System.out.println("m1 invoked");
		};
		obj.m1();
		
		System.out.println();
		System.out.println(".........................................................");
		System.out.println();
		
		List <String> myFriends = new ArrayList<String>();
		myFriends.addAll(Arrays.asList("Sonu","Monu","Tonu"));
		myFriends.forEach(System.out::println);   // METHOD REFERENCE 
		
		System.out.println();
		System.out.println(".........................................................");
		System.out.println();
		
		List <employee> empList  = new ArrayList<>();
		empList.addAll(Arrays.asList(new employee("Sonu",25,2.5),new employee("Tonu",30,10),new employee("Lonu",20,5.75),new employee("Ponu",23,7.5),new employee("Bonu",35,12.5)));
		
		System.out.println("employees getting salary more than 5  \n");
		
//		empList.forEach(emp ->{
//			if(emp.getSalary() > 5)
//			System.out.println(emp);
//		});
		
		empList.stream().filter(emp->emp.getSalary()>5).forEach(System.out::println);;		// STREAM API
		
		System.out.println("\nlist of first n emloyees \n");
		
		empList.stream().limit(2).forEach(System.out::println);
		
		System.out.println("\nlist of employees except first n emloyees \n");
		
		empList.stream().skip(2).forEach(System.out::println);
	}

}
