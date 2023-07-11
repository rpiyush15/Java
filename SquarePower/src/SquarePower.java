import java.util.Scanner;

public class SquarePower {
	public static int squareNumber(int num)
	{
		return num*num;
	}
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int num=scan.nextInt();
	System.out.println(squareNumber(num));
	scan.close();
}
}
