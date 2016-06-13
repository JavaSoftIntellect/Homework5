import java.util.Scanner;

public class Main7 {

	static int fac(int a){
		if(a<2) return a;
		return a*fac(a-1);
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter number?");
		System.out.print(fac(in.nextInt()));
		in.close();
	}
}