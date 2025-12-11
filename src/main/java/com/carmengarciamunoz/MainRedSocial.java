package com.carmengarciamunoz;

import java.util.ArrayList;
import java.util.List;

import com.carmengarciamunoz.poo.redsocial.GeneradorPerfiles;
import com.carmengarciamunoz.poo.redsocial.PerfilRedSocial;

public class MainRedSocial {

	public static void main(String[] args) {
		PerfilRedSocial p1 = GeneradorPerfiles.testProfilePostIncludedGenerator("Carmen", 4);
		PerfilRedSocial p2 = GeneradorPerfiles.testProfileGenerator("Pepe");
		PerfilRedSocial p3 = GeneradorPerfiles.testProfilePostIncludedGenerator("Asier", 2);
		
		List<PerfilRedSocial> listUsers = new ArrayList<PerfilRedSocial>();
		listUsers.add(p1);
		listUsers.add(p2);
		listUsers.add(p3);
		
		for (int i = 0; i < listUsers.size(); i++) {
			listUsers.get(i).show();
			listUsers.get(i).showPosts();
		}
		
		p2.addFollowers(40);
		p2.newPost("En la playa!");
		p2.show();
		p2.showPosts();
	}

}
