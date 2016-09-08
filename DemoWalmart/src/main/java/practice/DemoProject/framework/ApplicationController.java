package practice.DemoProject.framework;

import org.openqa.selenium.WebDriver;

import practice.demo_project.framework.controller.HomepageController;

public class ApplicationController {

	private HomepageController homepageController = null;
	
	public ApplicationController(){
		
	}
	
	public HomepageController homepage(){
		if(homepageController==null){
			homepageController = new HomepageController();
		}
		return homepageController;
	}
	
}
