package testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CssSelector extends Base {

	public static void main(String[] args) {
		

	}
public void tagAndId()
{
	WebElement tagandid=driver.findElement(By.cssSelector("input#single-input-field"));
	WebElement tagandid2=driver.findElement(By.cssSelector("input#value-a"));
	WebElement tagandid3=driver.findElement(By.cssSelector("input#value-b"));
	WebElement tagandid4=driver.findElement(By.cssSelector("button#button-one"));
	WebElement tagandid5=driver.findElement(By.cssSelector("button#button-two"));
}		
	

public void tagAndClass()
{
	WebElement tagandclass=driver.findElement(By.cssSelector("div.mb-sec"));
    WebElement tagandclass1=driver.findElement(By.cssSelector("footer.mt-5"));
    WebElement tagandclass2=driver.findElement(By.cssSelector("textarea.form-control"));
    WebElement tagandclass3=driver.findElement(By.cssSelector("input.form-control"));
    WebElement tagandclass4=driver.findElement(By.cssSelector("form.needs-validation"));
    
}
public void tagAndAttribute()
{
WebElement tagandattribute=driver.findElement(By.cssSelector("div[class='header-top']"));	
WebElement tagandattribute2=driver.findElement(By.cssSelector("button[id='button-one']"));
WebElement tagandattribute3=driver.findElement(By.cssSelector("input[id='single-input-field']"));
WebElement tagandattribute4=driver.findElement(By.cssSelector("button[id='button-one']"));
WebElement tagandattribute5=driver.findElement(By.cssSelector("input[id='value-a']"));
}

public void tagClassAndAttribute()
{
	WebElement tagandattribute=driver.findElement(By.cssSelector("input.form-control[id='value-a']"));
	WebElement tagandattribute2=driver.findElement(By.cssSelector("input.form-control[id='value-b']"));
	WebElement tagandattribute3=driver.findElement(By.cssSelector("input.form-control[id='single-input-field']"));
    WebElement tagandattribute4=driver.findElement(By.cssSelector("input.form-control[id='single-input-field2']"));
    WebElement tagandattribute5=driver.findElement(By.cssSelector("div.my-2[id='message-one']"));
}
}

//1.Tag and ID(tag#id)
		//2.Tag and class(tag.class)
		//3.Tag and Attribute(tag[attribute=value]
		//4.Tag,class,and Attribute(tag.classname[attribute=value]
