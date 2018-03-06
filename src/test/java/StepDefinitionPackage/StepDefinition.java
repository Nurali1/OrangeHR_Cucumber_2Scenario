package StepDefinitionPackage;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import RunnerPackage.TestRunner;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import junit.framework.Assert;
import java.util.Random;

public class StepDefinition extends TestRunner {

	
	@Given("^I navigate to Orange HRM page$")
	public void i_navigate_to_Orange_HRM_page() throws Exception {
	   driver.get("http://opensource.demo.orangehrmlive.com/");
	    
	}

	@Given("^I log in with admin credential$")
	public void i_log_in_with_admin_credential() throws Exception {
	    WebElement oWebEdit=driver.findElement(By.name("txtUsername"));
	    oWebEdit.sendKeys("Admin");
	    WebElement oWebEdit1=driver.findElement(By.name("txtPassword"));
	    oWebEdit1.sendKeys("admin");
	    WebElement oWebButton=driver.findElement(By.id("btnLogin"));
	    oWebButton.click();
	
	}

	@Then("^I should be able to see my user info on the right side of the screen\\.$")
	public void i_should_be_able_to_see_my_user_info_on_the_right_side_of_the_screen() throws Exception {
		   WebElement oWebL=driver.findElement(By.xpath("//a[@id='welcome']"));
		   Assert.assertTrue(oWebL.getText().contains("Welcome Admin"));	   	  	 
	    
	}
	
	   
	@Then("^I should be able to click on PIM and see 'Add Employee' text on the page$")
	public void i_should_be_able_to_click_on_PIM_and_see_Add_Employee_text_on_the_page() {
		WebElement oWebL=driver.findElement(By.xpath("//b[contains(text(),'PIM')]"));
		oWebL.click();
		WebElement oWebL1=driver.findElement(By.id("menu_pim_addEmployee"));
		oWebL1.click();
	    
	   }

	@Then("^I should be able to fill up the information for my user$")
	public void i_should_be_able_to_fill_up_the_information_for_my_user() {
	     //enter user name 
		driver.findElement(By.id("firstName")).sendKeys("nurali");
		driver.findElement(By.id("lastName")).sendKeys("abliz");
		
		Random Ran=new Random();
		int Eid=Ran.nextInt(1000)+1;
	    driver.findElement(By.name("employeeId")).sendKeys("Eid");

		driver.findElement(By.id("btnSave")).click(); 
	   
	   }

	@Then("^I should see the new employee get created on the page with employee's detail displayed on the page$")
	public void i_should_see_the_new_employee_get_created_on_the_page_with_employee_s_detail_displayed_on_the_page(){
	  
	      //  
		WebElement webelement=driver.findElement(By.xpath("//DIV[contains(@id, 'pdMainContainer')]"));
		Assert.assertTrue(webelement.getText().contains("Personal Details"));
	   }


}
