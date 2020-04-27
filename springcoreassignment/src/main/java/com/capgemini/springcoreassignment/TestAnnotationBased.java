package com.capgemini.springcoreassignment;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.capgemini.springcoreassignment.bean.SpiceJet;
import com.capgemini.springcoreassignment.config.AppConfig;

public class TestAnnotationBased {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context	= new AnnotationConfigApplicationContext(AppConfig.class);
		SpiceJet spicejet=context.getBean(SpiceJet.class);
		spicejet.flyfaster();
		context.close();
		}
}
