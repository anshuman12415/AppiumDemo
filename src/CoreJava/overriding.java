package CoreJava;

public class overriding extends PolyOverriding {
	public void add(int a, int b) {
		int z = a - b;
		System.out.println(z);
	}

	public static void main(String[] args) {
		overriding a = new overriding();
		a.add(20, 10);
	}

}
