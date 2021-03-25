import java.util.*;

public class Main {
	
	//gets user input using menu below and returns as "input"
	public static int getInput() {
		String menu = "Type a number then press enter...\n" +
				"-----------------------------------------------------\n" +
				"| 1: add 25kg.    | 2: add 20kg.    | 3: add 15kg.  |\n" +
				"-----------------------------------------------------\n" +
				"| 4: add 10kg.    | 5: add 5kg.     | 6: add 2.5kg. |\n" +
				"-----------------------------------------------------\n" +
				"| 7: add 1.25kg.  | 8: remove plate | 9: clear bar  |\n"+
				"-----------------------------------------------------\n" +
				"                  | 0: quit         |\n"+
				"                  -------------------\n";
		
		System.out.println(menu);
		Scanner userInput = new Scanner(System.in);
		int input = userInput.nextInt();
		return input;
	}
	
	//calls the correct function according to the input
	public static void useInput(int input, Stack bar) {
		if(input == 1) {
			bar.addPlate(25.0);
		}
		else if(input == 2) {
			bar.addPlate(20.0);
		}
		else if(input == 3) {
			bar.addPlate(15.0);
		}
		else if(input == 4) {
			bar.addPlate(10.0);
		}
		else if(input == 5) {
			bar.addPlate(5.0);
		}
		else if(input == 6) {
			bar.addPlate(2.5);
		}
		else if(input == 7) {
			bar.addPlate(1.25);
		}
		else if(input == 8) {
			bar.removePlate();
		}
		else if(input == 9) {
			bar.clearBar();
		}
	}
	

	public static void main(String[] args) {
		
		//initialize barbell
		Stack barTest = new Stack(20);

		//main loop
		while(true) {
			int input = getInput();
			for(int i=0;i<25;i++) {
				System.out.println();
			}
			useInput(input, barTest);
			if(input == 0) {
				break;
			}
			barTest.showBarInfo();
		}
		
		
	}

}
