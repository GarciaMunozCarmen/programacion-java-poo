package com.carmengarciamunoz.poo.redsocial;

public class PerfilRedSocial {
	
//	ATRIBUTOS
	private String userName;
	private String publicName;
	private String biography;
	private String city;
	private int followers;
	private int posts;
//	private enum profileStatus{
//		Able, Disabled, Blocked
//	}
	private boolean verified;

//	CONSTRUCTOR
	public PerfilRedSocial (String userName, String publicName, String biography, String city) {
		this.userName = userName;
		this.publicName = publicName;
		this.biography = biography;
		this.city = city;
		this.posts = 0;
		this.verified = false;
	}
	
// SETTERS Y GETTERS
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
	
//	MÉTODOS
	
}

