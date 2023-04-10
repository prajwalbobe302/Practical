package Super;
class Shape{ 
	String name="circle";
}
class Size extends Shape {
	String name="No Size";
	void print( ) {
		System.out.println(name);
		System.out.println(super.name);
	}
}

class SuperTV {
	public static void main(String[] args) {
			Size obj=new Size();
			obj.print();
	}
}
