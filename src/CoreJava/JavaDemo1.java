package CoreJava;

public class JavaDemo1 {
	public static void main(String[] args) {

		// to write table from 2 to 10;
		/*
		 * for (int i = 2; i <= 10; i++) { System.out.println(); for (int j = 1; j < 10;
		 * j++) { System.out.println("sop is " + i + "*" + j + "=" + i * j); }
		 * 
		 * }
		 */

		// play with string basic
		/*
		 * String a="anshuman", b="sandeep";
		 * System.out.println("length of a,b is "+a.length()+"and"+b.length());
		 * System.out.println("char of a,b by index is "+a.charAt(2)+"and"+b.charAt(3));
		 * System.out.println(a.equalsIgnoreCase(b)); System.out.println(a.equals(b));
		 */

		// Value of
		/*
		 * int i=10; String s=String.valueOf(i); System.out.println(s);
		 */

		// reverse the string and palindrome check
		/*
		 * String original="mom", reverse=""; int len=original.length(); for(int
		 * i=len-1;i>=0;i--) { reverse =reverse+original.charAt(i);
		 * 
		 * }System.out.println(reverse);
		 * 
		 * if(original.equals(reverse)) {
		 * System.out.println("given original string is palindrome");
		 * 
		 * }else { System.out.println("given original string is not palindrome"); }
		 */

		// Even no, odd,prime, factorials

		/*
		 * int a[]= {1,11,12,13,21,22,24,42}; for(int i=0;i<a.length;i++) {
		 * //if(a[i]%2==0) -->even no //if(a[i]%2!=0) -->odd no
		 * 
		 * {
		 * 
		 * System.out.println("odd no" +a[i]); }
		 */
     
		// Print 5 star tringle
		/*for (int i = 1; i <= 5; i++) {

			for (int j = 5; j >= i; j--) {
				System.out.print( "* ");
			}
			System.out.println();

		}*/
		
		//fibonacci series 0,1,1,2,3,5,8,13....
		int a=3;
		int b=4;
		int i;
		for(i=0;i<=20;i++) {
			System.out.print(b+" ");
			a=a+b;
			b=a-b;
		}
		
	
	}
}
