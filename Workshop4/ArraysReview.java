
public class ArraysReview {

	public static void main(String[] args) {
		//createArray();
		//arrayLength();
		//printAllElements();
		//changeValues();
		//twoDArrays();
		//enhancedForLoop();
	}
	
	public static void createArray() {
		//**create a new array of 5 elements, #s 1 through 5, 2 different ways
		
		//creating array #1
		int[] arr1 = new int[5];
		arr1[0] = 1;
		arr1[1] = 2;
		arr1[2] = 3;
		arr1[3] = 4;
		arr1[4] = 5;
		
		//creating array #2
		int[] arr2 = {1, 2, 3, 4, 5};
	}
	
	public static void arrayLength() {
		
		int[] arr1 = new int[5];
		int[] arr2 = {1, 2, 3, 4, 5};
		
		//length: given an array, returns an int of the # of elements in the array
		System.out.println(arr1.length);
		System.out.println(arr2.length);
	}
	
	public static void printAllElements() {
		//create an array of 5 numbers, #s 1-5
		int arr[] = {1, 2, 3, 4, 5};
		
		//use a for loop, while loop to print all the elements of the array
		for (int i = 0; i < arr.length; i++)
			System.out.println(arr[i]);
	}
	
	public static void changeValues() {
		//create an array of 5 numbers, #s 1-5
		int arr[] = {1, 2, 3, 4, 5};
		
		//change elements of the array to be 5 + the original number
		for (int i = 0; i < arr.length; i++) {
			arr[i] = arr[i] + 5;
		}
		
		//traversing elements with a while loop
		int x = 0;
		while (x < arr.length) {
			System.out.println(arr[x]);
			x++;
		}
	}
	
	public static void twoDArrays() {
		//create a 2D array of 0's 5x5
		int twoDArr[][] = new int[5][5];
		
		//use nested for loops to print out all the values
		for (int i = 0; i < twoDArr.length; i++) {
			for (int j = 0; j < twoDArr[i].length; j++) {
				System.out.print(twoDArr[i][j]);
			}
			System.out.println();
		}
		
	}
	
	public static void enhancedForLoop() {
		//create an array of 5 Strings, any words you want
		String arr[] = new String[5];
		arr[0] = "computer";
		arr[1] = "science";
		arr[2] = "enhanced";
		arr[3] = "for";
		arr[4] = "loop";
		
		//use an enhanced for loop to loop through each element and print the value
		for (String word : arr) {
			System.out.println(word);
		}
		
	}
	
}
