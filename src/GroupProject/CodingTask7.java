package GroupProject;

public class CodingTask7 {
	
	public static void main(String[] args) {
		
		/*
		 * Write a java program to check whether a given number is prime or not
		 */
		
		int num=13; //assigning the variable with an integer
		boolean prime=true; //assigning the boolean variable as true
		
		for(int i=2; i<num; i++) {
		/*
		 * a prime number is only divisible my 1 or itself
		 * all numbers are divisible by 1, so i needs to start with 2
		 * and i needs to be less than num
		 */
			if(num%i==0) {
				prime=false;
			/*
			 * if num is divided by any number besides itself 
			 * within i and num, with a remainder of 0
			 * then num is not a prime number
			 * prime would then be false
			 */
				break; // break the code and move to print
			}
		}
		if(prime) {
			System.out.println(num+" is a prime number");
		}else {
			System.out.println(num+" is not a prime number");
		}
		
	}

}
