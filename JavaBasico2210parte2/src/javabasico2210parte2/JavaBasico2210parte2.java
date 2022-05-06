/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javabasico2210parte2;

import ico.fes.Circulo;
import ico.fes.Cuadrado;
import ico.fes.Figuras;
import ico.fes.herencia.EstudianteDeportista;
import java.awt.Color;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author dante
 */
public class JavaBasico2210parte2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cuadrado c = new Cuadrado(3.0f,4.0f);
        Circulo cir = new Circulo(5.0f);
        
        System.out.println(c.calcularArea());
        System.out.println(cir.calcularArea());
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("1)cuadrado 2)circulo 3)triangulo 4)rectangulo");
        int opcion = teclado.nextInt();
        switch (opcion) {
            case Figuras.CUADRADO:
                System.out.println(c.calcularArea());

                break;
            case Figuras.CIRCULO:
                System.out.println(cir.calcularArea());
                
                break;
            case Figuras.TRINAGULO:
                // Area trigungulo
                break;
            case Figuras.RECTANGULO:
                // Area rectangulo
                break;
            default: 
                System.out.println("opcion no valida");
                
        }
        JOptionPane.showMessageDialog(null,"hola","El titulo",JOptionPane.ERROR_MESSAGE);
        

        

    }
    
}
