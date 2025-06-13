package Arrays;

import java.util.HashSet;

public class FindDuplicates {
	
	public static void main(String[] args) {
	int[] array= {1,2,2,2,3,3,4,56,55,5};
	
    HashSet<Integer> seen = new HashSet<>();
    HashSet<Integer> duplicates = new HashSet<>();

    for(int num:array) {
    	boolean isUnique=seen.add(num);
    	
    	if(!isUnique==true) {
    		duplicates.add(num);
    	}
    }
	
    System.out.println(duplicates);
	
}
}
