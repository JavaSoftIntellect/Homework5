public class Main4 {
	static void numbers(int a) {
		System.out.print(a + " is ");
		if (a%2==0) System.out.println("even");
		else System.out.println("odd");
	}

	public static void main(String[] args) {
		numbers(7);
		numbers(9);
		numbers(2);
		numbers(-222);
		numbers(-14);
		}
}