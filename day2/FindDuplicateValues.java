package week1.day2;

public class FindDuplicateValues {

	public static void main(String[] args) {
		int[] num= {23,54,67,12,45,90,23,12};
		//nested for loop
		for (int i = 0; i < num.length; i++) {//outer loop
			for (int j = i+1; j < num.length; j++) {//inner loop
				if (num[i]==num[j]) {
					System.out.println("Duplicate Value:"+num[i]);
					
				}
				
			}
			
		}
	

	}

}
