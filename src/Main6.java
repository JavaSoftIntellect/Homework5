package hw56;

import java.util.Scanner;

public class Main6 {
	static void num(String a){
		StringBuilder b=new StringBuilder();
		b.append(a);
		b=b.reverse();
		System.out.print(b);
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter numbers to revers!");
		num(in.nextLine());
		in.close();
	}
}