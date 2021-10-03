package CoreJava;


public class JavaDemo2Inherit extends JavaDemo2 {
	
	public void method2() {
		System.out.println("rhul is my brother");
	}
	public static void main(String[] args) {
		
		JavaDemo2Inherit JD= new JavaDemo2Inherit();
		JD.method2();
		JD.method1();
	}

}
