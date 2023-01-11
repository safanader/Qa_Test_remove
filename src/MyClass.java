import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MyClass {

	public static void main(String[] args) {
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("http://127.0.0.1:5500/index.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.manage().window().maximize();
		
		List<WebElement> myList =driver.findElements(By.tagName("option"));
		for(int i=3;i<myList.size();i=i+=4) {
				 myList.get(i).click();
				driver.findElement(By.xpath("//*[@id=\"remove\"]")).click();
		
			}	
					
		 }}
			
				
			
		
		
		
		
	


