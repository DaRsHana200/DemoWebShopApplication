package com.crm.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DWSRegister {
	
	public DWSRegister(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(id = "gender-female")
	public WebElement female;
  @FindBy(className = "ico-register")
  public WebElement register;
  @FindBy(id = "FirstName")
  public WebElement firstname;
  @FindBy(id = "LastName")
  public WebElement lastName;
  @FindBy(id = "Password")
  public WebElement password;
  @FindBy(name = "ConfirmPassword")
  public WebElement cpassword;
  @FindBy(id = "Email")
  public WebElement email;
  @FindBy(id = "register-button")
  public WebElement regbutton;
  
}
