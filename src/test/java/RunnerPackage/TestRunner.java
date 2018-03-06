package RunnerPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import io.github.bonigarcia.wdm.WebDriverManager;

@CucumberOptions(features={"features"},glue={"StepDefinitionPackage"})
public class TestRunner extends AbstractTestNGCucumberTests{

public static WebDriver driver;

@BeforeMethod 
	public void SetUp(){
		
	WebDriverManager.chromedriver().setup();
	driver= new ChromeDriver();
	}

/*
@AfterMethod
public void close(){
	driver.close();
}
*/

}
