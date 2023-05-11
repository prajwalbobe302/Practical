//2) Write a Java program to convert a linked list to an array list.

package Lab11May;

	import java.util.ArrayList;
	import java.util.LinkedList;

	public class LinkListToArrayList {

	    public static void main(String[] args) {
	        
	        // Create a linked list
	        LinkedList<String> linkedList = new LinkedList<String>();
	        linkedList.add("One");
	        linkedList.add("Two");
	        linkedList.add("Three");
	        
	        // Convert the linked list to an array list
	        ArrayList<String> arrayList = new ArrayList<String>(linkedList);
	        
	        // Print the array list
	        System.out.println("Array List is : " + arrayList);
	    }
	}
