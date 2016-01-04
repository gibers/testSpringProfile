package com.jbc.spring.test1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;

import com.jbc.spring.beans.Dvdmusique;
import com.jbc.spring.beans.DvdmusiqueJazz;
import com.jbc.spring.beans.IDvdmusique;

public class CentraleTestJazz {

	
	@Qualifier("mondvdjazz")
	@Autowired(required=false)
	private IDvdmusique mondvd;
	
	
	public void affiche() {
		if(mondvd != null) {
			DvdmusiqueJazz mm = (DvdmusiqueJazz) mondvd;
			mm.affiche();
		} else {
			System.out.println("CentraleTestJazz : mondvd non activé ");
		}
	}
	
	
}

