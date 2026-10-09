package in.praveenit.th;

import java.util.HashSet;

public class HashSetInternalDemo {
	
	public static void main(String[] args) {
        HashSet<Employee> employees = new HashSet<>();

        employees.add(new Employee(1, "John"));
        employees.add(new Employee(2, "Alice"));
        employees.add(new Employee(1, "John")); // Duplicate (same id & name)

        System.out.println(employees);
        // Output: Only 2 elements will be printed, duplicate ignored
    }

}
