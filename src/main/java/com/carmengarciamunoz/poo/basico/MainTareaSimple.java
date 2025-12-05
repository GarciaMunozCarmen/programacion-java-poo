package com.carmengarciamunoz.poo.basico;

public class MainTareaSimple {

	public static void main(String[] args) {
		TareaSimple tarea = new TareaSimple("Estudiar", 120, true);
		TareaSimple tarea2 = new TareaSimple();
		tarea.mostrarTarea();
		System.out.println(tarea.getTitulo());

		System.out.println(tarea2.getDuracionMinutos());

		tarea2.setDuracionMinutos(50);
		System.out.println(tarea2.getDuracionMinutos());
	}

}
