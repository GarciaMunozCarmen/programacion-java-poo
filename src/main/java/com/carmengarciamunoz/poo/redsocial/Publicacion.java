package com.carmengarciamunoz.poo.redsocial;

import java.time.LocalTime;

public class Publicacion {
	
//	ATRIBUTOS
	private String text;
	private LocalTime dateTime;
	private int likes;
	
//	CONSTRUCTOR
	public Publicacion (String content) {
		this.text = content;
		this.dateTime = LocalTime.now();
		this.likes = 0;
	}

//	GETTERS Y SETTERS
	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public LocalTime getdateTime() {
		return dateTime;
	}

	public void setDateTime(LocalTime dateTime) {
		this.dateTime = dateTime;
	}

	public int getLikes() {
		return likes;
	}
	
//	MÉTODOS
	public void likePost() {
		likes++;
	}
	
	public void show() {
		System.out.printf("La publicación '%s' publicada %s tiene %d likes", text, dateTime, likes);
	}
	
}
