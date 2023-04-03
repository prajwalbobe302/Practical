package Inheritance;

public class MultilevelInheritance {//main class
	public static void main(String[] args) {
		SIChild2 child = new SIChild2();//create a object of child class2
			child.display();
			child.show();
			child.print();
	}
}

class SIParent1 {//parent class
	void show() {//parent class user defined method
			System.out.println("Show the details of the Parent Class");
	}
}
//child cls of SIParent1 & Parent cls of SIChild2
	class SIChild1 extends SIParent1{
		void display() {
			System.out.println("Display the result of the child class 1");
		}
	}
	class SIChild2 extends SIChild1{
		void print() {
			System.out.println("Print the output of the child class 2");
		}
	}

