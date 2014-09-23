/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.losalpes.beans;

import com.losalpes.servicios.ServicioMail;

/**
 *
 * @author estudiante
 */
public class MailBean {

    private String mailDest;
    
    private String name;
    
    private ServicioMail servMail;
    
    /**
     * Creates a new instance of MailBean
     */
    public MailBean() {
        servMail = new ServicioMail();
    }
    
    public void enviarBonoRegalo()
    {
        //TODO get code from store
        servMail.enviarBonoRegalo(mailDest, name, null); //TODO fix
    }
    
}
