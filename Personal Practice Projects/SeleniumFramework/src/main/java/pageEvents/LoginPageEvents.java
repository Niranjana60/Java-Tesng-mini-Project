package pageEvents;

//import org.testng.Assert;

import pageObjects.LoginPageElements;
import utils.ElementFetch;

public class LoginPageEvents {
ElementFetch ele = new ElementFetch();
//public void verifyLoginPageIsLoaded()
//{
	//Assert.assertTrue(ele.getWebElements("XPath", LoginPageElements.LoginText).size()>0, "Element not found");
//}

public void enterCredentials() throws InterruptedException
{
	Thread.sleep(3000);
	ele.getWebElement("XPath",LoginPageElements.emailaddress).sendKeys("niranjana.radhakrishnan@hotmail.com");
	ele.getWebElement("XPath", LoginPageElements.password).sendKeys("Babylo@2025");
}
}
