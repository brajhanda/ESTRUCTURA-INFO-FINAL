/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.StringTokenizer;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author marce
 */
public class Mostrar_Datos {
    public DefaultTableModel listaContactos(){
        Vector cabeceras = new Vector();
        cabeceras.addElement("Cedula");
        cabeceras.addElement("Nombre");
        cabeceras.addElement("Direccion");
        cabeceras.addElement("Telefono");
        DefaultTableModel Tabla1 = new DefaultTableModel(cabeceras,0);
        try {
            File file = new File("Agenda.txt");
            if(file.exists()){
                
                FileReader fr = new FileReader(file);
                BufferedReader br = new BufferedReader(fr);
                String linea;
                while((linea = br.readLine()) != null){
                    StringTokenizer dato = new StringTokenizer(linea," ");
                    Vector x = new Vector();
                    while(dato.hasMoreTokens()){
                        x.addElement(dato.nextToken());
                    }
                    Tabla1.addRow(x);
                    
                    
                } 
            }
            else{
                System.out.println("el archivo no existe");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return Tabla1;
        }

}
