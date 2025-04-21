package testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Locators extends Base{

	public static void main(String[] args) {
		Locators locators=new Locators();
		locators.browserIntialization();
		locators.id();
		//locators.driverQuitAndClose();
	

	}
	public void id()
	{
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		//WebElement elementname=driver.findElement(By.locator("locator value"));//syntax for locating element."By" is class it contains 8 locators
		WebElement textfield=driver.findElement(By.id("single-input-field"));
		//textfield.sendKeys("athira");
		WebElement showmessagebutton=driver.findElement(By.id("button-one"));
		//showmessagebutton.click();
		WebElement textfield2=driver.findElement(By.id("value-a"));
		WebElement textfield3=driver.findElement(By.id("value-b"));
		WebElement gettotalbutton=driver.findElement(By.id("Get Total"));
	}
	public void className()
	{
		WebElement textfieldclass=driver.findElement(By.id("header-top"));
		WebElement textfield2class=driver.findElement(By.id("clearfix"));
		WebElement textfield3class=driver.findElement(By.id("container page"));
		WebElement textfield4class=driver.findElement(By.id("row"));
	}	
	public void name()
	{
		WebElement textfieldclass=driver.findElement(By.id("viewport"));
		WebElement textfield2class=driver.findElement(By.id("description"));
		WebElement textfield3class=driver.findElement(By.id("keywords"));
	}
				
	public void linktext()	
	{
		WebElement textfield=driver.findElement(By.id( "Ajax Form Submit"));
		WebElement textfield2=driver.findElement(By.id("Form Submit"));
		WebElement textfield3=driver.findElement(By.id("Jquery Select2"));
		
	}
	public void partialLinkText()
	{
		WebElement textfield=driver.findElement(By.id("Form Submi"));
		WebElement textfield1=driver.findElement(By.id("Ajax Form Submi"));		
	    WebElement textfield2=driver.findElement(By.id("Jquery Sele"));
	}
}
	


	
		
		
	




