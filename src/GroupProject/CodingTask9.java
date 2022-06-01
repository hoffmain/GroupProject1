package GroupProject;

public class CodingTask9 {
	
	public static void main(String[] args) {
		
		//Find max and min in array
		
		int[] num= {15, 84, -9, -73, 92};
		int lrg=num[0];
		int sml=num[0];
		
		for(int nums:num) {
			if(nums>lrg) {
				lrg=nums;
			}if(nums<sml) {
				sml=nums;
			}
		}
		System.out.println(lrg+" is the largest number");
		System.out.println(sml+" is the smallest number");
		
		
		System.out.println("----------------");
		
		for(int i=1; i<num.length; i++) {
			if (num[i]> lrg) {
				sml=num[i];
			}if (num[i]<lrg) {
				sml=num[i];
			}
		}
		
	}

}
