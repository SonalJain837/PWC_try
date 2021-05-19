package Test;

import org.testng.annotations.Test;

public class Day4 {

	@Test
	public void webLoginHomeloan()
	{
		System.out.println("WebLoginHome");
	}
	
	@Test(groups={"Smoke"})
	public void mobileLoginHomeloan()
	{
		System.out.println("MobileLoginHome");
	}
	
	@Test(groups={"Smoke"})
	public void loginAPIHomeloan()
	{
		System.out.println("APILoginHiome");
	}
}
