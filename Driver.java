import java.util.Scanner;
public class Driver{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String input="";

		System.out.print("Enter a string ('-1' to quit)>");
		input = scan.nextLine();
		ChnageCase CC = new ChnageCase(input);
		while(!(input.equals("-1"))){

		System.out.println("To UpperCase: "+CC.toUpperCase());
		System.out.println("To toLowerCase: "+CC.toLowerCase());
		System.out.println("To toggleCase: "+CC.toggleCase());
		System.out.println("To toTitleCase: "+CC.toTitleCase());
		System.out.println("To toSentenceCase: "+CC.toSentenceCase());

		System.out.print("Enter a string ('-1' to quit)>");
		input = scan.nextLine();
		 CC = new ChnageCase(input);
		}
	}
}
