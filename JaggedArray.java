package Array;
//odd nos/ diff nos of colums knows as a
public class JaggedArray {
	public static void main(String[] args) {
		//declars 2D array
		//declare no of row=3 but column=blank
		int arr[][]=new int[3][];
		//defining column 5+7+9=21
		arr[0]=new int [5];
		arr[1]=new int [7];
		arr[2]=new int [9];
		//initialized the jagged array
		int count =0;
		for(int i=0;i<arr.length;i++)//row
			for(int j=0;j<arr[i].length;j++)
				arr[i][j]=count++;
		//print the jagged array
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
