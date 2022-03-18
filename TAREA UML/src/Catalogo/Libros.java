/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Catalogo;

import Componentes.Autor;
import Componentes.Editorial;

/**
 *
 * @author dante
 */
public class Libros {
    private String GeneroLiterario;
    private int NumeroDePagina;
    private String Titulo;
    private String TipoDePasta;
    private Autor NombreDelAutor;
    private Editorial NombreDeLaEditorial;

    public Libros() {
    }

    public Libros(String GeneroLiterario, int NumeroDePagina, String Titulo, String TipoDePasta, Autor NombreDelAutor, Editorial NombreDeLaEditorial) {
        this.GeneroLiterario = GeneroLiterario;
        this.NumeroDePagina = NumeroDePagina;
        this.Titulo = Titulo;
        this.TipoDePasta = TipoDePasta;
        this.NombreDelAutor = NombreDelAutor;
        this.NombreDeLaEditorial = NombreDeLaEditorial;
    }

    public Editorial getNombreDeLaEditorial() {
        return NombreDeLaEditorial;
    }

    public void setNombreDeLaEditorial(Editorial NombreDeLaEditorial) {
        this.NombreDeLaEditorial = NombreDeLaEditorial;
    }

    public String getGeneroLiterario() {
        return GeneroLiterario;
    }

    public void setGeneroLiterario(String GeneroLiterario) {
        this.GeneroLiterario = GeneroLiterario;
    }

    public int getNumeroDePagina() {
        return NumeroDePagina;
    }

    public void setNumeroDePagina(int NumeroDePagina) {
        this.NumeroDePagina = NumeroDePagina;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getTipoDePasta() {
        return TipoDePasta;
    }

    public void setTipoDePasta(String TipoDePasta) {
        this.TipoDePasta = TipoDePasta;
    }

    public Autor getNombreDelAutor() {
        return NombreDelAutor;
    }

    public void setNombreDelAutor(Autor NombreDelAutor) {
        this.NombreDelAutor = NombreDelAutor;
    }

    @Override
    public String toString() {
        return "Libros{" + "GeneroLiterario=" + GeneroLiterario + ", NumeroDePagina=" + NumeroDePagina + ", Titulo=" + Titulo + ", TipoDePasta=" + TipoDePasta + ", NombreDelAutor=" + NombreDelAutor + ", NombreDeLaEditorial=" + NombreDeLaEditorial + '}';
    }

    public void setNombreEditorial(Editorial edito) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
            
    
}
