/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package online_mcq_server;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import static online_mcq_server.ONLINE_MCQ_SERVER.someRandom;

/**
 *
 * @author lenovo
 */
public class ONLINE_MCQ_SERVER {
public static int someRandom()
{
    Random rn=new Random();
    int n=rn.nextInt(4);
    return n+1;
}

public static void main(String[] args)throws Exception{
ServerSocket serversocket;
ServerSubmitter s=new ServerSubmitter();
sendRecordData ss=new sendRecordData();
serversocket=new ServerSocket(4000);
while(true){
    
    Socket socket=serversocket.accept();
    BufferedReader br=new BufferedReader(new InputStreamReader(socket.getInputStream()));
     PrintWriter p=new PrintWriter(socket.getOutputStream());
    System.out.println("port 4000 has started!!!");
    String subject;
    System.out.println("okk!!!");
    String filename=br.readLine();
    System.out.println(filename);
    //String filename=subject+" "+someRandom()+".txt";
    File file=new File(filename+" "+someRandom()+".txt");
            System.out.println(filename+" "+someRandom()+".txt");
    BufferedReader bf=new BufferedReader(new FileReader(file));
    int i=0;
    String str="";
    Scanner sc=new Scanner(file);
    while(sc.hasNext()){
       str+=sc.nextLine();
       str+="#";
    }
 p.println(str);
 p.flush();
    br.close();
        p.close();
        socket.close();
    
    
}
}
     
}
class questionSet implements Runnable{
Socket s;
BufferedReader br;
PrintWriter p;

    public questionSet(Socket s, BufferedReader br, PrintWriter p) {
        this.s = s;
        this.br = br;
        this.p = p;
    }

    @Override
    public void run() {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    
        try{
           String subject;
    System.out.println("okk!!!");
    String filename=br.readLine();
    System.out.println(filename);
    //String filename=subject+" "+someRandom()+".txt";
    File file=new File(filename+" "+someRandom()+".txt");
            System.out.println(filename+" "+someRandom()+".txt");
    //BufferedReader bf=new BufferedReader(new FileReader(file));
    int i=0;
    String str="";
    Scanner sc=new Scanner(file);
    while(sc.hasNext()){
       str+=sc.nextLine();
       str+="#";
    }
 p.println(str);
 p.flush();
    System.out.println("done");
    
        }catch(Exception e){
            
        }
       try{
            br.close();
        p.close();
        s.close();
        }catch(IOException e){
            
        }
        
    }
    }
    
