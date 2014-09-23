/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.losalpes.servicios;

import com.losalpes.bos.Tienda;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author estudiante
 */
public class ServicioTienda implements IServicioTienda {

    private ArrayList<Tienda> tiendas;
    
    public ServicioTienda()
    {
        tiendas = new ArrayList<Tienda>();
        
        tiendas.add(new Tienda("Tienda 1"));
    }
    
    @Override
    public void agregarTienda(Tienda tienda) {
        tiendas.add(tienda);
    }

    @Override
    public List<Tienda> darTiendas() {
        return tiendas;
    }
    
}
