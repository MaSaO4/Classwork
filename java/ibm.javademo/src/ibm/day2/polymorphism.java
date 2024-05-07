package ibm.day2;

public class polymorphism extends classForOveriding{
	
	static void addNums(int i ,int j) {
		System.out.println(i+j);
	}
	static void addNums(int i,int j, int k) {
		System.out.println(i+j+k);
	}
	static void mulNums(int i, int j , int k) {
		System.out.println(i*j*k);
	}

	public static void main(String[] args) {
		
        System.out.println("METHOD OVERLOADING");
		addNums(2,3);
		addNums(2,3,4);
		
        System.out.println("METHOD OVERIDING");
		mulNums(2,3,1);
		mulNums(1,2);
	}

}
class classForOveriding{
	static void mulNums(int i,int j) {
		System.out.println(i*j);
	}
}
