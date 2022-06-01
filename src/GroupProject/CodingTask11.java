package GroupProject;

public class CodingTask11 {

	public static void main(String[] args) {
		
		//Find duplicate elements from Array of Strings
		
		String[] iceCream= {"Vanilla", "Mint", "Rocky Road", "Chocolate", "Rocky Road", "Mint"};
		//create array to store strings
		String[] dupe=new String[iceCream.length];
		int index=1; //variable index
		int dupeIdx=0; //index of duplicate variable
		
		for(String flavors:iceCream) { //store all string variables of the array
			
			for(int i=index; i<iceCream.length; i++) { //will compare the next variables in array 
				if(flavors.equals(iceCream[i])) { //flavors to be compared in array
					
					for(int y=0; y<=dupeIdx; y++) { //determines the flavor to compare
						if(flavors.equals(dupe[y])) { //checks if dupe matches flavors
							break;
						}else {
							dupe[dupeIdx]=flavors; //the dupe name and index checking for duplication
							dupeIdx++; //adds 1 to the index to compare flavor
							break;
						}
					}
				}
			}index++; // moves through the index by 1
		}
		for(int j=0; j<dupeIdx; j++) {
			System.out.println(dupe[j]); //finds all the duplicates and prints flavor
		}
	}
}
