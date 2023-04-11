package demo.q17;

public class Main {
	public static void main(String[] args) {
		String a = new String("Autoplant");
		String b = "Autoplant";

		if (a == b) {
			System.out.println("a==b");
		}
		if (a.equals(b)) {
			System.out.println("a equal b");
		}
	}
}

// Output : a equal b
