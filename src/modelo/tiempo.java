/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;



/**
 *
 * @author user
 */
public class tiempo extends Interes{
 
 String T;
    public tiempo(String T, String nombre, String cedula, String capinicial) {
        super( nombre, cedula, capinicial);
        this.T = T;
    }

    


    public String getTiempo() {
        return T;
    }

    public void setTiempo(String Tiempo) {
        this.T= Tiempo;
    }
    

  
    
}
