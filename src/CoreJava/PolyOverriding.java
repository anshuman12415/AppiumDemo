package CoreJava;

public class PolyOverriding {

	public void add(int a, int b) {
		int z = a + b;
		System.out.println(z);
	}

	public void add(int a, int b, int c) {
		int z = a + b - c;
		System.out.println(z);
	}

}
