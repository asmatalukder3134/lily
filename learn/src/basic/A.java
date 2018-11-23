package basic;


import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class A {
	ChromeDriver dr;
    @Test	
	public void openBroser() {
		System.setProperty("webdriver.chrome.driver",
		"C:\\Users\\shapl\\Downloads\\chromedriver_win32\\chromedriver.exe");	
	    dr=new ChromeDriver();
	    dr.get("https://www.target.com/");
	
	}
  public void closeBrowser() {
	  
	  dr.quit();
	  
	  
  }
	
	
	
	
}
