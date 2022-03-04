/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package ni.com.tistesoft.colorchoose;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.EventType;
import javafx.fxml.Initializable;
//
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

/**
 * FXML Controller class
 *
 * @author Armando
 */
public class ChooseController implements Initializable {

    @javafx.fxml.FXML private javafx.scene.control.Slider redSlider;
    @FXML private Slider greenSlider;
    @FXML private Slider blueSlider;
    @FXML private Slider alphaSlider;
    
    @javafx.fxml.FXML private javafx.scene.control.TextField redTextField;
    @FXML private TextField greenTextField;
    @FXML private TextField blueTextField;
    @FXML private TextField alphaTextField;
    
    @FXML private Rectangle colorRectangle;
    
    private int red = 0;
    private int green = 0;
    private int blue = 0;
    private double alpha = 0.0;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        this.redTextField.textProperty()
                .bind( this.redSlider.valueProperty().asString("%.0f") );
        
        this.greenTextField.textProperty()
                .bind( this.greenSlider.valueProperty().asString("%.0f") );
        
        this.blueTextField.textProperty()
                .bind( this.blueSlider.valueProperty().asString("%.0f") );
        
        this.alphaTextField.textProperty()
                .bind( this.alphaSlider.valueProperty().asString("%.2f") );
        
       
        this.redSlider.valueProperty().addListener(
                new ChangeListener<Number>() {
                    @Override
                    public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue ) {
                        
                        red = newValue.intValue();
                        colorRectangle.setFill( Color.rgb(red, green, blue,alpha ) );
                        
                    }
            }
        );
        
        this.greenSlider.valueProperty().addListener(
                ( observable, oldValue, newValue ) -> { // esto es una expresion(funcion) lambda
                    green = newValue.intValue();
                    colorRectangle.setFill( Color.rgb(red, green, blue,alpha ) );
                }
        );
        
        this.blueSlider.valueProperty().addListener(
                new ChangeListener<Number>() {
                    @Override
                    public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue ) {
                        
                        blue = newValue.intValue();
                        colorRectangle.setFill( Color.rgb(red, green, blue, alpha ) );
                        
                    }
            }
        );
        
        this.alphaSlider.valueProperty()
                .addListener(
                        new ChangeListener<Number> () {
                            @Override
                            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue ) {
                                alpha = newValue.doubleValue();
                                colorRectangle.setFill( Color.rgb(red, green , blue, alpha ));
                            }
                        }
                );
        
        this.colorRectangle.setFill(  Color.rgb(red, green, blue, alpha ) );
    }
}
