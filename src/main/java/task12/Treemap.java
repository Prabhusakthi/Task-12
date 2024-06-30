package task12;

	import java.util.TreeMap;

	public class Treemap {
	    public static void main(String[] args) {
	        // Create a TreeMap to store employee IDs and names
	        TreeMap<Integer, String> employeeMap = new TreeMap<>();

	        // Add employees to the TreeMap
	        employeeMap.put(101, "John");
	        employeeMap.put(102, "Alice");
	        employeeMap.put(103, "Bob");
	        employeeMap.put(104, "Emily");
	        employeeMap.put(105, "David");

	        // Print names of all employees in alphabetical order
	        System.out.println("Names of all employees in alphabetical order:");
	        for (String name : employeeMap.values()) {
	            System.out.println(name);
	        }
	    }
	}


