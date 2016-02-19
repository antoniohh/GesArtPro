/*
 * Copyright (C) 2016 Antonio Horrillo Horrillo.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

/**
 * Definimos el paquete de la clase.
 */
package gesartpro;

/**
 *
 * @author Antonio Horrillo Horrillo.
 */
public class Persona implements java.io.Serializable{
    
    public Persona() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    public Persona(String nombre, String direccion, String poblacion, String nif) {
        super();
        this.nombre = nombre;
        this.direccion = direccion;
        this.poblacion = poblacion;
        this.nif = nif;
    }
    
    /**
     * protected es el modificador que permite acceder a este dato a las clases 
     * derivadas (herencia) pero siguen siendo privados para los demás.
     */
    protected String nombre;
    protected String direccion;
    protected String poblacion;
    protected String nif;
    
    // Metodo get para obtener (leer) el atributo.
    public String getNombre() {
        return nombre;
    }
    
    // Metodo set para asignar (almacenar) el atributo.
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    // Metodo get para obtener (leer) el atributo.
    public String getDireccion() {
        return direccion;
    }
    
    // Metodo set para asignar (almacenar) el atributo.
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    // Metodo get para obtener (leer) el atributo.
    public String getPoblacion() {
        return poblacion;
    }
    
    // Metodo set para asignar (almacenar) el atributo.
    public void setPoblacion(String poblacion) {
        this.poblacion = poblacion;
    }
    
    // Metodo get para obtener (leer) el atributo.
    public String getNif() {
        return nif;
    }
    
    // Metodo set para asignar (almacenar) el atributo.
    public void setNif(String nif) {
        this.nif = nif;
    }
    
    /**
     * Retorna los datos de la persona preformateados.
     * 
     * @return 
     */
    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + ", direccion=" + direccion + ", poblacion=" + poblacion + ", nif=" + nif + "]";
    }
}