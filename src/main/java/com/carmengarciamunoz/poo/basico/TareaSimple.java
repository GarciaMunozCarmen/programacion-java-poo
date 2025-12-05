package com.carmengarciamunoz.poo.basico;

public class TareaSimple {

//	VISIBILIDAD
//	private-> se puede llamar solo en la clase 
//	public-> se puede llamar en cualquier lado
//	protected-> se puede llamar solo en el mismo paquete

//	ATRIBUTOS	
	private int duracionMinutos;
	private String titulo;
	private boolean completado;

//	CONSTRUCTORES
	public TareaSimple(String titulo, int duracionMinutos, boolean completado) {
		this.duracionMinutos = duracionMinutos;
		this.titulo = titulo;
		this.completado = completado;
	}

	public TareaSimple() {

	}

//	GETTERS Y SETTERS	
	public String getTitulo() {
		return this.titulo;
	}

	public int getDuracionMinutos() {
		return this.duracionMinutos;
	}

	public boolean isCompletado() {
		return this.completado;
	}

	public void setTitulo(String t) {
		this.titulo = t;
	}

	public void setDuracionMinutos(int d) {
		this.duracionMinutos = d;
	}

	public void setCompletado(boolean c) {
		this.completado = c;
	}

//	MÉTODOS
	public void mostrarTarea() {
//		if(this.completado) {
//			System.out.println("La tarea está completada");
//		}else {
//			System.out.println("La tarea no está completada");
//		}
		
		System.out.println(this.completado?"La tarea está completada":"La tarea no está completada"); //Ternario simplifica
	}

	public void cambiarEstado() {
		this.completado = !completado;
	}
	
}
