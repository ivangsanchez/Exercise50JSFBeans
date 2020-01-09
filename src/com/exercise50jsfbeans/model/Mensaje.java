package com.exercise50jsfbeans.model;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;


//Se añaden las anotaciones para decirle que es un BEAN
@ManagedBean(name="mimensajitu1")
@RequestScoped
public class Mensaje {
	public String diHola() {
		return "Hola Mundito";
	}
	
	public String mensajeTuneado(String nombre) {
		return "Hola "+nombre+", te pones bien cachondis";
	}
	
	public String  suma(int numero1,int numero2) {
		
		int respint=numero1+numero2;
		String respstring= Integer.toString(respint);
		return respstring;
	}
}

