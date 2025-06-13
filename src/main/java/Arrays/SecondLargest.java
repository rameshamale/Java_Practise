package Arrays;

import java.util.Arrays;

public class SecondLargest {
	
	public static void main(String[] args) {
		int[] array= {10,20,88,30,28,111,45,2,67,69};
		
		int fristLargest,secondLargest;
		
		if(array[0]>array[1]) {
			fristLargest=array[0];
			secondLargest=array[1];}
		else {
			fristLargest=array[1];
			secondLargest=array[0];
		}
		
		for(int i=2;i<array.length;i++) {
			if(array[i]>fristLargest) {
                secondLargest = fristLargest;
                fristLargest = array[i];
			}
			else if(array[i]>secondLargest && array[i] != fristLargest ) {
				secondLargest=array[i];
			}
		}
		
		System.out.println(secondLargest);
			
	}
}
