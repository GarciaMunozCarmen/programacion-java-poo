package com.carmengarciamunoz.poo.redsocial;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Publicacion {
	
	private static final String FORMAT_DATE_TIME = "dd-MM-yyyy / HH:mm:ss";
	
//	ATRIBUTOS
	private String text;
	private String dateTime;
	private int likes;
	
//	CONSTRUCTOR
	public Publicacion (String content) {
		this.text = content;
		this.dateTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern(FORMAT_DATE_TIME));
		this.likes = 0;
	}

//	GETTERS Y SETTERS
	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getdateTime() {
		return dateTime;
	}

	public void setDateTime(LocalDateTime dateTime) {
		this.dateTime = dateTime.format(DateTimeFormatter.ofPattern(FORMAT_DATE_TIME));
	}

	public int getLikes() {
		return likes;
	}
	
//	MÉTODOS
	public void likePost() {
		likes++;
	}
	
	public void show() {
		System.out.printf("La publicación '%s' publicada (%s) tiene %d likes\n", text, dateTime, likes);
	}
	
}
