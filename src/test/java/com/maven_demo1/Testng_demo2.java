package com.maven_demo1;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testng_demo2 {

	@BeforeMethod 
public void beforeM(){System.out.println("i m in beforem");
	
}

@org.testng.annotations.AfterMethod
public void AfterMethod(){System.out.println("i m in aftermethod");
	
}

	@Test(priority=-1)
	public void facebook(){ System.out.println(" i m using facebook");
		
	}
	
	@Test(priority=2)
public void gmail(){System.out.println(" i m using gmail");
		
	}
	
	@Test ()
public void Google(){System.out.println(" i m using google");
		
	}
	
	@BeforeTest
public void launch_browser(){System.out.println(" launch browser");
		
	}
	
	@AfterTest 
public void close_browser(){System.out.println(" close browser ");
		
	}
	
	
}
