import java.util.Scanner;

public class Main {

	public static int maxNumber(int a, int b){
		if(a>b){ 
			return a;
		}else{
			return b;
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Input a:");
		int a = in.nextInt();
		System.out.print("Input b:");
		int b = in.nextInt();
		System.out.print("Input c:");
		int c = in.nextInt();
		System.out.print(maxNumber(maxNumber(a,b),c));
		in.close();
	}
}

