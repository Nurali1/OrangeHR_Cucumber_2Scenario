Feature: This is to test OrangeHRM Website 



Scenario: As an Admin user for OrangeHRM, I should be able to log in to OrangeHRM and see the user log in information on the right side of the page.


	Given I navigate to Orange HRM page
	And I log in with admin credential
	Then I should be able to see my user info on the right side of the screen.
	
Scenario: As an Admin user for OrangeHRM, I should be able to log in to OrangeHRM and add a employee by going to PIM and click on employee list.


	Given I navigate to Orange HRM page
	And I log in with admin credential
	Then I should be able to see my user info on the right side of the screen.
	And I should be able to click on PIM and see 'Add Employee' text on the page
	And I should be able to fill up the information for my user
	Then I should see the new employee get created on the page with employee's detail displayed on the page