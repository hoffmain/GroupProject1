package GroupProject;

public class CodingTask4 {
	
	public static void main(String[] args) {
		
		//Develop a program to identify even/odd numbers in 2D Array
		
		int [][] num= {{71, 5, 98}, {32, 28, 7}, {2, 67, 42}};
		
		for(int i=0; i<num.length; i++) { //compares the num in the row
			for(int y=0; y<num[i].length; y++) { //compares the num in the columns
				if(num[i][y]%2==0) { 
					//checks if both row and columns are divisible by 2 w/ 0 remainder
					System.out.print(num[i][y]+" ");
				}
			}
		}
	}

}
