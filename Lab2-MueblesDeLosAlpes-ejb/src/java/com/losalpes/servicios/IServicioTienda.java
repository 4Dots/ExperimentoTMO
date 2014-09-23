/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.losalpes.servicios;

import com.losalpes.bos.Tienda;
import java.util.List;

/**
 *
 * @author estudiante
 */
public interface IServicioTienda {
    
    public void agregarTienda(Tienda tienda);
    
    public List<Tienda> darTiendas();
    
}
