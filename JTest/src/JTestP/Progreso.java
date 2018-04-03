/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JTestP;

import java.io.Serializable;

/**
 *
 * @author noe
 */
public class Progreso implements Serializable {
    
    private int cont;
    private String nombre;
    private String[] estado;
    private String[] respuesta;
    private int cal;
    private String aprovacion;
    

    public Progreso(String nombre) {
        this.cont = 0;
        this.nombre = nombre;
        this.estado =  new String[10];
        this.respuesta = new String [10];
        this.cal=0;
        this.aprovacion = "Indeterminado";
        
        
        for(int i=0 ; i<10; i++ ){
            this.estado[i] = "Sin contestar";
            this.respuesta[i] = "Sin respuesta";
        }
        
        
    }

    public int getCont() {
        return cont;
    }

    public void setCont(int cont) {
        this.cont = cont;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String[] getEstado() {
        return estado;
    }

    public void setEstado(String[] estado) {
        this.estado = estado;
    }

    public String[] getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String[] respuesta) {
        this.respuesta = respuesta;
    }

    public int getCal() {
        return cal;
    }

    public void setCal(int cal) {
        this.cal = cal;
    }

    public String getAprovacion() {
        return aprovacion;
    }

    public void setAprovacion(String aprovacion) {
        this.aprovacion = aprovacion;
    }

    
    
    
    

   

    @Override
    public String toString() {
        return "Progreso:" + nombre + " "+cont +"/10";
    }
    
}
