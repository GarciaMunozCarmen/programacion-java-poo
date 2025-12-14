package com.carmengarciamunoz;

import java.util.ArrayList;
import java.util.List;

import com.carmengarciamunoz.poo.redsocial.ProfileGenerator;
import com.carmengarciamunoz.poo.redsocial.Profile;

public class MainRedSocial {

	public static void main(String[] args) {
		Profile p1 = ProfileGenerator.testProfilePostIncludedGenerator("Carmen", 4);
		Profile p2 = ProfileGenerator.testProfileGenerator("Pepe");
		Profile p3 = ProfileGenerator.testProfilePostIncludedGenerator("Asier", 2);
		
		List<Profile> listUsers = new ArrayList<Profile>();
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
