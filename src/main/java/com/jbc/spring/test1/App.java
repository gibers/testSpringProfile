package com.jbc.spring.test1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jbc.spring.beans.Dvdmusique;
import com.jbc.spring.beans.DvdmusiqueJazz;
import com.jbc.spring.beans.IDvdmusique;
import com.jbc.spring.test2.SpringConfig;


/**
 * Hello world!
 *
 */
public class App {
	
    public static void main( String[] args ) {
    	
    	System.out.println(" arg => " + args[0]);
    	
		FileInputStream configFile;
		try {
			configFile = new FileInputStream(System.getProperty("properties.file"));
			System.getProperties().load(configFile);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
    	
		String test = System.getProperty("test");
		System.out.println("test => " + test);

		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

		CentraleTest cent = context.getBean(CentraleTest.class);
//		CentraleTest cent = new CentraleTest();
		cent.affiche();

		
		CentraleTestJazz cent1 = context.getBean(CentraleTestJazz.class);
//		CentraleTestJazz cent1 = new CentraleTestJazz();
		cent1.affiche();
		
		
		
//		Dvdmusique dvd1 = (Dvdmusique) context.getBean(IDvdmusique.class);
//		DvdmusiqueJazz dvd1 = (DvdmusiqueJazz) context.getBean(IDvdmusique.class);
		
		
		
    }
    
}
