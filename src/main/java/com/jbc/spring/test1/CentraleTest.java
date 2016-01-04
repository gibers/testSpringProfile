package com.jbc.spring.test1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.jbc.spring.beans.Dvdmusique;
import com.jbc.spring.beans.IDvdmusique;


public class CentraleTest {

	
	@Autowired(required=false)
	@Qualifier("mondvd")
	public IDvdmusique mondvd;
	

	public void affiche() {
		if(mondvd != null) {
			Dvdmusique mm = (Dvdmusique) mondvd;
			mm.affiche();
		} else { 
			System.out.println("CentraleTest : mondvd non activé ");
		}
	}
	
	
}

