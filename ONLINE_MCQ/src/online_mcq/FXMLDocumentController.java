/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package online_mcq;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 *
 * @author lenovo
 */
public class FXMLDocumentController implements Initializable {
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    

    @FXML
    private void optionButtonAction(ActionEvent event) throws IOException, ClassNotFoundException {
        Record.filename=((Button)event.getSource()).getText();
        
        System.out.println(Record.filename);
        System.out.println("is submitted "+Record.isSubmitted);
        Socket socket=new Socket("localhost",4000);
        BufferedReader br=new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter p=new PrintWriter(socket.getOutputStream());
        p.println(Record.filename);
        p.flush();
        String str;
        str=br.readLine();
        br.close();
        p.close();
        socket.close();
     Record.question=str.split("#");
       for(int i=0;i<10;i++){
           Record.inputAnswer[i]=' ';
       }
      
        Parent pane=FXMLLoader.load(getClass().getResource(Record.filename+".fxml"));

         Scene scene=new Scene(pane);
         Stage stage=(Stage)((Node)event.getSource()).getScene().getWindow();
         stage.setScene(scene);
         stage.show();
    }

    @FXML
    private void record(ActionEvent event) throws IOException {
        Parent pane=FXMLLoader.load(getClass().getResource("ListView.fxml"));

         Scene scene=new Scene(pane);
         Stage stage=(Stage)((Node)event.getSource()).getScene().getWindow();
         stage.setScene(scene);
         stage.show();
    }
    
}
