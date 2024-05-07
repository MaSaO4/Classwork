package ibm.day2;

abstract class M{
	
}

class A{
	String name="Neha";
	private int chocolates=10;
	
	public int getChocolates() {
		return chocolates;
	}
	public void setChocolates(int c) {
		this.chocolates=c;
	}
	public void distribute() {
		System.out.println("Distributing chocolates");
	}
	public void distribute(int n) {
		System.out.println("Distributing "+n+" chocolates");
	}
}
interface C{
	void dance();
}
class B extends A implements C{
	
	public void distribute() {
		System.out.println("Distributing 1 by 1");
	}

	@Override
	public void dance() {
		
		System.out.println("Dancing");
		
	}
}

public class assignment {

	public static void main(String[] args) {
		A girl = new A();
		girl.setChocolates(10);
		System.out.println(girl.getChocolates()); // Encapsulation
		girl.distribute(3); // method overloading
		B boy = new B();
		System.out.println(boy.name);  // inheritance
		boy.distribute(); // method overiding
		boy.dance(); // interface
	}

}
