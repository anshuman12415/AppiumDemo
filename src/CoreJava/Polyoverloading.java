package CoreJava;

public class Polyoverloading {
	
	public void add(int a, int b) {
		int z=a+b;
		System.out.println(z);
	}
	public void add (int a, int b, int c) {
		int z= a+b+c;
		System.out.println(z);
	}
	public static void main(String[] args) {
		Polyoverloading pol= new Polyoverloading();
		pol.add(10, 20);
		pol.add(11, 12, 13);
	}
}
