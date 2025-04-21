package testScript;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Base {

	public static void main(String[] args) {
		Base base=new Base();
		base.browserIntialization();
	}
	public WebDriver driver;//global initialization of driver
	
public void browserIntialization()//method used for initialise browser
{
          driver=new ChromeDriver();//browser initialise step ,driver   assigned  or intialized to driver reference variable
        
         //WebDriver driver=new EdgeDriver();
         driver.get("https://selenium.qabible.in/");//used to launch url
         driver.manage().window().maximize();//used to maximize the windows
        
}
   public void driverQuitAndClose()
   {
	   driver.quit();//used to close all the open windows
       //driver.close();used to close the parent window 
   }
         
}



