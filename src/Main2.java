import java.util.Scanner;

public class Main2 {

	static void greet(String name) {
		System.out.print("Greetings, " + name + "!");
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter your name:");
		greet(in.nextLine());
		in.close();
	}
}
