package com.jbc.spring.test2;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import com.jbc.spring.beans.Dvdmusique;
import com.jbc.spring.beans.DvdmusiqueJazz;
import com.jbc.spring.beans.IDvdmusique;
import com.jbc.spring.test1.CentraleTest;
import com.jbc.spring.test1.CentraleTestJazz;

@Configuration
//@PropertySource("file:C:\\dvp\\workspaces-sts\\spring-test1\\test1\\fichier.properties")
//@ComponentScan(basePackages={"com.jbc.spring.beans"})
public class SpringConfig {

	@Bean
	public
	static PropertySourcesPlaceholderConfigurer placeholderConfigurer() {
	  return new PropertySourcesPlaceholderConfigurer();
	}

	
	@Value("${donnee}")
	private String donnee;
	@Value("${donnee1}")
	private String donnee1;


	@Bean
	CentraleTest getCentr() {
		return new CentraleTest();
	}
	
	@Bean
	CentraleTestJazz getCentrjazz() {
		return new CentraleTestJazz();
	}

	@Bean
	@Profile("dev1")
	@Qualifier("mondvd")
	IDvdmusique getdvd() {
		return new Dvdmusique( donnee );
	}
	
	
	@Profile("dev2")
	@Bean
	@Qualifier("mondvdjazz")
	IDvdmusique getdvd2() {
		return new DvdmusiqueJazz( donnee );
	}

	
}


