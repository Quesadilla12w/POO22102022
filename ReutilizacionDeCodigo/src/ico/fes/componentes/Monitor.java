/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.componentes;

/**
 *
 * @author dante
 */
public class Monitor {
    private String marca;
    private String tipo; //Led, Smart tv, LCD, OLED 
    private float Pulgadas;

    public Monitor() {
    }

    public Monitor(String marca, String tipo, float Pulgadas) {
        this.marca = marca;
        this.tipo = tipo;
        this.Pulgadas = Pulgadas;
    }

    public float getPulgadas() {
        return Pulgadas;
    }

    public void setPulgadas(float Pulgadas) {
        this.Pulgadas = Pulgadas;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Monitor{" + "marca=" + marca + ", tipo=" + tipo + ", Pulgadas=" + Pulgadas + '}';
    }
    
    
}
