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
public class QuestionSet_2Controller implements Initializable {

    @FXML
    private Label question3;
    @FXML
    private RadioButton radioButton31;
    @FXML
    private ToggleGroup option3;
    @FXML
    private RadioButton radioButton32;
    @FXML
    private RadioButton radioButton33;
    @FXML
    private RadioButton radioButton34;
    @FXML
    private CheckBox checkBox31;
    @FXML
    private CheckBox checkBox32;
    @FXML
    private CheckBox checkBox33;
    @FXML
    private CheckBox checkBox34;
    @FXML
    private Label answer3;
    @FXML
    private Label question4;
    @FXML
    private RadioButton radioButton41;
    @FXML
    private ToggleGroup option4;
    @FXML
    private RadioButton radioButton42;
    @FXML
    private RadioButton radioButton43;
    @FXML
    private RadioButton radioButton44;
    @FXML
    private CheckBox checkBox41;
    @FXML
    private CheckBox checkBox42;
    @FXML
    private CheckBox checkBox43;
    @FXML
    private CheckBox checkBox44;
    @FXML
    private Label answer4;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        question3.setText(Record.question[10]);
        radioButton31.setText(Record.question[11]);
        radioButton32.setText(Record.question[12]);
        radioButton33.setText(Record.question[13]);
        radioButton34.setText(Record.question[14]);
        question4.setText(Record.question[15]);
        radioButton41.setText(Record.question[16]);
        radioButton42.setText(Record.question[17]);
        radioButton43.setText(Record.question[18]);
        radioButton44.setText(Record.question[19]);
        
            if(Record.inputAnswer[3]=='a') radioButton41.setSelected(true);
    if(Record.inputAnswer[3]=='b') radioButton42.setSelected(true);
    if(Record.inputAnswer[3]=='c') radioButton43.setSelected(true);
    if(Record.inputAnswer[3]=='d') radioButton44.setSelected(true);
    if(Record.inputAnswer[2]=='a') radioButton31.setSelected(true);
    if(Record.inputAnswer[2]=='b') radioButton32.setSelected(true);
    if(Record.inputAnswer[2]=='c') radioButton33.setSelected(true);
    if(Record.inputAnswer[2]=='d') radioButton34.setSelected(true);
       System.out.println("in contoller 2 "+Record.isSubmitted); 
    if(Record.isSubmitted==1){
          if(Record.answerCheck[2].equals("a")) checkBox31.setSelected(true);
    if(Record.answerCheck[2].equals("b")) checkBox32.setSelected(true);
    if(Record.answerCheck[2].equals("c")) checkBox33.setSelected(true);
    if(Record.answerCheck[2].equals("d")) checkBox34.setSelected(true);
     if(Record.answerCheck[3].equals("a")) checkBox41.setSelected(true);
    if(Record.answerCheck[3].equals("b")) checkBox42.setSelected(true);
    if(Record.answerCheck[3].equals("c")) checkBox43.setSelected(true);
    if(Record.answerCheck[3].equals("d")) checkBox44.setSelected(true);
    
       }
    }    

    @FXML
    private void page2BackButtonAction(ActionEvent event) throws IOException {
        Parent pane=FXMLLoader.load(getClass().getResource("questionSet_1.fxml"));
        Scene scene=new Scene(pane);
         Stage stage=(Stage)((Node)event.getSource()).getScene().getWindow();
         stage.setScene(scene);
         stage.show();
    }

    @FXML
    private void question3ToggleAction(ActionEvent event) {
        RadioButton selectedRadioButton = (RadioButton) option3.getSelectedToggle();
    String toogleGroupValue = selectedRadioButton.getText();
    Record.inputAnswer[2]=toogleGroupValue.charAt(0);
    
    }

    @FXML
    private void question4ToggleAction(ActionEvent event) {
        RadioButton selectedRadioButton = (RadioButton) option4.getSelectedToggle();
    String toogleGroupValue = selectedRadioButton.getText();
    Record.inputAnswer[3]=toogleGroupValue.charAt(0);
     
    }

    @FXML
    private void page2NextButtonAction(ActionEvent event) throws IOException {
        Parent pane=FXMLLoader.load(getClass().getResource("questionSet_3.fxml"));
        Scene scene=new Scene(pane);
         Stage stage=(Stage)((Node)event.getSource()).getScene().getWindow();
         stage.setScene(scene);
         stage.show();
    }
    
}
