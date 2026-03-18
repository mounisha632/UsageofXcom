package handlingdropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UsageOfXcom {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://x.com/");
		driver.findElement(By.xpath("//span[text()='Create account']")).click();
		driver.findElement(By.name("name")).sendKeys("Mounisha"+Keys.ENTER);
		driver.findElement(By.name("email")).sendKeys("mounisha078@gmail.com"+Keys.ENTER);
		WebElement month = driver.findElement(By.id("SELECTOR_1"));
		Select s=new Select(month);
		s.selectByValue("5");
		WebElement day = driver.findElement(By.id("SELECTOR_2"));
		Select s1=new Select(day);
		s1.selectByValue("10");
		WebElement year = driver.findElement(By.id("SELECTOR_3"));
		Select s2=new Select(year);
		s2.selectByValue("2015");
		driver.findElement(By.xpath("//button[@type='button']"));
		driver.quit();
	}

}
