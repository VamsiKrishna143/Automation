package script;

import org.testng.Reporter;
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Utility;
import page.HomePage;
import page.LoginPage;

public class TestLoginLogout extends BaseTest{
    @Test(priority=1,groups= {"login","smoke"})
	public void testLoginLogout() throws Exception {
		//Get test data from xl
		String Sheet="TestLoginLogout";
		String un=Utility.getXLData(INPUT_PATH, Sheet, 1, 0);
		String pw=Utility.getXLData(INPUT_PATH, Sheet, 1, 1);
		//Reporter.log(un,true);
		//Reporter.log(pw,true);
		System.out.println(un);
		System.out.println(pw);
		//Enter valid un,pw&click login		
		LoginPage loginpage=new LoginPage(driver);
		loginpage.setUserName("admin");
		loginpage.setPassword("manager");
		loginpage.clickLogin();
		//click logout
		Thread.sleep(2000);
		HomePage homepage=new HomePage(driver);
		homepage.clickLogout();
	}

}
