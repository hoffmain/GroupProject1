package GroupProject;

public class CodingTask10 {
	
	public static void main(String[] args) {
		
		//Write program to find second largest number in array
	
		int[] num= {4, 8, 45, 79, -87, 21};
		// initialize variables
		int largest=0;
		int second=0;
	
		for(int i=0; i<num.length; i++) { //will compare the nums in the array
			if(largest < num[i]) { //checks if the indexed num is largest
				second=largest; //reassigning variable
				largest=num[i];
			}
			if(num[i]<largest && num[i]>second) { 
				/*
				 * num[i] needs to match both conditions 
				 * to reassign value and print
				 */
				second=num[i];
			}
			
		}
		System.out.println("The second largest number is "+second);
	}

}
