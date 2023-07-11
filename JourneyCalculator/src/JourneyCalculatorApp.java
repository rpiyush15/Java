import java.util.Scanner;

public class JourneyCalculatorApp {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Speed");
		double speed=scan.nextDouble();
		System.out.println("Enter Time");
		double time=scan.nextDouble();
		JourneyCalculator journeyCalculator = new JourneyCalculator();
		System.out.printf("%.2f",journeyCalculator.calculateDistance(speed, time));
		scan.close();

	}
}
