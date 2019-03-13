package shangcheng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class fabugg {
WebDriver driver;
	
	@BeforeClass(groups="selenium-test")
	public void gg() {
		
		String urll="http://localhost:8080/shop1/login1?op=modify";
		System.setProperty("webdriver.chrome.driver", ".//tools1//chromedriver.exe");
		
	    driver=new ChromeDriver();
		driver.get(urll);
	}
	@Test
	public void houtai() throws InterruptedException {
		driver.findElement(By.xpath("/html/body/center[6]/table/tbody/tr/td/a")).click();
		driver.findElement(By.name("a_name")).sendKeys("admin");
		driver.findElement(By.name("a_pass")).sendKeys("admin");
		driver.findElement(By.xpath("/html/body/center/table/tbody/tr[2]/td/form/table/tbody/tr[4]/td[2]/div/input[1]")).click();
		driver.switchTo().frame(0);
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("/html/body/table/tbody/tr[16]/td/span/a")).click();
		driver.switchTo().parentFrame();
		driver.switchTo().frame(1);
		driver.findElement(By.name("n_message")).sendKeys("È«³¡6ÕÛ");
		driver.findElement(By.xpath("/html/body/center/form/table/tbody/tr[5]/td/input[1]")).click();
		
	}
}
