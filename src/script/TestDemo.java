package script;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Utility;
import page.LoginPage;

public class TestDemo extends BaseTest{
	@Test
	 public void testA() throws Exception {
		String data = Utility.getXLData(INPUT_PATH, "sheet1",0,0);
		Reporter.log("Data:"+data,true);
		 
		int r = Utility.getXLRowCount(INPUT_PATH, "sheet1");
		Reporter.log("Row:"+r,true);
		
		Assert.fail();
//		String p=Utility.getPhoto(driver,PHOTO_PATH);
//		Reporter.log("Photo:"+p,true);
		LoginPage lp=new LoginPage(driver);
		lp.setUserName("admin");
		lp.setPassword("manager");
		lp.clickLogin();
		Thread.sleep(1000);
	 }

}
