package String;
import java.util.Scanner;

public class StringEuality {

public static void main(String args[]) {
	String str1, str2;// Scanner ab = new Scanner(System.in);
	Scanner ab = new Scanner(System.in);
	


System.out.println("Enter first String"); // java strlab.nextLine();
str1= ab.nextLine();

System.out.println("Enter second String"); // anudip
str2= ab.nextLine();


// Comparing two input string (java string compare)


//if (strl.equals (str2)) // equals () - compare original content of string if (stri==str2) // == compare reference not value //
//if (strl.compareTo (str2)>0)// compare lexicographically
if(str1==str2)
System.out.print ("Equal Strings");
else
System.out.print ("UnEqual Strings");
}
}
