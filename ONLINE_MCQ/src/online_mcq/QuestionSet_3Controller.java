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
public class QuestionSet_3Controller implements Initializable {

    @FXML
    private Label question5;
    @FXML
    private RadioButton radioButton51;
    @FXML
    private ToggleGroup option5;
    @FXML
    private RadioButton radioButton52;
    @FXML
    private RadioButton radioButton53;
    @FXML
    private RadioButton radioButton54;
    @FXML
    private CheckBox checkBox51;
    @FXML
    private CheckBox checkBox52;
    @FXML
    private CheckBox checkBox53;
    @FXML
    private CheckBox checkBox54;
    @FXML
    private Label answer5;
    @FXML
    private Label question6;
    @FXML
    private RadioButton radioButton61;
    @FXML
    private ToggleGroup option6;
    @FXML
    private RadioButton radioButton62;
    @FXML
    private RadioButton radioButton63;
    @FXML
    private RadioButton radioButton64;
    @FXML
    private CheckBox checkBox61;
    @FXML
    private CheckBox checkBox62;
    @FXML
    private CheckBox checkBox63;
    @FXML
    private CheckBox checkBox64;
    @FXML
    private Label answer6;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        question5.setText(Record.question[20]);
        radioButton51.setText(Record.question[21]);
        radioButton52.setText(Record.question[22]);
        radioButton53.setText(Record.question[23]);
        radioButton54.setText(Record.question[24]);
        question6.setText(Record.question[25]);
        radioButton61.setText(Record.question[26]);
        radioButton62.setText(Record.question[27]);
        radioButton63.setText(Record.question[28]);
        radioButton64.setText(Record.question[29]);
       
            if(Record.inputAnswer[4]=='a') radioButton51.setSelected(true);
    if(Record.inputAnswer[4]=='b') radioButton52.setSelected(true);
    if(Record.inputAnswer[4]=='c') radioButton53.setSelected(true);
    if(Record.inputAnswer[4]=='d') radioButton54.setSelected(true);
     if(Record.inputAnswer[5]=='a') radioButton61.setSelected(true);
    if(Record.inputAnswer[5]=='b') radioButton62.setSelected(true);
    if(Record.inputAnswer[5]=='c') radioButton63.setSelected(true);
    if(Record.inputAnswer[5]=='d') radioButton64.setSelected(true);
        System.out.println("in contoller 3 "+Record.isSubmitted);
    if(Record.isSubmitted==1){
          if(Record.answerCheck[4].equals("a")) checkBox51.setSelected(true);
    if(Record.answerCheck[4].equals("b")) checkBox52.setSelected(true);
    if(Record.answerCheck[4].equals("c")) checkBox53.setSelected(true);
    if(Record.answerCheck[4].equals("d")) checkBox54.setSelected(true);
     if(Record.answerCheck[5].equals("a")) checkBox61.setSelected(true);
    if(Record.answerCheck[5].equals("b")) checkBox62.setSelected(true);
    if(Record.answerCheck[5].equals("c")) checkBox63.setSelected(true);
    if(Record.answerCheck[5].equals("d")) checkBox64.setSelected(true);
    
       }
    }    

    @FXML
    private void page3BackButtonAction(ActionEvent event) throws IOException {
        Parent pane=FXMLLoader.load(getClass().getResource("questionSet_2.fxml"));
        Scene scene=new Scene(pane);
         Stage stage=(Stage)((Node)event.getSource()).getScene().getWindow();
         stage.setScene(scene);
         stage.show();
    }

    @FXML
    private void question5ToggleAction(ActionEvent event) {
        RadioButton selectedRadioButton = (RadioButton) option5.getSelectedToggle();
    String toogleGroupValue = selectedRadioButton.getText();
    Record.inputAnswer[4]=toogleGroupValue.charAt(0);
     
    }

    @FXML
    private void question6ToggleAction(ActionEvent event) {
        RadioButton selectedRadioButton = (RadioButton) option6.getSelectedToggle();
    String toogleGroupValue = selectedRadioButton.getText();
    Record.inputAnswer[5]=toogleGroupValue.charAt(0);
    
    }

    @FXML
    private void page3NextButtonAction(ActionEvent event) throws IOException {
        Parent pane=FXMLLoader.load(getClass().getResource("questionSet_4.fxml"));
        Scene scene=new Scene(pane);
         Stage stage=(Stage)((Node)event.getSource()).getScene().getWindow();
         stage.setScene(scene);
         stage.show();
    }
    
}
