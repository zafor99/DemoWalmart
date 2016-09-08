package practice.demo_project.framework.controller;

import practice.demo_project.framework.model.HomepageModel;

public class HomepageController {

	private HomepageModel  model = null;
	
	public HomepageController(){
		if(model== null){
			model = new HomepageModel();
		}
	}
	
	public void clicksignIn(){
		try {
			model.signInButton.click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
