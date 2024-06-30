package task12;

	public class employee {
	    private String name;
	    private int id;
	    private double salary;

	    // Constructor
	    public employee(String name, int id, double salary) {
	        this.name = name;
	        this.id = id;
	        this.salary = salary;
	    }

	    // Method to print employee name
	    public void printName() {
	        System.out.println("Employee Name: " + name);
	    }

	    // Method to print employee salary
	    public void printSalary() {
	        System.out.println("Employee Salary: " + salary);
	    }

	    // Getters and setters (optional)
	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public int getId() {
	        return id;
	    }

	    public void setId(int id) {
	        this.id = id;
	    }

	    public double getSalary() {
	        return salary;
	    }

	    public void setSalary(double salary) {
	        this.salary = salary;
	    }
	
   
	    public static void main(String[] args) {
	        // Creating an Employee object
	        employee emp = new employee("John Doe", 1001, 50000.0);

	        // Printing employee name and salary
	        emp.printName();
	        emp.printSalary();
	    }
	}


