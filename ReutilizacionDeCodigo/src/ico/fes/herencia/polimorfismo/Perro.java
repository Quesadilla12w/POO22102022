/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.herencia.polimorfismo;

/**
 *
 * @author dante
 */
public class  Perro extends Animal {
    String raza;

    public Perro() {
    }

    public Perro(String raza) {
        this.raza = raza;
    }
        public Perro(String raza,int numeroPatas) {
        super(numeroPatas);
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return super.toString()+ "Perro{" + "raza=" + raza + '}';
    }
    @Override
    public void hablar(){System.out.println("El perro de raza" + this.raza + "Esta ladrando" );
    System.out.println("Guau guau");}
    
//Polimorfimso por sobrecarga 
  public void hablar(int veces){
  for(int i = 0; i < veces; i++){
      System.out.println("Guau!!");
  }
  }
}

