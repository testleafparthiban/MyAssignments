package week1.day2;

import java.util.Arrays;

public class LearnArrays {

	public static void main(String[] args) {

		int[] age= {30,23,12,45,89,25,43};
		//array will work 	on index value
		//Index will start from	'0'
		//its fixed in size
		//print the value
		System.out.println("Print the second value :"+age[1]);
		int length = age.length;
		System.out.println("Length of the array:"+length);
		System.out.println("Last value:"+age[length-1]);
		Arrays.sort(age);
		
		System.out.println("After sort index 0:"+age[0]);
		
		for (int i = 0; i < age.length; i++) {
			System.out.println(age[i]);
			
		}
	
			
	}

}
