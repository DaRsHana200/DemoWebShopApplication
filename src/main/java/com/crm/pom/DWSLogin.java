package com.crm.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DWSLogin {
	
	public DWSLogin(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(className = "ico-login")
	public WebElement login_link;
	@FindBy(id="Email")
	public WebElement email;
	@FindBy(name="Password")
	public WebElement password;
	@FindBy(css = "input[id='RememberMe']")
	public WebElement remember_me;
	@FindBy(xpath = "//input[@value='Log in']")
	public WebElement login_button;

}
