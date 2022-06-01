package GroupProject;

public class CodingTask3 {
	
	public static void main(String[] args) {
		
		/*
		 * Create a 2D array of integer values. 
		 * Print the sum of all numbers.
		 */
		
		int[][] num= {{54, 84, 4}, {1, 3, 21}, {12, 6, 9}};
		// initialize variable
		int sum=0;
		
		for(int i=0; i<num.length; i++) {//goes through numbers in each array
			for(int y=0; y<num[0].length; y++) {
				sum+=num[i][y]; // adds number to the sum, goes back to find more numbers
			}
		}
		System.out.println("The sum of all numbers is "+sum);
	}

}
