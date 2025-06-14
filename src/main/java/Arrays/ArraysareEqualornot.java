package Arrays;

import java.util.Arrays;

public class ArraysareEqualornot {
	
	public static void main(String[] args) {
		int[] a= {10,20,30};
		int[] b= {10,20,30};
		int[] c= {40,50,50};
        
        boolean r = Arrays.equals(a, b);

		System.out.println(a.equals(b));
		System.out.println(r);

	}

}
