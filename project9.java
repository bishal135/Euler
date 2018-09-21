package euler;

public class project9 {

	public static void main(String[] args) {
		System.out.println(new project9().run());
	}
	public int run() {
		for (int a = 1; a < 1000; a++) {
			for (int b = a + 1; b < 1000; b++) {
				int c = 1000 - a - b;
				if (a * a + b * b == c * c)  // Note: This implies b < c
					return (a * b * c);
			}
		}
		throw new AssertionError("Not found");
}
}
