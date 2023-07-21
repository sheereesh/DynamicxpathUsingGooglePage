package dynamicXpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicXpath {

	public static void main(String[] args) throws InterruptedException {
		 WebDriverManager.chromedriver().setup();
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("java");
		 
		 //driver.findElement(By.xpath("(//input[@class='gNO89b' ])[2]")).click();
		Thread.sleep(3000);
	List<WebElement> list=driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]//li"));
	System.out.println(list.size());
	for(WebElement element: list) {
	       System.out.println(element.getText());
	}
		
		 
		}
	}
 
