package bs_practical_test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutomationTest {

	public static void main(String[] args) throws InterruptedException{
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php");
		
		Thread.sleep(5000);

		driver.findElementByXPath("//a[@class=\"login\"]").click();
		driver.findElementByXPath("//input[@id=\"email_create\"]").sendKeys("mumu12@gmail.com");
		driver.findElementByXPath("//button[@id=\"SubmitCreate\"]").click();
		
		Thread.sleep(5000);
		
		driver.findElementByXPath("//label[@for=\"id_gender1\"]").click();
		driver.findElementByXPath("//input[@id=\"customer_firstname\"]").sendKeys("Zannat");
		driver.findElementByXPath("//input[@id=\"customer_lastname\"]").sendKeys("Mumu");
		driver.findElementByXPath("//input[@id=\"email\"]").click();
		driver.findElementByXPath("//input[@id=\"passwd\"]").sendKeys("123456");
		
		WebElement dateDown = driver.findElementByXPath("//select[@name=\"days\"]");;
		Select dateSelect= new Select(dateDown);
		dateSelect.selectByValue("10");
		
		WebElement monthDown = driver.findElementByXPath("//select[@name=\"months\"]");;
		Select monthSelect= new Select(monthDown);
		monthSelect.selectByValue("8");
		
		WebElement yearDown = driver.findElementByXPath("//select[@name=\"years\"]");;
		Select yearSelect= new Select(yearDown);
		yearSelect.selectByValue("1985");
		
		driver.findElementByXPath("//input[@name=\"newsletter\"]").click();
		
		Thread.sleep(5000);

		driver.findElementByXPath("//input[@id=\"firstname\"]").click();
		driver.findElementByXPath("//input[@id=\"lastname\"]").click();
		driver.findElementByXPath("//input[@id=\"company\"]").sendKeys("N/A");
		driver.findElementByXPath("//input[@name=\"address1\"]").sendKeys("Naogaon");
		driver.findElementByXPath("//input[@name=\"address2\"]").sendKeys("Naogaon");
		driver.findElementByXPath("//input[@name=\"city\"]").sendKeys("Naogaon");

		WebElement stateDown = driver.findElementByXPath("//select[@name=\"id_state\"]");;
		Select stateSelect= new Select(stateDown);
		stateSelect.selectByValue("3");
		
		driver.findElementByXPath("//input[@name=\"postcode\"]").sendKeys("12010");
		driver.findElementByXPath("//textarea[@name=\"other\"]").sendKeys("N/A");
		driver.findElementByXPath("//input[@name=\"phone\"]").sendKeys("01125665684");
		driver.findElementByXPath("//input[@name=\"phone_mobile\"]").sendKeys("01125665684");
		driver.findElementByXPath("//input[@name=\"alias\"]").sendKeys(": Naogaon");
		
		Thread.sleep(5000);

		driver.findElementByXPath("//button[@name=\"submitAccount\"]").click();

		Thread.sleep(10000);
		
		driver.findElementByXPath("//a[@class=\"logout\"]").click();
		
		Thread.sleep(5000);
		
		
		Thread.sleep(5000);

		driver.findElementByXPath("//a[@class=\"login\"]").click();
		driver.findElementByXPath("//input[@id=\"email_create\"]").sendKeys("mumu22@gmail.com");
		driver.findElementByXPath("//button[@id=\"SubmitCreate\"]").click();
		
		Thread.sleep(5000);
		
		driver.findElementByXPath("//label[@for=\"id_gender1\"]").click();
		driver.findElementByXPath("//input[@id=\"customer_firstname\"]").sendKeys("Zannat");
		driver.findElementByXPath("//input[@id=\"customer_lastname\"]").sendKeys("Mumu");
		driver.findElementByXPath("//input[@id=\"email\"]").click();
		driver.findElementByXPath("//input[@id=\"passwd\"]").sendKeys("123456");
		
		WebElement dateDown2 = driver.findElementByXPath("//select[@name=\"days\"]");;
		Select dateSelect2= new Select(dateDown2);
		dateSelect2.selectByValue("10");
		
		WebElement monthDown2 = driver.findElementByXPath("//select[@name=\"months\"]");;
		Select monthSelect2= new Select(monthDown2);
		monthSelect2.selectByValue("8");
		
		WebElement yearDown2 = driver.findElementByXPath("//select[@name=\"years\"]");;
		Select yearSelect2= new Select(yearDown2);
		yearSelect2.selectByValue("1985");
		
		driver.findElementByXPath("//input[@name=\"newsletter\"]").click();
		
		Thread.sleep(5000);

		driver.findElementByXPath("//input[@id=\"firstname\"]").click();
		driver.findElementByXPath("//input[@id=\"lastname\"]").click();
		driver.findElementByXPath("//input[@id=\"company\"]").sendKeys("N/A");
		driver.findElementByXPath("//input[@name=\"address1\"]").sendKeys("Naogaon");
		driver.findElementByXPath("//input[@name=\"address2\"]").sendKeys("Naogaon");
		driver.findElementByXPath("//input[@name=\"city\"]").sendKeys("Naogaon");

		WebElement stateDown2 = driver.findElementByXPath("//select[@name=\"id_state\"]");;
		Select stateSelect2= new Select(stateDown2);
		stateSelect2.selectByValue("3");
		
		driver.findElementByXPath("//input[@name=\"postcode\"]").sendKeys("12010");
		driver.findElementByXPath("//textarea[@name=\"other\"]").sendKeys("N/A");
		driver.findElementByXPath("//input[@name=\"phone\"]").sendKeys("01125665684");
		driver.findElementByXPath("//input[@name=\"phone_mobile\"]").sendKeys("01125665684");
		driver.findElementByXPath("//input[@name=\"alias\"]").sendKeys(": Naogaon");
		
		Thread.sleep(5000);

		driver.findElementByXPath("//button[@name=\"submitAccount\"]").click();

		Thread.sleep(10000);
		
		driver.findElementByXPath("//a[@class=\"logout\"]").click();
		
		Thread.sleep(5000);
		
		driver.findElementByXPath("//a[@class=\"login\"]").click();
		driver.findElementByXPath("//input[@id='email']").sendKeys("mumu20@gmail.com");
		driver.findElementByXPath("//input[@id=\"passwd\"]").sendKeys("123456");
		driver.findElementByXPath("//button[@id=\"SubmitLogin\"]").click();
		Thread.sleep(5000);
		
		driver.findElementByXPath("//*[@id=\"block_top_menu\"]/ul/li[2]/a").click();
		driver.findElementByXPath("//a[@data-id-product=\"3\"]").click();
		driver.findElementByXPath("//a[@data-id-product=\"4\"]").click();
		Thread.sleep(5000);
		driver.navigate().refresh();

		driver.findElementByXPath("//*[@id=\"header\"]/div[3]/div/div/div[3]/div/a").click();
		driver.findElementByXPath("//*[@id=\"center_column\"]/p[2]/a[1]").click();
		driver.findElementByXPath("//*[@id=\"center_column\"]/form/p/button").click();
		driver.findElementByXPath("//*[@id=\"cgv\"]").click();

		driver.findElementByXPath("//*[@id=\"form\"]/p/button").click();
		driver.findElementByXPath("//*[@id=\"HOOK_PAYMENT\"]/div[1]/div/p/a").click();
		driver.findElementByXPath("//*[@id=\"cart_navigation\"]/button").click();
		driver.findElementByXPath("//*[@id=\"center_column\"]/p/a").click();

		Thread.sleep(5000);

		driver.findElementByXPath("//a[@class=\"logout\"]").click();
		
		Thread.sleep(5000);
		

		driver.close();
		
			
	}

}
