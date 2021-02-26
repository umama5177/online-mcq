/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package online_mcq;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
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
import static online_mcq.Record.answerCheck;

/**
 * FXML Controller class
 *
 * @author lenovo
 */
public class QuestionSet_5Controller implements Initializable {

    @FXML
    private Label question9;
    @FXML
    private RadioButton radioButton91;
    @FXML
    private ToggleGroup option9;
    @FXML
    private RadioButton radioButton92;
    @FXML
    private RadioButton radioButton93;
    @FXML
    private RadioButton radioButton94;
    @FXML
    private CheckBox checkBox91;
    @FXML
    private CheckBox checkBox92;
    @FXML
    private CheckBox checkBox93;
    @FXML
    private CheckBox checkBox94;
    @FXML
    private Label answer9;
    @FXML
    private Label question10;
    @FXML
    private RadioButton radioButton101;
    @FXML
    private ToggleGroup option10;
    @FXML
    private RadioButton radioButton102;
    @FXML
    private RadioButton radioButton103;
    @FXML
    private RadioButton radioButton104;
    @FXML
    private CheckBox checkBox101;
    @FXML
    private CheckBox checkBox102;
    @FXML
    private CheckBox checkBox103;
    @FXML
    private CheckBox checkBox104;
    @FXML
    private Label answer10;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        question9.setText(Record.question[40]);
        radioButton91.setText(Record.question[41]);
        radioButton92.setText(Record.question[42]);
        radioButton93.setText(Record.question[43]);
        radioButton94.setText(Record.question[44]);
        question10.setText(Record.question[45]);
        radioButton101.setText(Record.question[46]);
        radioButton102.setText(Record.question[47]);
        radioButton103.setText(Record.question[48]);
        radioButton104.setText(Record.question[49]);
    
           if(Record.inputAnswer[9]=='a') radioButton101.setSelected(true);
    if(Record.inputAnswer[9]=='b') radioButton102.setSelected(true);
    if(Record.inputAnswer[9]=='c') radioButton103.setSelected(true);
    if(Record.inputAnswer[9]=='d') radioButton104.setSelected(true);
    if(Record.inputAnswer[8]=='a') radioButton91.setSelected(true);
    if(Record.inputAnswer[8]=='b') radioButton92.setSelected(true);
    if(Record.inputAnswer[8]=='c') radioButton93.setSelected(true);
    if(Record.inputAnswer[8]=='d') radioButton94.setSelected(true);
        
    if(Record.isSubmitted==1){
          if(Record.answerCheck[8].equals("a")) checkBox91.setSelected(true);
    if(Record.answerCheck[8].equals("b")) checkBox92.setSelected(true);
    if(Record.answerCheck[8].equals("c")) checkBox93.setSelected(true);
    if(Record.answerCheck[8].equals("d")) checkBox94.setSelected(true);
     if(Record.answerCheck[9].equals("a")) checkBox101.setSelected(true);
    if(Record.answerCheck[9].equals("b")) checkBox102.setSelected(true);
    if(Record.answerCheck[9].equals("c")) checkBox103.setSelected(true);
    if(Record.answerCheck[9].equals("d")) checkBox104.setSelected(true);
    
       }
    }    

    @FXML
    private void page5BackButtonAction(ActionEvent event) throws IOException {
        Parent pane=FXMLLoader.load(getClass().getResource("questionSet_4.fxml"));
        Scene scene=new Scene(pane);
         Stage stage=(Stage)((Node)event.getSource()).getScene().getWindow();
         stage.setScene(scene);
         stage.show();
    }

    @FXML
    private void question9ToggleAction(ActionEvent event) {
        RadioButton selectedRadioButton = (RadioButton) option9.getSelectedToggle();
    String toogleGroupValue = selectedRadioButton.getText();
    Record.inputAnswer[8]=toogleGroupValue.charAt(0);
    
    }

    @FXML
    private void question10ToggleAction(ActionEvent event) {
        RadioButton selectedRadioButton = (RadioButton) option10.getSelectedToggle();
    String toogleGroupValue = selectedRadioButton.getText();
    Record.inputAnswer[9]=toogleGroupValue.charAt(0);
     
    }
public void obtainResult(){
    Record.isSubmitted=1;
       
        for(char c:Record.inputAnswer)
            System.out.print(c);
        String str="";
       for(String i:Record.answerCheck)
           str+=i;
       //char check[]=new char[10];
       Record.check=str.toCharArray();
        System.out.println("correct anwer: ");
       for(char c:Record.check)
            System.out.print(c);
      int mark=0;
      for(int i=0;i<Record.check.length;i++){
          if(Record.check[i]==Record.inputAnswer[i]){
              mark=mark+1;
          }
      }
         
          
          Record.marks=mark;
         
}
    @FXML
    private void submitButtonAction(ActionEvent event) throws IOException {
       obtainResult();
       
      
      
         
          Parent pane=FXMLLoader.load(getClass().getResource("marksShow.fxml"));
        Scene scene=new Scene(pane);
         Stage stage=(Stage)((Node)event.getSource()).getScene().getWindow();
         stage.setScene(scene);
         stage.show();
      }
           
       
    }
    
