package com.carmengarciamunoz.poo.redsocial;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

import com.github.mustachejava.DefaultMustacheFactory;
import com.github.mustachejava.Mustache;
import com.github.mustachejava.MustacheFactory;

public class RenderizadorPerfil {

    /**
     * Genera un fichero HTML con la información del perfil de usuario.
     *
     * @param perfil      PerfilRedSocial que se quiere mostrar en el HTML.
     * @param rutaSalida  Nombre o ruta del fichero HTML de salida
     *                    (por ejemplo: "perfil_maria.html").
     */
    public static void HtmlProfileGenerator(Profile perfil, String rutaSalida) {

        // Fábrica de plantillas Mustache
        MustacheFactory mustacheFactory = new DefaultMustacheFactory();

        // Carga la plantilla "perfil.mustache" desde src/main/resources
        Mustache mustache = mustacheFactory.compile("plantilla.html");

        // Escribimos el resultado en el fichero indicado
        try (Writer writer = new FileWriter(rutaSalida)) {
            mustache.execute(writer, perfil).flush();
            System.out.println("✅ HTML generado correctamente en: " + rutaSalida);
        } catch (IOException e) {
            System.out.println("❌ Error al generar el HTML del perfil: " + e.getMessage());
        }
    }
}
