package Array;

public class PassingArrayToMethod {
	//creating a method whichj pass an array as a paarmeters
static void maximumNo(int array[]) {
	int max=array[0];//5
	for(int i=1;i<array.length;i++)
		if(max<array[i])//7
			max=array[i];
	System.out.println(max);
}
static void minimumNo(int array[]) {
	int min=array[0];//5 7 9
	for(int i=1;i<array.length;i++)
		if(min>array[i])//7
			min=array[i];
	System.out.println(min);
}
public static void main(String[] args) {
	int a[]= {5,7,9,2,10};
	maximumNo(a);
	minimumNo(a);
}

}
