package com.exercise50jsfbeans.model;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="welcomeBean")
@SessionScoped
public class Welcome {
	
	@ManagedProperty(value="#{welcomeMessage}")
	public String welcomeMessage;

	public String getWelcomeMessage() {
		return welcomeMessage="Hola foxy";
	}

	public void setWelcomeMessage(String welcomeMessage) {
		this.welcomeMessage = welcomeMessage;
	}
	

}
