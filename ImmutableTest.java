package String;

public class ImmutableTest {
	public static void main(String[] args) {
		String str="Prajwal";
		str.concat("Bobe");//insert the string at the end
		str=str.concat("Bobe");//it will print PrajwalBobe
		//it will print Prajwal only beacuse string is immutable
		System.out.println(str);
	}
}
