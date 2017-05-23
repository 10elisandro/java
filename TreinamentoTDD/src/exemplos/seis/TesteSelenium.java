package exemplos.seis;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteSelenium {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/usr/bin/google-chrome");
		
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com.br");
		
		WebElement caixa = driver.findElement(By.name("q"));
		
		caixa.sendKeys("Jorge e Matheus");
		caixa.submit();
	}

}
