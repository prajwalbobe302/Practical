package String;
//char[] work same as java string
public class StringExample1 {
	public void show() {//method 1
		char[]arr= {'j','a','v','a'};//char trype array
		System.out.println(arr);//by using new keyword creating string
		String s= new String(arr);
		System.out.println("Value is:" +s);//"Java"
	}
	public void myFunction() {//method2
		String s1="Prajwal";
		String s2="Prajwal";
		String s3= new String(s1);//Prajwal
	}
	public static void main(String[] args) {
		StringExample1 str = new StringExample1();
		str.show();
		str.myFunction();
	}

}
