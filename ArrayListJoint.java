package Lab10May;


	import java.util.ArrayList;

	public class ArrayListJoint {
	    public static void main(String[] args) {
	        // create first ArrayList
	        ArrayList<String> list1 = new ArrayList<>();
	        list1.add("Prajwal");
	        list1.add("Prakash");
	        list1.add("Bobe");

	        // create second ArrayList
	        ArrayList<String> list2 = new ArrayList<>();
	        list2.add("Sanket");
	        list2.add("Prakash");
	        list2.add("Bobe");

	        // join two ArrayLists
	        list1.addAll(list2);

	        // print the joined ArrayList
	        System.out.println("list After Adding 1st and 2nd list: " + list1);
	    }
	}


