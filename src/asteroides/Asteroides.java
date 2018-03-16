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
Bala bala;
Asteroide asteroide;
    @Override
    public void start(Stage primaryStage) {
       
        Pane root = new Pane();
        nave = new Nave(root);
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
        
        ArrayList <Bala> listaBala = new ArrayList();
  
AnimationTimer animationPolygon= new AnimationTimer(){
        @Override
    public void handle(long now) {
        System.out.println("angulo " +nave.getAngulo());
        System.out.println("direccionX "+nave.getDireccionX());
        System.out.println("direccionY " +nave.getDireccionY());
        System.out.println("velocidadX " +nave.getVelocidadNaveX());
        System.out.println("velocidadY " +nave.getVelocidadNaveY());
        
        asteroide.movimientoAsteroide();
        nave.naveMovimiento();
        nave.mover();
        nave.detectorDeAnguloParaGirar();
        
        for (int i=0; i<listaBala.size(); i++){
            bala = listaBala.get(i);
            bala.movimientoBala(nave);
        }
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
                    nave.fuegorl.setVisible(true);
                break;
                
                case SPACE:
                bala = new Bala(root , nave);
                bala.AnguloBala(nave);
                listaBala.add(bala);
            }

            
            
        });

    }
};
    animationPolygon.start();
    }
}


