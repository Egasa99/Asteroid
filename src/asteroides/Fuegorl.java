/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asteroides;

import javafx.scene.layout.Pane;
import javafx.scene.shape.Polygon;

/**
 *
 * @author 1DAW06
 */
public class Fuegorl {
Nave nave;
private final int posicionFuegorlX = nave.getPosicionNaveX() -3;
private final int posicionFuegorlY = nave.getPosicionNaveY() +10;
private final Polygon fuegorl;

public Fuegorl(Pane root) {
    fuegorl = new Polygon();
    fuegorl.getPoints().addAll(new Double[]{
       -10.0,-4.0, //1Xinicial 1Yinicial
        -10.0,4.0, //2Xinicial 2Yinicial
        -16.0,0.0 }); //3XInicial 3Yinicial   
    root.getChildren().add(fuegorl); 
}
public void posicionfuegorl(){
    fuegorl.setLayoutX(posicionFuegorlX);
    fuegorl.setLayoutY(posicionFuegorlY);
}

}

