//1) Write a Java program to join two linked lists.

package Lab11May;

	import java.util.LinkedList;

	public class LinkListJoin {

	    public static void main(String[] args) {
	        
	        // Create the first linked list
	        LinkedList<Integer> list1 = new LinkedList<Integer>();
	        list1.add(12);
	        list1.add(23);
	        list1.add(34);
	        
	        // Create the second linked list
	        LinkedList<Integer> list2 = new LinkedList<Integer>();
	        list2.add(45);
	        list2.add(56);
	        list2.add(67);
	        
	        // Join the two linked lists
	        LinkedList<Integer> joinedList = new LinkedList<Integer>();
	        joinedList.addAll(list1);
	        joinedList.addAll(list2);
	        
	        // Print the joined list
	        System.out.println("Link List after adding 2 list 1 and list 2S: " + joinedList);
	    }
	}

