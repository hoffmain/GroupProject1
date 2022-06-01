package GroupProject;

public class CodingTask5 {
	
	public static void main(String[] args) {
		
		//Create 2D array and calculate the sum of even and odd numbers
		
		int [][] num= {{16, 52, 3}, {4, 20, 8}, {72, 89, 1}};
		// initialize variables
		int sumEven=0;
		int sumOdd=0;
		
		for (int[] i:num) { 
			for (int y:i) {
				if(y%2==0) { 
					/*
					 * check if num is divisible my 2 with remainder of 0
					 */
					sumEven+=y;
					
				} else {
					sumOdd+=y;
				}
			}
		}
		System.out.println("The sum of odd numbers is "+sumOdd);
		System.out.println("The sum of even numbers is "+sumEven);
	}

}
