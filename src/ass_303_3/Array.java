package ass_303_3;

import java.util.Arrays;

public class Array {

	//main method
	public static void main(String[] args) {
		Array array = new Array();
		//array.printElements();
		//array.findMidElement();
		//array.printColorArr();
		//array.printRandInt();
		//array.printLinearArr();
		//array.printDoubleArr();
		//array.printNoMidArr();
		array.printMidSwapArr();
	}
	
	//problem 1
	public void printElements() {
		String output = "";
		int size = 3;
		for(int i=0; i<size; i++){
			output += i + " ";
		}
		System.out.println(output);
	}
	
	//problem 2
	public void findMidElement() {
		int[] arr = {13, 5, 7, 68, 2};
		int mid = (arr.length/2);
		System.out.println(arr[mid]);
	}
	
	//problem 3
	public void printColorArr() {
		String[] colors = {"red", "green", "blue", "yellow"};
		int size = colors.length;
		String[] newColors = colors.clone();
		System.out.println(Arrays.toString(newColors));
	}
	
	//problem 4
	public void printRandInt() {
		int[] arr = new int[5];
		int max = 100, min = 1;
		for(int i=0; i<arr.length-1;i++) {
			int rand = (int)(Math.random() * (max - min) + min); 
			arr[i] = rand;
		}
		System.out.println(arr[0]);
		System.out.println(arr[arr.length-1]);
		
		//System.out.println(arr[arr.length]);
		//arr[5] = 101;
	}
	
	//problem 5
	public void printLinearArr() {
		int size = 5;
		int[] arr = new int[size];
		for(int i=0; i<size; i++) {
			arr[i] = i;
		}
		System.out.println(Arrays.toString(arr));
	}
	
	//problem 6
	public void printDoubleArr() {
		int size = 5;
		int[] arr = new int[size];
		for(int i=0; i<size; i++) {
			arr[i] = i * 2;
		}
		System.out.println(Arrays.toString(arr));
	}
	
	//problem 7
	public void printNoMidArr() {
		int size = 5;
		int[] arr = new int[size];
		int mid = (arr.length/2);
		for(int i=0; i<size; i++) {
			arr[i] = i * 2;
			if(i != mid) {
				System.out.print(i + " ");
			}
		}
	}
	
	//problem 8
	public void printMidSwapArr() {
		int size = 5;
		int[] arr = new int[size];
		int mid = (arr.length/2);
		for(int i=0; i<size; i++) {
			arr[i] = i * 2;
			if(i == mid) {
				int temp = arr[0];
				arr[0] = i;
				arr[i] = temp;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
