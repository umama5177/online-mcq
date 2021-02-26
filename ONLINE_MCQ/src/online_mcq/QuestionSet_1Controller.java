/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package online_mcq;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;
import static online_mcq.ONLINE_MCQ.input;

/**
 * FXML Controller class
 *
 * @author lenovo
 */
public class QuestionSet_1Controller implements Initializable {

    @FXML
    private Label question1;
    @FXML
    private RadioButton radioButton11;
    @FXML
    private ToggleGroup option1;
    @FXML
    private RadioButton radioButton12;
    @FXML
    private RadioButton radioButton13;
    @FXML
    private RadioButton radioButton14;
    @FXML
    private CheckBox checkBox11;
    @FXML
    private CheckBox checkBox12;
    @FXML
    private CheckBox checkBox13;
    @FXML
    private CheckBox checkBox14;
    @FXML
    private Label answer1;
    @FXML
    private Label question2;
    @FXML
    private RadioButton radioButton21;
    @FXML
    private ToggleGroup option2;
    @FXML
    private RadioButton radioButton22;
    @FXML
    private RadioButton radioButton23;
    @FXML
    private RadioButton radioButton24;
    @FXML
    private CheckBox checkBox21;
    @FXML
    private CheckBox checkBox22;
    @FXML
    private CheckBox checkBox23;
    @FXML
    private CheckBox checkBox24;
    @FXML
    private Label answer2;

    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
        
        
        
        question1.setText(Record.question[0]);
        radioButton11.setText(Record.question[1]);
        radioButton12.setText(Record.question[2]);
        radioButton13.setText(Record.question[3]);
        radioButton14.setText(Record.question[4]);
        question2.setText(Record.question[5]);
        radioButton21.setText(Record.question[6]);
        radioButton22.setText(Record.question[7]);
        radioButton23.setText(Record.question[8]);
        radioButton24.setText(Record.question[9]);
        Record.answerCheck=Record.question[50].split(" ");
        
          if(Record.inputAnswer[0]=='a') radioButton11.setSelected(true);
    if(Record.inputAnswer[0]=='b') radioButton12.setSelected(true);
    if(Record.inputAnswer[0]=='c') radioButton13.setSelected(true);
    if(Record.inputAnswer[0]=='d') radioButton14.setSelected(true);
     if(Record.inputAnswer[1]=='a') radioButton21.setSelected(true);
    if(Record.inputAnswer[1]=='b') radioButton22.setSelected(true);
    if(Record.inputAnswer[1]=='c') radioButton23.setSelected(true);
    if(Record.inputAnswer[1]=='d') radioButton24.setSelected(true);
        
       if(Record.isSubmitted==1){
          if(Record.answerCheck[0].equals("a")) checkBox11.setSelected(true);
    if(Record.answerCheck[0].equals("b")) checkBox12.setSelected(true);
    if(Record.answerCheck[0].equals("c")) checkBox13.setSelected(true);
    if(Record.answerCheck[0].equals("d")) checkBox14.setSelected(true);
     if(Record.answerCheck[1].equals("a")) checkBox21.setSelected(true);
    if(Record.answerCheck[1].equals("b")) checkBox22.setSelected(true);
    if(Record.answerCheck[1].equals("c")) checkBox23.setSelected(true);
    if(Record.answerCheck[0].equals("d")) checkBox24.setSelected(true);
    
       }
    }
      

    @FXML
    private void page1BackButtonAction(ActionEvent event) throws IOException {
        Record.isSubmitted=0;
         System.out.println("in contoller 1 back bottuon "+Record.isSubmitted); 
        Parent pane=FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        Scene scene=new Scene(pane);
         Stage stage=(Stage)((Node)event.getSource()).getScene().getWindow();
         stage.setScene(scene);
         stage.show();
    }

    @FXML
    private void question1ToggleAction(ActionEvent event) {
        RadioButton selectedRadioButton = (RadioButton) option1.getSelectedToggle();
    String toogleGroupValue = selectedRadioButton.getText();
    Record.inputAnswer[0]=toogleGroupValue.charAt(0);
     
    
    
    }

    @FXML
    private void question2ToggleAction(ActionEvent event) {
        RadioButton selectedRadioButton = (RadioButton) option2.getSelectedToggle();
    String toogleGroupValue = selectedRadioButton.getText();
    Record.inputAnswer[1]=toogleGroupValue.charAt(0);
     
    }

    @FXML
    private void page1NextButtonAction(ActionEvent event) throws IOException {
        
        Parent pane=FXMLLoader.load(getClass().getResource("questionSet_2.fxml"));
        Scene scene=new Scene(pane);
         Stage stage=(Stage)((Node)event.getSource()).getScene().getWindow();
         stage.setScene(scene);
         stage.show();
    }
    
}
