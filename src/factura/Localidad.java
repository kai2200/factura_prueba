/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factura;

/**
 *
 * @author alumno
 */
public class Localidad {
    private String nombre;
    private Partido nombre_partido;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Partido getNombre_partido() {
        return nombre_partido;
    }

    public void setNombre_partido(Partido nombre_partido) {
        this.nombre_partido = nombre_partido;
    }
}
