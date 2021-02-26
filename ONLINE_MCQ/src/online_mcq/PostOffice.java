/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package online_mcq;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lenovo
 */
public class PostOffice {
     Socket socket;
    ObjectInputStream inbox;
    ObjectOutputStream outbox;
    public PostOffice(Socket socket) throws IOException{
        this.socket=socket;
        try{
            inbox=new ObjectInputStream(socket.getInputStream());
            outbox=new ObjectOutputStream(socket.getOutputStream());
        }catch(IOException e){
            
        }
    }
    PostOffice(ServerSocket serversocket){
      try{
          socket=serversocket.accept();
          inbox=new ObjectInputStream(socket.getInputStream());
            outbox=new ObjectOutputStream(socket.getOutputStream());
      }  catch(IOException e){
          
      }
    }
    public void send(Object data){
        try{
            outbox.writeObject(data);
        }catch(IOException e){
            
        }
    }
    public Object receive(){
        Object object = null;
      try{
          object=inbox.readObject();
      }catch(IOException | ClassNotFoundException e){
          
      }
       return object; 
    }
    public void close(){
        try {
            inbox.close();
             outbox.close();
        } catch (IOException ex) {
            Logger.getLogger(PostOffice.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }
    
}
