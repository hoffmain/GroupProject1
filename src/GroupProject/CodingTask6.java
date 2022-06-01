package GroupProject;

public class CodingTask6 {
	
	public static void main(String[] args) {
		
		//Write a program to swap 2 numbers without a temporary variable
		
		int[][] nums= {{45, 84, 7}, {31, 5, 90}};
		//Print the rows of numbers
		for(int[]num:nums) {//assign array to variable
			for(int n:num) {
				System.out.print(n+" ");
			}System.out.println();
		}
		//Swap 2 numbers
		nums[0][0]=nums[0][0]+nums[1][0];
		nums[1][0]=nums[0][0]-nums[1][0];
		nums[0][0]=nums[0][0]-nums[1][0];
		
		for(int[]num:nums) {
			for(int n:num) {
				System.out.print(n+" ");
			}System.out.println();
		}
		
	}

}
