package testng1;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class Testngtest {

	@BeforeClass
	public void testfirst() {
		System.out.println("before class method");
	}

	@BeforeMethod
	public void init() {
		System.out.println("initialization");
	}

	@Test
	
	public void Sun() {
		System.out.println("1st time");
	}

	@Test
	public void Mon() {
		System.out.println("1st time");
	}

	@AfterTest
	public void testexe() {
		System.out.println("execution end");
	}

	@Test
	public void Tue() {
		System.out.println("1st time");
	}

	@Test
	public void Wed() {
		System.out.println("1st time");
	}

	@Test
	public void firsttest() {
		System.out.println("1st time");
	}

}
