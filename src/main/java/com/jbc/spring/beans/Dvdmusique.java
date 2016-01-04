package com.jbc.spring.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


//@Component
public class Dvdmusique implements IDvdmusique {
	
	private String donnee;
	
	@Value("${donnee1}")
	private String donnee1;

	
	public Dvdmusique( /* @Value("${donnee}")  */ String donnee ) {
		this.donnee = donnee ;
	}

	
	public void affiche () {
		
		System.out.println("je suis un Dvdmusique , donnee => " + donnee);
//		System.out.println("je suis un Dvdmusique , donnee1 => " + donnee1);
		
	}
	
}


