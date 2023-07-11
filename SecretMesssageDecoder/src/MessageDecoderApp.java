import java.util.Scanner;

public class MessageDecoderApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a Character");
		char ch=scan.next().charAt(0);
		MessageDecoder decoder = new MessageDecoder();
		System.out.println(decoder.decodeCharacter(ch));
		scan.close();
		
		
	}

}
