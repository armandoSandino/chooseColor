/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ni.com.tistesoft.colorchoose;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

/**
 *
 * @author Armando
 */
public class Main extends Application {
    
    public void start(Stage stage) throws Exception {
        
        Parent root = FXMLLoader.load(
                getClass()
                .getResource("Choose.fxml")
        );
        Scene scena = new Scene( root );
        stage.setTitle("Color Chooser");
        stage.setScene(scena);
        stage.show();
    }
    
    
    public static void main(String [] args ){
        launch( args);
    }
    
}
