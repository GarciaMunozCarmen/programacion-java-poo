package com.carmengarciamunoz.poo.redsocial;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Post {
	
	private static final String FORMAT_DATE_TIME = "dd-MM-yyyy / HH:mm:ss";
	
//	ATRIBUTOS
	private String text;
	private LocalDateTime dateTime;
	private int likes;
	
//	CONSTRUCTOR
	public Post(String content) {
		this.text = content;
		this.dateTime = LocalDateTime.now();
		this.likes = 0;
	}

//	GETTERS Y SETTERS
	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public LocalDateTime getDateTime() {
		return dateTime;
	}

	public void setDateTime(LocalDateTime dateTime) {
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
		System.out.printf("La publicación '%s' publicada (%s) tiene %d likes\n", text, dateTime, likes);
	}

	public String getFormatDateTime(){
		return dateTime.format(DateTimeFormatter.ofPattern(FORMAT_DATE_TIME));
	}

	public String getFormatDateTime(DateTimeFormatter formatter){
		return dateTime.format(formatter);
	}
	
}
