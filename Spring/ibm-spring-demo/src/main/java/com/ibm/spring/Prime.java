package com.ibm.spring;


class Single{
	
//	private static Single instance = new Single();  //EARLY LOADING
	private static Single instance;
	
	private Single() {
		super();
	}
	
	public static Single getInstance() {
		if(instance==null) {
			instance =new Single()
;		}
		return instance;
	}
	
}

public class Prime {

	public static void main(String[] args) {
		
//		Single obj=new Single();
//		Single obj2=new Single();
		
		Single obj3=Single.getInstance();
		Single obj4=Single.getInstance();
		
//		System.out.println(obj.equals(obj2));
//		
//		System.out.println(obj.hashCode());
//		System.out.println(obj2.hashCode());
		System.out.println(obj3.hashCode());
		System.out.println(obj4.hashCode());

	}

}
