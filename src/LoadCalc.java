import java.util.*;

public class LoadCalc {

    //prompts user for the unit of weight they will enter
    public static String getUnit() {
        for(int i=0;i<100;i++) {
			System.out.println();
		}
        System.out.println("What unit are you entering?");
        System.out.println("Enter 1 for pounds.");
        System.out.println("Enter 2 for kilos.");
        Scanner userInput = new Scanner(System.in);
		int input = userInput.nextInt();
		if(input == 1) {
            return "pounds";
        }
        else {
            return "kilos";
        }
    }

    //promts user for weight
    public static double getWeight() {
        for(int i=0;i<100;i++) {
			System.out.println();
		}
        System.out.println("Enter the weight: ");
        Scanner userInput = new Scanner(System.in);
		double input = userInput.nextDouble();
		return input;
    }

    //edits a stack param to be as close as possible to desired weight
    public static void calculateLoad(double num, String unit, Stack bar) {
        double weight = num;
        if(unit.equals("pounds")) {
            weight *= 0.453592;
        }

        //truncate weight to divisisble by 2.5 kg. so it is loadable on the bar
        //minus 20 for bar and divided by 2 since only loading one side of bar
        weight = (weight - (20 + (weight%2.5)))/2;
        while(weight > 0) {
            if(weight-25 >= 0) {
                bar.addPlate(25.0);
                weight -= 25;
            }
            else if(weight-20 >= 0) {
                bar.addPlate(20.0);
                weight -= 25;
            }
            else if(weight-15 >= 0) {
                bar.addPlate(15.0);
                weight -= 15;
            }
            else if(weight-10 >= 0) {
                bar.addPlate(10.0);
                weight -= 10;
            }
            else if(weight-5 >= 0) {
                bar.addPlate(5.0);
                weight -= 5;
            }
            else if(weight-2.5 >= 0) {
                bar.addPlate(2.5);
                weight -= 2.5;
            }
            else if(weight-1.25 >= 0) {
                bar.addPlate(1.25);
                weight -= 1.25;
            }
        } 
   }

}