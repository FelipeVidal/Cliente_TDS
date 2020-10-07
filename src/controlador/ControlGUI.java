/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import presentacion.GUI_opcServer;
import servicios.ServicioServidorTcp;

/**
 *
 * @author Felipe
 */
public class ControlGUI {
    GUI_opcServer GUIServer;
    public ControlGUI(){
        GUIServer = new GUI_opcServer();
    }
    
    public void ControlGUIServer(){
        GUIServer.setVisible(true);
    }
    
    public void conexionSever(String ip, String puerto){
        ServicioServidorTcp stp;
        stp = new ServicioServidorTcp();
        int puertoInt;
        puertoInt=Integer.parseInt(puerto);
        stp.conectServer(ip, puertoInt);
        System.out.println(ip);
        System.out.println(puerto);
    }
    
    
    
}
