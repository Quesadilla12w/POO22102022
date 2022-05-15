/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cifradocesar.v;

import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author dante
 */
public class Ventana extends JFrame implements Metodo{
    private JButton boton;
    private JLabel resultado;
    private JLabel mensaje;
    private JLabel desplazamiento;
    JTextField n;
    JTextField cuadroTexto;
    private FlowLayout layout;
    

 
    
    public Ventana() throws HeadlessException {
    this.setTitle("Cifrado Cesar");
    this.setSize(600,400);
    this.setVisible(true);
    layout = new FlowLayout();
    this.setLayout(layout);
    desplazamiento = new JLabel("Desplazamiento");
    n = new JTextField(2);
    mensaje = new JLabel("Introduce el mensaje a cifrar");
    cuadroTexto = new JTextField(20);
    boton = new JButton("Cifrar mensaje");
    resultado = new JLabel("Mensaje cifrado");
    this.getContentPane().add(desplazamiento);
    this.getContentPane().add(n);
    this.getContentPane().add(mensaje);
    this.getContentPane().add(cuadroTexto);
    this.getContentPane().add(boton);
    this.getContentPane().add(resultado);      
    this.pack();
    this.setVisible(true);
    ArrayList<String> abc = new ArrayList<>();
    abc.add("A");
    abc.add("B");
    abc.add("C");
    abc.add("D");
    abc.add("E");
    abc.add("F");
    abc.add("G");
    abc.add("H");
    abc.add("I");
    abc.add("J");
    abc.add("K");
    abc.add("L");
    abc.add("M");
    abc.add("N");
    abc.add("Ñ");
    abc.add("O");
    abc.add("P");
    abc.add("Q");
    abc.add("R");
    abc.add("S");
    abc.add("T");
    abc.add("U");
    abc.add("V");
    abc.add("W");
    abc.add("X");
    abc.add("Y");
    abc.add("Z");

    
    this.addWindowListener(new WindowAdapter() {
        @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
                
            }
          
            
        });
   
    
        this.boton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
            String texto = cuadroTexto.getText();
            Integer codigo =Integer.parseInt(n.getText());
            resultado.setText("Mesanje cifrado; " + cifradoCesar(texto, codigo));    
                }
             
        });
    
 
  } 

    @Override
    public String cifradoCesar(String texto, int codigo) {
        {
StringBuilder cifrado = new StringBuilder();
        codigo = codigo % 26;
        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) >= 'a' && texto.charAt(i) <= 'z') {
                if ((texto.charAt(i) + codigo) > 'z') {
                    cifrado.append((char) (texto.charAt(i) + codigo - 26));
                } else {
                    cifrado.append((char) (texto.charAt(i) + codigo));
                }
            } else if (texto.charAt(i) >= 'A' && texto.charAt(i) <= 'Z') {
                if ((texto.charAt(i) + codigo) > 'Z') {
                    cifrado.append((char) (texto.charAt(i) + codigo - 26));
                } else {
                    cifrado.append((char) (texto.charAt(i) + codigo));
                }
            }
        }
        return cifrado.toString();
    }
    }
   
}



