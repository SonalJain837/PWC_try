package Test;
import org.testng.annotations.Test;

public class Day1 {
		
	@Test(groups={"Smoke"})
	public void firstTest()
	{
		System.out.println("Hello");
	}
	
	@Test
	public void secondTest()
	{
		System.out.println("Bye");
	}
}
