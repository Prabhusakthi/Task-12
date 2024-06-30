package task12;


	import java.util.ArrayList;
	import java.util.List;

	public class listarray {
	    public static void main(String[] args) {
	        // Create a List of integers
	        List<Integer> list = new ArrayList<>();
	        list.add(10);
	        list.add(20);
	        list.add(30);
	        list.add(40);
	        list.add(50);

	        // Convert List to array
	        Integer[] array = list.toArray(new Integer[0]);

	        // Print the elements of the array
	        System.out.println("Elements of the array:");
	        for (int i = 0; i < array.length; i++) {
	            System.out.println(array[i]);
	        }
	    }
	    
	}
	    
	


