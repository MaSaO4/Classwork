package ibm.day3;
import java.util.*;

public class CollectionFramework {
	
	public static void main(String[] args) {
		
//ARRAYLIST		
		ArrayList<String> friendsList = new ArrayList(); //GENERIC 
		friendsList.add("Sonu");
		friendsList.add("Monu");
		friendsList.add("Tonu");
		System.out.println(friendsList);
		System.out.println(friendsList.size());
		friendsList.remove(0);
		System.out.println(friendsList.size());

		List<Integer> myMarks = new ArrayList<>();
		myMarks.add(99);

//ITERATOR
		Iterator iterator = friendsList.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());;
		}
	}

}
