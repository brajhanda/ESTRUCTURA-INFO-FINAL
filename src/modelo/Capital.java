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
public class Capital {
 String nombre;
 String cedula;
 String capinicial;

    public Capital(String nombre, String cedula, String capinicial) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.capinicial = capinicial;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getCapinicial() {
        return capinicial;
    }

    public void setCapinicial(String capinicial) {
        this.capinicial = capinicial;
    }
   

    
}
