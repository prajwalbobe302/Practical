package Lab10May;
import java.util.ArrayList;
public class ArrayListPrint {
	
	    public static void main(String[] args) {
	        ArrayList<String> list = new ArrayList<>();
	        list.add("Prajwal");
	        list.add("Ravi");
	        list.add("Pranita");

	        for (int i = 0; i < list.size(); i++) {
	            System.out.println("Element at position " + i + ": " + list.get(i));
	        }
	    }
	}
