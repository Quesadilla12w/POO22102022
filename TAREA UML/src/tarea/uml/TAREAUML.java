/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea.uml;

import Catalogo.Libros;
import Componentes.Autor;
import Componentes.Editorial;

/**
 *
 * @author dante
 */
public class TAREAUML {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Libros libro = new Libros();
        libro.setGeneroLiterario("Terror");
        libro.setNumeroDePagina(340);
        libro.setTitulo("Fantasmas");
        libro.setTipoDePasta("Blanda");
        
        
        Autor auto = new Autor();
        auto.setNombre("H. P. Lovecraft" );
        libro.setNombreDelAutor(auto);
        libro.getNombreDelAutor().setNacionalidad("Estadounidense");
        
        
        Editorial edito = new Editorial();
        edito.setNombreEditorial("Das Leben A1." );
        libro.setNombreDeLaEditorial(edito);
        libro.getNombreDeLaEditorial().setAñoDePublicacion(1990);
        System.out.println(libro);
        
      
    }
    
}
