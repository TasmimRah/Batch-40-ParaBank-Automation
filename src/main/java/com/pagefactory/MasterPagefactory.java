package com.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MasterPagefactory {
 public MasterPagefactory (WebDriver driver) {
	 PageFactory.initElements(driver, this);
 }
 public WebElement getUsername() {
	return username;
}

public WebElement getPassword() {
	return password;
}

public WebElement getLogin() {
	return login;
}

public WebElement getLogout() {
	return logout;
}
@FindBy(xpath ="//*[@name='username']")
 private WebElement username;
 
 @FindBy(xpath ="//*[@name='password']")
 private WebElement password;
 
 @FindBy(xpath ="//*[@value='Log In']")
 private WebElement login;
 
 @FindBy(xpath ="//*[text()='Log Out']")
 private WebElement logout;
 
 @FindBy(xpath ="//*[@class='error']")
 private WebElement errormessage;

public WebElement getErrormessage() {
	return errormessage;
}
 
 
 
 
}
