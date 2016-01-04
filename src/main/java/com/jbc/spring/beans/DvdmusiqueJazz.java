package com.jbc.spring.beans;

import org.springframework.beans.factory.annotation.Value;

public class DvdmusiqueJazz implements IDvdmusique{


	private String donnee;
	
	@Value("${donnee1}")
	private String donnee1;

	
	public DvdmusiqueJazz( /* @Value("${donnee}")  */ String donnee ) {
		this.donnee = donnee ;
	}

	
	public void affiche () {
		
		System.out.println("je suis un DvdmusiqueJazz , donnee => " + donnee);
//		System.out.println("je suis un Dvdmusique , donnee1 => " + donnee1);
		
	}
	
	
}
