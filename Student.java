package Inheritance;
//add is the reference entity of class
public class Student {
	int StudID;
	String StudName;
	Address add;
	Student(int StudID, String StudName , Address add) {
		this.StudID=StudID;
		this.StudName=StudName;
		this.add=add;

	}

	void show() {
		System.out.println(StudID + " " + StudName);
				System.out.println(add.City+" "+add.Dist+" "+add.Country);
	} 
}
