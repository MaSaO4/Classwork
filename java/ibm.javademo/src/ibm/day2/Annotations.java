package ibm.day2;

@interface MyAnno{           // CUSTOM ANNOTATIONS
	String val();
}

@MyAnno(val ="abc")
class C1{
	
}

@FunctionalInterface 
interface I1{
	void m1();
}

class C2 implements I1{

	@Override                   // wont affect the execution but will make sure no mistake's been made      
	public void m1() {

	}
	
}

public class Annotations {

	public static void main(String[] args) {
		
		

	}

}
