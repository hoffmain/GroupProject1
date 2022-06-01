package GroupProject;

import java.util.Scanner;

public class CodingTask2 {
	
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter amount of countries");
		int size=input.nextInt(); //size will be inserted into the index
		input.nextLine();
		String capital=null;
		
		String[] countries=new String[size];
		
		for (int i=0; i<size; i++) {
			System.out.println("Enter the name of a country");
			String country=input.nextLine();
			countries[i]=country;
			break;
		}
		
		int y=0;
		while (y< countries.length) {
			
			switch (countries[y]) {
			
			case "USA":
				capital="Washington DC";
				break;
			
			case "Japan":
				capital="Tokyo";
				break;	
			
			case "Thailand":
				capital="Bangkok";
				break;
			
			case "South Korea":
				capital="Seoul";
				break;
				
			default:
				capital="Unknown";
			}
			System.out.println(capital+" is the capital of "+countries[y]);
			y++;
		}
		
	}

}
