


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dante
 */
public class PruebaEjemplo extends cuentahabiente.CuentaHabiente {

    public PruebaEjemplo() {
    }

    @Override
    public String EvaluarNivelCliente() {
        return super.EvaluarNivelCliente(); 
    }
    
    public static void main(String[] args){
    float[] CuentasHabientes = {65000,45000,80000,30000,100000};
        for (float i : CuentasHabientes) { 
            if(i<=50000){System.out.println("Cliente Regular");} 
            else {System.out.println("Cliente Premium");}
            System.out.println(i);
            
        }
        }
    
            }
    


