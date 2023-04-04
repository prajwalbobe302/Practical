package Inheritance;

public class Aggregration_Eg_HAS_A {
	public static void main(String[] args) {
		Address a = new Address("South Solapur","Solapur" , "Maharashtra");
		Student s = new Student(02, "Pranita", a);
		
			s.show();
	}
	

}
