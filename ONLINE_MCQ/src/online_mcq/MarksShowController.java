/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package online_mcq;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.URL;
import java.util.ResourceBundle;
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
 * FXML Controller class
 *
 * @author lenovo
 */
public class MarksShowController implements Initializable {

    @FXML
    private Label marksScore;
    @FXML
    private Button backButton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
     try{
             Socket socket=new Socket("localhost",6000);
       PrintWriter p=new PrintWriter(socket.getOutputStream());
       p.println(Record.name+"//"+Record.filename+"//"+Record.marks+" ");
       p.flush();
       System.out.println(Record.name+"//"+Record.filename+"//"+Record.marks);
       p.close();
       socket.close();  
         }catch(Exception e){
             
         }
          
     String st="your score is: "+Record.marks;
     marksScore.setText(st);
    }    

    @FXML
    private void backButttonAction(ActionEvent event) throws IOException {
        Record.isSubmitted=0;
        //Record.isBack=0;
        Parent pane=FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        Scene scene=new Scene(pane);
         Stage stage=(Stage)((Node)event.getSource()).getScene().getWindow();
         stage.setScene(scene);
         stage.show();
    }

    @FXML
    private void viewAnswer(ActionEvent event) throws IOException {
        Parent pane=FXMLLoader.load(getClass().getResource("questionSet_1.fxml"));
        Scene scene=new Scene(pane);
         Stage stage=(Stage)((Node)event.getSource()).getScene().getWindow();
         stage.setScene(scene);
         stage.show();
    }
    
}
