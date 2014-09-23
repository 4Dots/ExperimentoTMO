/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.losalpes.beans;

import com.losalpes.bos.Tienda;
import com.losalpes.servicios.ServicioTienda;
import java.util.List;

/**
 *
 * @author estudiante
 */
public class TiendaBean {

    private Tienda tienda;

    
    private ServicioTienda servTienda;
    /**
     * Creates a new instance of TiendaBean
     */
    public TiendaBean() {
        tienda = new Tienda();
        servTienda = new ServicioTienda();
    }
    
    public Tienda getTienda() {
        return tienda;
    }

    public void setTienda(Tienda tienda) {
        this.tienda = tienda;
    }
    
    public List<Tienda> getTiendas()
    {
        return servTienda.darTiendas();
    }
    
    public void agregarTienda()
    {
        servTienda.agregarTienda(tienda);
        tienda = new Tienda();
    }
    
}
