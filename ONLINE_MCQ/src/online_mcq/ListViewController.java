/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package online_mcq;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author lenovo
 */
public class ListViewController implements Initializable {

    @FXML
    private ListView<String> listview;
    @FXML
    private Button back;

    /**
     * Initializes the controller class.
     */
    ObservableList<String> list=FXCollections.observableArrayList();
    @Override
    public void initialize(URL url, ResourceBundle rb) {
      listview.setItems(list);
        try {
            Socket socket=new Socket("localhost",7000);
            System.out.println("entered into port 7000");
            BufferedReader br=new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String str=" ",info="";
            String []s;
            int l1,l2;
           str=br.readLine();
            while(str!=null){
                
                System.out.println(str);
                s=str.split("//");
                l1=s[0].length();
                info=s[0];
                for(int i=0;i<(15-l1);i++)
                    info+=" ";
                l2=s[1].length();
                info+=s[1];
                for(int i=0;i<(15-l2);i++)
                    info+=" ";
                info+=s[2];
                System.out.println(info);
                list.add(info);
                str=br.readLine();
            }
            br.close();
            socket.close();
        } catch (IOException ex) {
            Logger.getLogger(ListViewController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }    

    @FXML
    private void backToMain(ActionEvent event) throws IOException {
        Parent pane=FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
         Scene scene=new Scene(pane);
         Stage stage=(Stage)((Node)event.getSource()).getScene().getWindow();
         stage.setScene(scene);
         stage.show();
    }
    
}
