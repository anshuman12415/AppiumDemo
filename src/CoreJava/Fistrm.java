package CoreJava;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Fistrm {
	public static void main(String[] args) throws Exception {

		// create new file
		/*
		 * File f= new File("C:\\Users\\anshu\\OneDrive\\Desktop\\anshu.txt");
		 * System.out.println(f.exists()); f.createNewFile();
		 */

		// fos
		/*
		 * FileOutputStream fos = new
		 * FileOutputStream("C:\\Users\\anshu\\OneDrive\\Desktop\\anshuman.txt"); byte
		 * b[] = { 1, 2, 33, 11, 22, 13 };
		 * 
		 * fos.write(b); fos.write('s'); fos.write('1'); fos.flush(); fos.close();
		 */

		// fio
		FileInputStream fis = new FileInputStream("C:\\Users\\anshu\\OneDrive\\Desktop\\anshuman.txt");
		int i = fis.read();

		while (i != -1) {
			System.out.println((char) i);
			i = fis.read();
		}

	}

}
