package a1qaProject1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RunPage {

	public static void main(String[] args) throws InterruptedException {
		
			WebDriver driver=new ChromeDriver();
			WebDriverManager.chromedriver().setup();
			driver.get("https://userinyerface.com/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[contains(text(),'HERE')]")).click();
			driver.findElement(By.cssSelector("a.help-form__help-button")).click();
			Thread.sleep(2000);
			driver.close();

	}

}
