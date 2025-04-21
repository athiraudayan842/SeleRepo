package testScript;

public class NavigationCommands extends Base {

	public static void main(String[] args) {
		NavigationCommands navigationcommands=new NavigationCommands();//creating object
		navigationcommands.browserIntialization();
		navigationcommands.navigationCommands();
		navigationcommands.driverQuitAndClose();//calling quit method,the quit method should be called last becuse if not called last it may close the window and the changes can't e seen
		
		

	}
public void navigationCommands() {
	driver.navigate().to("https://www.flipkart.com/");//used to navigate to an intended web page
	driver.navigate().back();//used to step back to the previous page
	driver.navigate().forward();//used to move to next web page
	driver.navigate().refresh();//used to refresh the current web page
}


}
