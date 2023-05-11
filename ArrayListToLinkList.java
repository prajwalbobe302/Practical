//3) Write a Java program to convert a linked list to an array using toArray() method.

package Lab11May;

	import java.util.Arrays;
	import java.util.LinkedList;

	public class ArrayListToLinkList {

	    public static void main(String[] args) {
	        
	        // Create a linked list
	        LinkedList<Integer> linkedList = new LinkedList<Integer>();
	        linkedList.add(45);//enter a list numbers
	        linkedList.add(68);
	        linkedList.add(73);
	        linkedList.add(24);
	        linkedList.add(84);
	        
	        // Convert the linked list to an array
	        Integer[] array = linkedList.toArray(new Integer[0]);
	        
	        // Print the array
	        System.out.println("Array is : " + Arrays.toString(array));
	    }
	}


