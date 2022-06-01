package GroupProject;

import java.util.Scanner;

public class CodingTask1 {
	
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		int[] num=new int[5]; //indicate the number of index
		int sum=0; //initialize sum
		
		System.out.println("Enter 5 numbers");
		for(int i=0; i<num.length; i++) {
			num[i]=input.nextInt();
			sum+=num[i]; //will take each num from loop and will add to the next
		}
		System.out.println("The sum of all the numbers are "+sum);
	}

}
