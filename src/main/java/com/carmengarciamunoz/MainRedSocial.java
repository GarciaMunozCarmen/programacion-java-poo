package com.carmengarciamunoz;

import com.carmengarciamunoz.poo.redsocial.PerfilRedSocial;

public class MainRedSocial {

	public static void main(String[] args) {
		PerfilRedSocial hola = new PerfilRedSocial("caarmen", "carmen", "hola a todos", "Madrid");
		hola.show();
		hola.deactivate();
		System.out.println(hola.isActive());
	}

}
