/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package online_mcq_server;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lenovo
 */
public class ServerSubmitter extends Thread{

    public ServerSubmitter() {
        this.start();
    }
    @Override
    public void run(){
       while(true){
           try {
               ServerSocket serversocket=new ServerSocket(6000);
               Socket socket=serversocket.accept();
               System.out.println("6000 port has started");
               BufferedReader br=new BufferedReader(new InputStreamReader(socket.getInputStream()));
               File file=new File("Record.txt");
               BufferedWriter bw=new BufferedWriter(new FileWriter(file,true));
               String str;
               str=br.readLine();
               System.out.println(str);
               bw.write(str);
               bw.close();
               br.close();
               socket.close();
               serversocket.close();
               
           } catch (IOException ex) {
               //Logger.getLogger(ServerSubmitter.class.getName()).log(Level.SEVERE, null, ex);
           }
           
       }
    }

}