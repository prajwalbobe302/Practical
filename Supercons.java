package Super;
class Shape2 {//parent class
	Shape2()
	{
		System.out.println("Hello");
	}
}

class Size2 extends Shape2 {//child class
	//Default constructor
	Size2(){
		super();
		System.out.println("Hi");
	}
}
class Supercons {
		public static void main(String[] args) {
			Size2 obj=new Size2();
		}
	

}
