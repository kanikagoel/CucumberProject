package steps;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.BeforeStep;

public class Hooks {

	/*@BeforeAll
	public static void before_all()
	{
		System.out.println("@BeforeAll-Create DB conn");
	}
	
	@AfterAll
	public static void after_all()
	{
		System.out.println("@AfterAll-Close DB conn");
	}
	*/
	@Before("@staging")
	public void setup()
	{
		System.out.println("Before hook - Launching browser");
	}
	
	@After("@staging")
	public void tearDown()
	{
		System.out.println("After hook - Quitting Browser");
	}
	
	/*@Before(order = 1)
	public void setup1()
	{
		System.out.println("Before hook - Launching browser");
	} 
	
	@After(order = 1)
	public void tearDown1()
	{
		System.out.println("After hook - Quit Browser");
	}*/
	
	/*
	@BeforeStep
	public void before_step() {
		System.out.println("@Before Step- adding a log");
	}
	
	@AfterStep
	public void after_step()
	{
		System.out.println("@After Step- deleting a log");
	}
	*/
}
