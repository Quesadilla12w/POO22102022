/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes;

/**
 *
 * @author dante
 */
public class Circulo implements Figuras{
    public static final float P1=3.1416f;
    private float radio;

    public Circulo(float radio) {
        this.radio = radio;
    }

    public Circulo() {
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "Circulo{" + "radio=" + radio + '}';
    }

    @Override
    public float calcularArea() {
        return P1*(this.radio*this.radio);
    }

    @Override
    public String saludar() {
        System.out.println("Hola desde el circulo");
        return "hola C";
    }
    
    
    
}
