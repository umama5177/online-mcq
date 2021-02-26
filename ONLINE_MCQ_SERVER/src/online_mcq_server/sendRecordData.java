/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package online_mcq_server;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author lenovo
 */
public class sendRecordData extends Thread{
    ServerSocket serversocket;

    public sendRecordData() {
        this.start();
    }
    public void run(){
        while(true){
            try{
                serversocket=new ServerSocket(7000);
                Socket socket=serversocket.accept();
                System.out.println("7000 port has started");
                PrintWriter p=new PrintWriter(socket.getOutputStream());
                File file=new File("Record.txt");
                Scanner sc=new Scanner(file);
                String str;
                while(sc.hasNext()){
                    str=sc.next();
                    System.out.println(str);
                    p.println(str);
                    p.flush();
                }
             p.close();
             socket.close();
              serversocket.close();
            }catch(Exception e){
                
            }
            
        }
    }
}
