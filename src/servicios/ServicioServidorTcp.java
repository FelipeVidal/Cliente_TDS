/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

/**
 *
 * @author Felipe
 */
public class ServicioServidorTcp {
  public void conectServer(String ipServer, int puertoServer){
              //Host del servidor
        final String dirIpServidor = ipServer;
        //Puerto del servidor
        final int PUERTO_SERVIDOR = puertoServer;
        DataInputStream objFlujoDeEntrada;
        DataOutputStream objFlujoDeSalida;
 
        try {
            //Creo el socket para conectarme con el servidor
            Socket objSocket = new Socket(dirIpServidor, PUERTO_SERVIDOR);
 
            objFlujoDeEntrada = new DataInputStream(objSocket.getInputStream());
            objFlujoDeSalida = new DataOutputStream(objSocket.getOutputStream());
 
            //El Cliente envia un mensaje al servidor
            objFlujoDeSalida.writeUTF("¡Hola mundo desde el cliente!");
 
            //El Cliente recibe un mensaje del servidor
            String mensaje = objFlujoDeEntrada.readUTF();
 
            System.out.println(mensaje);
            
            //Cierro el socket
            objSocket.close();
 
        } catch (IOException ex) {
            System.out.println("Error al realizar la conexión");
        }
  }  
  
}
