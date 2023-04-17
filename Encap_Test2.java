package Encapsulation_Eg;

class  Students{//encapsulated class
	//private data member
	private int stu_id;
	private String name, email;
	private float fees;
	//private getter& setter method
	public int getStu_id() {
		return stu_id;
	}
	public void setStu_id(int stu_id) {
		this.stu_id = stu_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public float getFees() {
		return fees;
	}
	public void setFees(float fees) {
		this.fees = fees;
	}
	
}
public class Encap_Test2 {//class to start the encapsulation class
	public static void main(String[] args) {
		Students s= new Students();//creating object of students class
		s.setStu_id(302);
		s.setName("Prajwal");
		s.setEmail("prajwalbobe30@gmail.com");
		s.setFees(3200f);
		//getting the value through getter method
		System.out.println(s.getStu_id()+" "+s.getName()+" "+s.getEmail()+" "+s.getFees());
		
	}

}
