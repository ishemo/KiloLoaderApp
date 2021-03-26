import java.util.*;

public class LoadCalc {

    //prompts user for a unit then returns it
    public static String getUnit() {
        System.out.println("Enter 1 for pounds or 2 for kilos");
        Scanner userInput = new Scanner(System.in);
		int input = userInput.nextInt();
		if(input == 1) {
            return "pounds";
        }
        else {
            return "kilos";
        }
    }

    public static double getWeight() {
        System.out.println("Enter the weight: ");
        Scanner userInput = new Scanner(System.in);
		double input = userInput.nextDouble();
		return input;
    }

    //edits a stack param to be as close as possible to num
    public static void calculateLoad(double num, String unit, Stack bar) {
        double weight = num;
        if(unit.equals("pounds")) {
            weight *= 0.453592;
        }

        //truncate weight to divisisble by 2.5 kg. so it is loadable on the bar
        //minus 20 for bar and divided by 2 since only loading one side of bar
        weight = (weight-(weight%2.5)-20)/2;
        while(weight - 25 >= 25 && weight - 25 > 20) {
            bar.addPlate(25.0);
            weight -= 25;
        }
        while(weight - 20 >= 20 && weight - 20 > 15) {
            bar.addPlate(20.0);
            weight -=25;
        }
        while(weight - 15 >= 15 && weight - 15 > 10) {
            bar.addPlate(15.0);
            weight -= 15;
        }
        while(weight - 10 >= 10 && weight - 10 > 5) {
            bar.addPlate(10.0);
            weight -= 10;
        }
        while(weight - 5 >= 5 && weight - 5 > 2.5) {
            bar.addPlate(5.0);
            weight -= 5;
        }
        while(weight - 2.5 >= 2.5 && weight - 2.5 > 1.25) {
            bar.addPlate(2.5);
            weight -= 2.5;
        }
        while(weight - 1.25 >= 1.25) {
            bar.addPlate(1.25);
            weight -= 1.25;
        }
   }


    public static void main(String[] args) {

    }
}
