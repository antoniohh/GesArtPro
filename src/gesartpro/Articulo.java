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
public class Articulo implements java.io.Serializable {
    
    // Atributos privados de la clase.
    private String c_barra;
    private String tipo;    
    private String denominacion;
    private double p_compra;
    private double pvp;
    private int unidades;
    private int beneficio; 

    // Constructor que inicializa los atributos a cero.
    public Articulo() {        
        c_barra=null;
        tipo=null;
        denominacion=null;
        p_compra=0;
        pvp=0;
        unidades=0;
        beneficio=0;
    }
    
    // Constructor que inicializa los atributos a los valores indicados por los parámetros.
    public Articulo(String c_barra, String tipo, String denominacion, double p_compra, double pvp, int unidades, int beneficio) {
        this.c_barra=c_barra;
        this.tipo=tipo;        
        this.denominacion=denominacion;
        this.p_compra=p_compra;
        this.pvp=pvp;
        this.unidades=unidades;
        this.beneficio=beneficio;
    }
    
    // Metodo get para obtener (leer) el atributo.
    public String getC_barra() {
        return this.c_barra;
    } 

    // Metodo set para asignar (almacenar) el atributo.
    public void setC_barra(String c_barra) {
        this.c_barra=c_barra;
    }

    // Metodo get para obtener (leer) el atributo.
    public String getTipo() {
        return this.tipo;
    } 

    // Metodo set para asignar (almacenar) el atributo.
    public void setTipo(String tipo) {
        this.tipo=tipo;
    }    
    
    // Metodo get para obtener (leer) el atributo.
    public String getDenominacion() {
        return this.denominacion;
    } 

    // Metodo set para asignar (almacenar) el atributo.
    public void setDenominacion(String denominacion) {
        this.denominacion=denominacion;
    }
    
    // Metodo get para obtener (leer) el atributo.
    public int getBeneficio() {
        return this.beneficio;
    } 

    // Metodo set para asignar (almacenar) el atributo.
    public void setBeneficio(int beneficio) {
        this.beneficio=beneficio;
    }

    // Metodo get para obtener (leer) el atributo.
    public int getUnidades() {
        return this.unidades;
    }
    
    // Metodo set para asignar (almacenar) el atributo.
    public void setUnidades(int unidades) {
        this.unidades=unidades;
    }    
    
    // Metodo get para obtener (leer) el atributo.
    public double getPvp() {
        return this.pvp;
    }
    
    // Metodo set para asignar (almacenar) el atributo.
    public void setPvp(double pvp) {
        this.pvp=pvp;
    }     

    // Metodo get para obtener (leer) el atributo.
    public double getP_compra() {
        return this.p_compra;
    }
    
    // Metodo set para asignar (almacenar) el atributo.
    public void setP_compra(double p_compra) {
        this.p_compra=p_compra;
    }
    
    /**
     * Metodo Privado actualizarPrecios para controlar el acceso a lso precios.
     * 
     * Con este metodo asignamos el precio de venta y el precio de compra de los 
     * articulos, mediante dos expresiones matematicas. Toma como entrada dos 
     * variables con el precio de compra y el numero de unidades.
     * 
     * @param compra
     * @param unidad 
     */
    private void actualizarPrecios(double compra, int unidad) {
        this.p_compra=((this.unidades * this.p_compra)+(unidad*compra))/(this.unidades+unidad);
        this.pvp=this.p_compra + (this.p_compra * this.beneficio * 0.1);
    }
    
    /**
     * Metodo Publico Comprar. Llamamos al metodo privado actualizarPrecios pasandole
     * los valores del nuevo precio de compra y de las unidades comprdas para 
     * actualizar los precios de compra y de venta.
     * 
     * Finalmente, sumamos las uninades compradas a las unidades disponibles.
     * 
     * @param precioCompra
     * @param unidadesCompradas 
     */
    public void Comprar(double precioCompra, int unidadesCompradas) {
        this.actualizarPrecios(precioCompra,unidadesCompradas);
        this.unidades=this.unidades+unidadesCompradas;
    }
    
    /**
     * Metodo Publico Vender. Declaramos dos variables, comprar y unidad para enviarlas
     * al metodo actualizar Precios. Como en la venta no cambia el precio de compra
     * mantenemos el mismo, pero si cambian las unidades, por lo que actualizamos
     * el precio de compra con las nuevas unidades disponibles una vez efectuada
     * la venta de articulos.
     * 
     * Finalmente, restamos las uninades vendidas a las unidades disponibles.
     * 
     * @param unidadesVendidas 
     */
    public void Vender(int unidadesVendidas) {
        double compra = this.p_compra;
        int unidad=this.unidades-unidadesVendidas;
        this.actualizarPrecios(compra,unidad);        
        this.unidades=this.unidades-unidadesVendidas;
    }
    
    @Override
    public String toString() {
    return "Articulos [cod_barra=" + c_barra + ", tipo" + tipo + ", denominacion="
    + denominacion + ", unidades=" + unidades + ", pvp=" + pvp
    + ", p_compra=" + p_compra + ",beneficio=" + beneficio +
    "]";
    }
}