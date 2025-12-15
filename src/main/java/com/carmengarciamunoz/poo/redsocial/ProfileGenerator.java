package com.carmengarciamunoz.poo.redsocial;

import java.util.Locale;

import com.github.javafaker.Faker;

public class ProfileGenerator {
	public static Faker faker = new Faker(Locale.forLanguageTag("es"));

	public static Profile testProfileGenerator(String userName) {
		if(userName.equalsIgnoreCase("loquesea")){
			return new Profile(faker.name().username(), faker.name().fullName(), faker.lorem().sentence(), faker.address().cityName());
		}else {
			return new Profile(userName, userName, faker.lorem().sentence(), faker.address().cityName());
		}
	}
	
	public static Profile testProfilePostIncludedGenerator(String username, int postsNumber) {
		Profile p = testProfileGenerator(username);
		for (int i = 1; i <= postsNumber; i++) {
			p.newPost(faker.lorem().sentence());
		}
		return p;
	}
}
