import java.util.Scanner;

public class TimeConverter {
	public static double convertToHours(int minutes)
	{
		return minutes/60.0;
	}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Time in MINS");
		int minutes=scan.nextInt();
		System.out.println(TimeConverter.convertToHours(minutes));
		scan.close();

	}

}
