package Arrays;

public class FindMinValue {
	
	public static void main(String[] args) {
		
		int[] array= {42,2,34,62,33,56};
		int minNumber=array[0];
		
		for(int i=1;i<array.length;i++) {
			if(array[i]<minNumber) {
				minNumber=array[i];
			}
		}
		System.out.println(minNumber);
	}

}
