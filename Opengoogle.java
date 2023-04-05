package functionalTest;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;


public class Opengoogle {

	public static void main(String[] args) {

		ExtentSparkReporter reporter = new ExtentSparkReporter("reports.html");
		ExtentReports reports = new ExtentReports();
		reports.attachReporter(reporter);
		ExtentTest test = reports.createTest("open google");


		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("what is selenium");
		search.submit();
		test.pass("Test case passed");

		reports.flush();

		driver.quit();
		
	}


}
