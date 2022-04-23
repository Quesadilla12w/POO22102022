/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cuentahabiente;

/**
 *
 * @author dante
 */
public class CuentaHabiente {
    private int IdCliente ; 
    private String Nombre ;
    private float Balance ;

    public CuentaHabiente() {
    }

    public CuentaHabiente(int IdCliente, String Nombre, float Balance) {
        this.IdCliente = IdCliente;
        this.Nombre = Nombre;
        this.Balance = Balance;
    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

    public int getIdCliente() {
        return IdCliente;
    }

    public void setIdCliente(int IdCliente) {
        this.IdCliente = IdCliente;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public float getBalance() {
        return Balance;
    }

    public void setBalance(float Balance) {
        this.Balance = Balance;
    }

    @Override
    public String toString() {
        return "CuentaHabiente{" + "IdCliente=" + IdCliente + ", Nombre=" + Nombre + ", Balance=" + Balance + '}';
    }
    public void RetirarDinero( float monto ){float SaldoRestante = Balance - monto;
};
    
    public String EvaluarNivelCliente(){ 
        String Cliente = "Tipo de cliente";
                if(Balance<=50000){             
                    Cliente +="Regular"
                ;}
                else {Cliente +="premium";
            }
return Cliente;}
    
}
