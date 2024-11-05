package org.pom;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class login extends BaseClass {
	public login() {
		
		PageFactory.initElements(driver, this);
	}
@FindBy(id="email")
	
	private WebElement username;
	
public WebElement getUsername() {
	return username;
}
public WebElement getPassword() {
	return password;
}
public WebElement getLoginbutton() {
	return loginbutton;
}
@FindBys({@FindBy(id="pass")})
	private WebElement password;
@FindBys({@FindBy(xpath="//button[@name='login']")})
private WebElement loginbutton;
}
