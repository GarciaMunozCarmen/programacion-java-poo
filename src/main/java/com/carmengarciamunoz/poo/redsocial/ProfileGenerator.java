package com.carmengarciamunoz.poo.redsocial;

public class ProfileGenerator {

	public static Profile testProfileGenerator(String userName) {
		return new Profile(userName, userName, "¡Hola a todos!", "Madrid");
	}
	
	public static Profile testProfilePostIncludedGenerator(String username, int postsNumber) {
		Profile p = testProfileGenerator(username);
		for (int i = 1; i <= postsNumber; i++) {
			p.newPost("Publicacion " + i);
		}
		return p;
	}
}
