package Lab10May;

	import java.util.ArrayList;
	import java.util.Collections;
	public class ArrayListReverse {

	    public static void main(String[] args) {
	        ArrayList<Integer> list = new ArrayList<>();
	        list.add(10);//add the numbers in arraylist
	        list.add(20);
	        list.add(30);
	        list.add(40);
	        list.add(50);
	        list.add(60);

	        // Reverse the list using the sort method and a custom Comparator
	        Collections.sort(list, Collections.reverseOrder());

	        // Print the reversed list
	        System.out.println("Reversed list in descending order:");
	        for (Integer element : list) {
	            System.out.println(element);
	        }
	    }
	}

