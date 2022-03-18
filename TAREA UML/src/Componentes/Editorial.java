/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Componentes;

/**
 *
 * @author dante
 */
public class Editorial {
    private String NombreEditorial;
    private int AñoDePublicacion;

    public Editorial() {
    }

    public Editorial(String NombreEditorial, int AñoDePublicacion) {
        this.NombreEditorial = NombreEditorial;
        this.AñoDePublicacion = AñoDePublicacion;
    }

    public int getAñoDePublicacion() {
        return AñoDePublicacion;
    }

    public void setAñoDePublicacion(int AñoDePublicacion) {
        this.AñoDePublicacion = AñoDePublicacion;
    }

    public String getNombreEditorial() {
        return NombreEditorial;
    }

    public void setNombreEditorial(String NombreEditorial) {
        this.NombreEditorial = NombreEditorial;
    }

    @Override
    public String toString() {
        return "Editorial{" + "NombreEditorial=" + NombreEditorial + ", A\u00f1oDePublicacion=" + AñoDePublicacion + '}';
    }
    
   
}
