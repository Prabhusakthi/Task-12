package task12;


	import java.util.ArrayList;

	public class arraylist {
	    public static void main(String[] args) {
	        // Create an ArrayList of strings
	        ArrayList<String> arrayList = new ArrayList<>();

	        // Add elements to the ArrayList
	        arrayList.add("Apple");
	        arrayList.add("Banana");
	        arrayList.add("Orange");
	        arrayList.add("Mango");

	        System.out.println("ArrayList before removal: " + arrayList);

	        // Remove all elements from the ArrayList
	        arrayList.clear();

	        System.out.println("ArrayList after removal: " + arrayList);
	    }
	}


