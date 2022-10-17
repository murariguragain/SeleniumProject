package newProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class WebElements {

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.get("http://automationpractice.com/index.php");
		
		//sendKeys		driver.findElement(By.id("search_query_top")).sendKeys("New Dress");
		
	//click
	driver.findElement(By.name("submit_search")).click();
	driver.findElement(By.cssSelector("i[class=\"icon-home\"]")).click();
		
	//getAttribute
		String ab = driver.findElement(By.cssSelector("input[name=\"search_query\"]")).getAttribute("class");	
		System.out.println(ab);
		
		
		//gettext
		String ab1 = driver.findElement(By.cssSelector("input[name=\"search_query\"]")).getText();
	System.out.println(ab1);
		
		String ab2 = driver.findElement(By.tagName("name=search_query\"]")).getTagName();
		System.out.println(ab2);
		
		String ab3 = driver.findElement(By.tagName("input")).getText();
		System.out.println(ab3);
		
		driver.manage().window().fullscreen();
		driver.manage().window().minimize();
		
		driver.manage().window().fullscreen();
		String	url =driver.getCurrentUrl();
		
		System.out.println(url);
		String title = driver.getTitle();
		System.out.println(title);
		driver.quit();
		
		driver.get("https://www.saucedemo.com/");
		//<input class="input_error form_input" placeholder="Username" type="text" data-test="username" id="user-name" name="user-name" autocorrect="off" autocapitalize="none" value="">
		// Element
		//Id
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		//name
		driver.findElement(By.name("user-name")).sendKeys("standard_user");
		 //tagname
		driver.findElement(By.tagName("input")).sendKeys("standard_user");
		//className
		driver.findElement(By.className("input_error")).sendKeys("standard_user");
		//cssSelector
		driver.findElement(By.cssSelector("#user-name")).sendKeys("standard_user");
		//xpath
		driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");
		//linkText
		driver.get("https://www.selenium.dev/documentation/webdriver/elements/locators/");
		driver.findElement(By.linkText("Overview")).click();
		driver.findElement(By.partialLinkText("Ovr")).click();
		driver.get("https://www.amazon.com/books-used-books-textbooks/b/?ie=UTF8&node=283155&ref_=nav_cs_books");
		driver.findElement(By.partialLinkText("Books")).click();
		driver.get("https://www.facebook.com/muraripguragain/videos");
		driver.findElement(By.className("x1lliihq x6ikm8r x10wlt62 x1n2onr6")).click();
	
	
	

	
	}

}
