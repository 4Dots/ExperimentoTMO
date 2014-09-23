/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.losalpes.servicios;

import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author estudiante
 */
public class ServicioMail implements IServicioMail{

    @Override
    public void enviarBonoRegalo(String emailDest, String name, String tienda) {
        
        //TODO get code from store
        
        Properties props = new Properties();
        Session session = Session.getDefaultInstance(props, null);

        String msgBody = ""; //TODO fix

        try {
            Message msg = new MimeMessage(session);
            msg.setFrom(new InternetAddress("Dapd007@gmail.com", "TMO"));
            msg.addRecipient(Message.RecipientType.TO,
                             new InternetAddress(emailDest, name));
            msg.setSubject("Bono regalo TuMejorOpcion");
            msg.setText(msgBody);
            Transport.send(msg);

        } catch (Exception e) {
            // hue
        }
        
    }
    
    
}
