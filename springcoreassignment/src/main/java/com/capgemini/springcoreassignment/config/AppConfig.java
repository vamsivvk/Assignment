package com.capgemini.springcoreassignment.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.capgemini.springcoreassignment.bean.AirAsia;
import com.capgemini.springcoreassignment.bean.Indigo;
import com.capgemini.springcoreassignment.bean.SpiceJet;
@Configuration
public class AppConfig {
	@Bean
	public SpiceJet getSpicejet() {
		SpiceJet spicejet = new SpiceJet();
		spicejet.setName("vvk");
		return spicejet;
	}
	@Bean
	@Primary
		public AirAsia getAirasia() {
			AirAsia airasia = new AirAsia();
			return airasia;
		}
		@Bean
		public Indigo getIndigo() {
			Indigo indigo =  new Indigo();
			return indigo;
		}
}
