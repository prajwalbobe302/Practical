package Lab10May;

	import java.util.ArrayList;
	import java.util.List;

	public class joinThree {
	    public static void main(String[] args) {
	        // create first ArrayList
	        List<String> list1 = new ArrayList<>();
	        list1.add("apple");
	        list1.add("banana");
	        list1.add("orange");

	        // create second ArrayList
	        List<String> list2 = new ArrayList<>();
	        list2.add("grape");
	        list2.add("pineapple");
	        list2.add("watermelon");

	        // create third ArrayList
	        List<String> list3 = new ArrayList<>();
	        list3.add("pear");
	        list3.add("kiwi");
	        list3.add("mango");

	        // create a new ArrayList to join the three ArrayLists
	        List<String> joinedList = new ArrayList<>();
	        joinedList.addAll(list1);
	        joinedList.addAll(list2);
	        joinedList.addAll(list3);

	        // print the joined ArrayList
	        System.out.println("Joined ArrayList: " + joinedList);
	    }
	}
