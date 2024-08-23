package selenium_practice.selenium_test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day5 {
	
		@Parameters({"URL","numbers"})
		@Test
		
		public void demo3(String urlname,String numsrs)
		{
			System.out.println("nice: 1st element of class 3");
			System.out.println(urlname);
			System.out.println(numsrs);
			
		}
	}


