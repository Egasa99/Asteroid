/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asteroides;

import java.util.ArrayList;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 *
 * @author 1DAW06
 */
public class Asteroides extends Application {
Nave nave;
Fuegorl fuegorl;
Asteroide asteroide;
    @Override
    public void start(Stage primaryStage) {
       
        // propiedades del panel (pantalla)
        Pane root = new Pane();
        nave = new Nave(root);
        fuegorl = new Fuegorl(root,nave);
        Scene scene = new Scene(root,nave.getResolucionX(), nave.getResolucionY(),Color.WHITE);
        scene.getStylesheets().add("resources/css/css.css");
        primaryStage.setTitle("Asteroides");
        primaryStage.setScene(scene);
        primaryStage.show();
        // propiedades del rectangulo que debe ir debajo del triangulo
 
        //crear lista asteroides
        ArrayList <Asteroide> listaAsteroide = new ArrayList();
            asteroide = new Asteroide(root);
        for (int i=0; i<10; i++) {
            Asteroide asteroide = new Asteroide(root);
            listaAsteroide.add(asteroide);
        }
        
        
AnimationTimer animationPolygon= new AnimationTimer(){
        @Override
    public void handle(long now) {
        System.out.println("angulo " +nave.getAngulo());
        System.out.println("direccionX "+nave.getDireccionX());
        System.out.println("direccionY " +nave.getDireccionY());
        System.out.println("velocidadX " +nave.getVelocidadNaveX());
        System.out.println("velocidadY " +nave.getVelocidadNaveY());
         nave.naveMovimiento();
         nave.mover();
        nave.detectorDeAnguloParaGirar();
        fuegorl.posicionfuegorl();
        
        scene.setOnKeyPressed((KeyEvent event) -> {
            switch(event.getCode()) {
                case LEFT:
                nave.setAngulo1();
                nave.rotacion();
                
                    break;
                
                case RIGHT:
                nave.setAngulo2();
                nave.rotacion();
                
                    break;
                
                case UP:
                nave.setVelocidadNaveX();              
                nave.setVelocidadNaveY();
                nave.naveMovimiento();
                nave.girarRad();
                fuegorl.getPoligonFuegorl().setVisible(false);
            }   
            
            
        });

    }
};
    animationPolygon.start();
    }
}


