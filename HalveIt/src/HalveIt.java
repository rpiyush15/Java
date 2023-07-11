import java.util.Scanner;

public class HalveIt {
	public static double halveTheNumber(double num)
	{
		return num/2;
	}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the amount");
		double num=scan.nextDouble();
		System.out.println(HalveIt.halveTheNumber(num));
		scan.close();

	}

}
