package com.carmengarciamunoz.poo.redsocial;

import java.util.ArrayList;
import java.util.List;

public class Profile {
	
//	ATRIBUTOS
	private String userName;
	private String publicName;
	private String biography;
	private String city;
	private int followers;
	private int posts;
	private ProfileStatus status;
	private boolean verified;
	private List<Post> postList;

//	CONSTRUCTOR
	public Profile(String userName, String publicName, String biography, String city) {
		this.userName = userName;
		this.publicName = publicName;
		this.biography = biography;
		this.city = city;
		this.followers = 0;
		this.posts = 0;
		this.status = ProfileStatus.ACTIVE;
		this.verified = false;
		this.postList = new ArrayList<>();
	}
	
//	SETTERS Y GETTERS
//	no sé si quitar algunos
	
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPublicName() {
		return publicName;
	}

	public void setPublicName(String publicName) {
		this.publicName = publicName;
	}

	public String getBiography() {
		return biography;
	}

	public void setBiography(String biography) {
		this.biography = biography;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getFollowers() {
		return followers;
	}

	public void setFollowers(int followers) {
		this.followers = followers;
	}

	public int getPosts() {
		return posts;
	}

	public void setPosts(int posts) {
		this.posts = posts;
	}

	public boolean isVerified() {
		return verified;
	}

	public void setVerified(boolean verified) {
		this.verified = verified;
	}

	public ProfileStatus getStatus() {
		return status;
	}

	
//	MÉTODOS
	public void show () {
		System.out.printf("El perfil de usuario <%s (@%s) - '%s'> de %s tiene %d seguidores, %d publicaciones, está %s y %s\n", publicName, userName, biography, city, followers, posts, status.name(), verified? "verificado":"no verificado");
	}
	
	public void addFollowers (int numberToAdd) {
		this.followers += numberToAdd;
	}
	
	public void deactivate () {
		this.status = ProfileStatus.DISABLED;
	}
	
	public void block() {
		this.status = ProfileStatus.BLOCKED;
	}
	

	public boolean isActive() {
		return this.status == ProfileStatus.ACTIVE;
	}
	
	public void newPost (String content) {
		this.postList.add(new Post(content));
		this.posts ++;
	}
	
	public void showPosts() {
		this.postList.forEach(p -> p.show());
	}
}

