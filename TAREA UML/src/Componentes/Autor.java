/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Componentes;

/**
 *
 * @author dante
 */
public class Autor {
    private String Nombre;
    private String Nacionalidad;

    public Autor() {
    }

    public Autor(String Nombre, String Nacionalidad) {
        this.Nombre = Nombre;
        this.Nacionalidad = Nacionalidad;
    }

    public String getNacionalidad() {
        return Nacionalidad;
    }

    public void setNacionalidad(String Nacionalidad) {
        this.Nacionalidad = Nacionalidad;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    @Override
    public String toString() {
        return "Autor{" + "Nombre=" + Nombre + ", Nacionalidad=" + Nacionalidad + '}';
    }
    
    
}
