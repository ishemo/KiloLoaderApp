import java.util.*;
public class Main extends LoadCalc {
	
	//very first input menu
	public static int calculateOrBuild() {
		for(int i=0;i<25;i++) {
			System.out.println();
		}
		System.out.println("Enter 1 to calculate the plates needed to load a weight");
		System.out.println("Enter 2 to build a custum plate scheme");
		System.out.println("Enter 3 to quit");
		Scanner userInput = new Scanner(System.in);
		int input = userInput.nextInt();
		return input;
	}

	//gets user input using menu below and returns as "input"
	//menu for building custom loading scheme
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
	
	//calls the correct function according to the input while building custom scheme
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

		while(true) {
			//build custom loading scheme or enter a value and see how to load it
			int wantToCalculate = calculateOrBuild();
			if(wantToCalculate == 1) {
				//initualize barbell
				Stack barTest = new Stack(20);
				String unit = getUnit();
				double weight = getWeight();
				calculateLoad(weight, unit, barTest);
				barTest.showBarInfo();
			}
			else if(wantToCalculate == 2){
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
			else if(wantToCalculate == 3){
				break;
			}

		}
		
	}

}
