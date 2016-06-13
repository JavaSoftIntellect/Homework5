public class Main5 {

	static void symet(int a) {
		if (a / 100 == 0) {
			if (a / 10 == a % 10) {
				System.out.println(a);
			}
		} else {
			if (a / 100 == (a % 100 % 10))
				System.out.println(a);
		}
	}

	public static void main(String[] args) {
		for (int i = 10; i < 1000; i++) {
			symet(i);
		}

	}

}