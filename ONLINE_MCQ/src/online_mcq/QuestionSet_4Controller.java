/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package online_mcq;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
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

/**
 * FXML Controller class
 *
 * @author lenovo
 */
public class QuestionSet_4Controller implements Initializable {

    @FXML
    private Label question7;
    @FXML
    private RadioButton radioButton71;
    @FXML
    private ToggleGroup option7;
    @FXML
    private RadioButton radioButton72;
    @FXML
    private RadioButton radioButton73;
    @FXML
    private RadioButton radioButton74;
    @FXML
    private CheckBox checkBox71;
    @FXML
    private CheckBox checkBox72;
    @FXML
    private CheckBox checkBox73;
    @FXML
    private CheckBox checkBox74;
    @FXML
    private Label answer7;
    @FXML
    private Label question6;
    @FXML
    private RadioButton radioButton81;
    @FXML
    private ToggleGroup option8;
    @FXML
    private RadioButton radioButton82;
    @FXML
    private RadioButton radioButton83;
    @FXML
    private RadioButton radioButton84;
    @FXML
    private CheckBox checkBox81;
    @FXML
    private CheckBox checkBox82;
    @FXML
    private CheckBox checkBox83;
    @FXML
    private CheckBox checkBox84;
    @FXML
    private Label answer8;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        question7.setText(Record.question[30]);
        radioButton71.setText(Record.question[31]);
        radioButton72.setText(Record.question[32]);
        radioButton73.setText(Record.question[33]);
        radioButton74.setText(Record.question[34]);
        question6.setText(Record.question[35]);
        radioButton81.setText(Record.question[36]);
        radioButton82.setText(Record.question[37]);
        radioButton83.setText(Record.question[38]);
        radioButton84.setText(Record.question[39]);
        
            if(Record.inputAnswer[6]=='a') radioButton71.setSelected(true);
        if(Record.inputAnswer[6]=='b') radioButton72.setSelected(true);
    if(Record.inputAnswer[6]=='c') radioButton73.setSelected(true);
    if(Record.inputAnswer[6]=='d') radioButton74.setSelected(true);
     if(Record.inputAnswer[7]=='a') radioButton81.setSelected(true);
    if(Record.inputAnswer[7]=='b') radioButton82.setSelected(true);
    if(Record.inputAnswer[7]=='c') radioButton83.setSelected(true);
    if(Record.inputAnswer[7]=='d') radioButton84.setSelected(true);
         System.out.println("in contoller 4 "+Record.isSubmitted);
    if(Record.isSubmitted==1){
          if(Record.answerCheck[6].equals("a")) checkBox71.setSelected(true);
    if(Record.answerCheck[6].equals("b")) checkBox72.setSelected(true);
    if(Record.answerCheck[6].equals("c")) checkBox73.setSelected(true);
    if(Record.answerCheck[6].equals("d")) checkBox74.setSelected(true);
     if(Record.answerCheck[7].equals("a")) checkBox81.setSelected(true);
    if(Record.answerCheck[7].equals("b")) checkBox82.setSelected(true);
    if(Record.answerCheck[7].equals("c")) checkBox83.setSelected(true);
    if(Record.answerCheck[7].equals("d")) checkBox84.setSelected(true);
    
       }
    }    

    @FXML
    private void page4BackButtonAction(ActionEvent event) throws IOException {
        Parent pane=FXMLLoader.load(getClass().getResource("questionSet_3.fxml"));
        Scene scene=new Scene(pane);
         Stage stage=(Stage)((Node)event.getSource()).getScene().getWindow();
         stage.setScene(scene);
         stage.show();
    }

    @FXML
    private void question7ToggleAction(ActionEvent event) {
        RadioButton selectedRadioButton = (RadioButton) option7.getSelectedToggle();
    String toogleGroupValue = selectedRadioButton.getText();
    Record.inputAnswer[6]=toogleGroupValue.charAt(0);
        
    }

    @FXML
    private void question8ToggleAction(ActionEvent event) {
        RadioButton selectedRadioButton = (RadioButton) option8.getSelectedToggle();
    String toogleGroupValue = selectedRadioButton.getText();
    Record.inputAnswer[7]=toogleGroupValue.charAt(0);
        
    }

    @FXML
    private void page4NextButtonAction(ActionEvent event) throws IOException {
        Parent pane=FXMLLoader.load(getClass().getResource("questionSet_5.fxml"));
        Scene scene=new Scene(pane);
         Stage stage=(Stage)((Node)event.getSource()).getScene().getWindow();
         stage.setScene(scene);
         stage.show();
    }
    
}
