package practice.demo_project.framework.model;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import practice.DemoProject.framework.Scriptbase;

public class HomepageModel {
	protected WebDriver driver;
	public HomepageModel(){
		this.driver = Scriptbase.driver;
		PageFactory.initElements(this.driver, this);
	}
	
	@FindBy(xpath="//button[@data-tl-id ='header-GlobalAccountFlyout-link']")
	public WebElement signInButton;
	
	
}
