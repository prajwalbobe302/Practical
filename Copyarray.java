package Array;

public class Copyarray {//class
	public static void main(String[] args) {
		//declaring soursce array
		char[]copyFrom= {'d','e','c','f','f','e','i','n'};
		char[]copyTo=new char[7];
		System.arraycopy(copyFrom, 2, copyTo, 2, 4);
		System.out.println(String.valueOf(copyTo));
	}

}
