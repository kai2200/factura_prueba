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
public class Provincia {
    private String nombre;
    private Pais pais_provincia;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Pais getPais_provincia() {
        return pais_provincia;
    }

    public void setPais_provincia(Pais pais_provincia) {
        this.pais_provincia = pais_provincia;
    }
    
}
