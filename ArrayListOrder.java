/*Write a java program where the type of arraylist is of type String, 
take the input from the user using Scanner and print it in ascending order with output*/
package Lab10May;


	import java.util.ArrayList;
	import java.util.Collections;
	import java.util.Scanner;

	public class ArrayListOrder {

	    public static void main(String[] args) {
	        
	        // Create an ArrayList to store the strings
	        ArrayList<String> strings = new ArrayList<String>();
	        
	        // Create a scanner to read user input
	        Scanner scanner = new Scanner(System.in);
	        
	        // Read strings from the user until they enter an empty string
	        System.out.println("Enter a list of strings, one per line:");
	        while (true) {
	            String input = scanner.nextLine();
	            if (input.isEmpty()) {
	                break;
	            }
	            strings.add(input);
	        }
	        
	        // Sort the strings in ascending order
	        Collections.sort(strings);
	        
	        // Print the sorted strings
	        System.out.println("Sorted strings:");
	        for (String str : strings) {
	            System.out.println(str);
	        }
	    }
	}

