package Inheritance;
//simple examp[le of inheritance(IS-A)
class Paents_Simple_EG_IS_A {//Parent Class
	int marks=85;

}
class Simple_EG_IS_A extends Paents_Simple_EG_IS_A{
	int Additional_percentage=5;
	private int marks;
	public static void main(String[]args) {
		Simple_EG_IS_A obj= new Simple_EG_IS_A();
		System.out.println("Total marks:"+ (obj.marks+obj.Additional_percentage));
	}
}
