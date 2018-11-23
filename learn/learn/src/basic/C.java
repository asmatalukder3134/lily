package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class C {
ChromeDriver dr;
C(ChromeDriver dr){
	this.dr=dr;
}
public void fbsignUp(String fname,String Lname,String email,String  passw) {
	dr.findElement(By.cssSelector("#u_0_c")).sendKeys(fname);
	dr.findElement(By.cssSelector("#u_0_e")).sendKeys(Lname);
	
	dr.findElement(By.cssSelector("#u_0_h")).sendKeys(email);
	dr.findElement(By.cssSelector("#u_0_o")).sendKeys(passw);
	
	
	
	
	
	
	
}






}
