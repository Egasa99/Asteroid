package asteroides;

import javafx.scene.shape.Polygon;
import static java.lang.Math.cos;
import static java.lang.Math.sin;
import javafx.scene.Group;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

public class Nave {
    Group formNave = new Group();
    private int posicionNaveX = 400;
    private int posicionNaveY = 300;
    private double angulo = 0;
    private double velocidadNaveX = 0.0;
    private double velocidadNaveY = 0.0;
    private final int velocidadgiro = 15;
    private final double angulodireccion = 0;
    
    public double direccionX= 0;
    public double direccionY= 0;
    private final Polygon polygon;
    public final Polygon fuegorl;
    private final int resolucionX = 800; //Resolucion ventana eje X
    private final int resolucionY = 400; // Resolucion ventana eje Y


    public Nave(Pane root) {
    polygon = new Polygon();
    polygon.getPoints().addAll(new Double[]{
       -10.0,5.0, //1Xinicial 1Yinicial
        10.0,0.0, //2Xinicial 2Yinicial
        -10.0,-5.0 }); //3XInicial 3Yinicial
    fuegorl = new Polygon();
    fuegorl.setFill(Color.LAWNGREEN);
    fuegorl.getPoints().addAll(new Double[]{
       -10.0,-4.0, //1Xinicial 1Yinicial
        -10.0,4.0, //2Xinicial 2Yinicial
        -20.0,0.0 }); //3XInicial 3Yinicial 
    fuegorl.setLayoutX(polygon.getLayoutX()-2);
    fuegorl.setLayoutY(polygon.getLayoutY());
    fuegorl.setVisible(false);
    formNave.getChildren().add(fuegorl);
    formNave.getChildren().add(polygon);
    root.getChildren().add(formNave);
}

    public void rotacion() {
        formNave.setRotate(angulo);
    }
    
    public int getResolucionX() {
        return resolucionX;
}   
    
    public int getResolucionY() {
        return resolucionY;
}
    
    public int getPosicionNaveX() {
        return posicionNaveX;
    } 
    
    public int getPosicionNaveY() {
        return posicionNaveY;
    }

    public void setAngulo1() {
    angulo -= velocidadgiro;
    }
    
    public void setAngulo2() {
    angulo += velocidadgiro;
    }
    
    public double getAngulo() {
        return angulo;
    }
    
    public double getVelocidadNaveX() {
        return velocidadNaveX;
    }
    // aumenta velocidadX
    public void setVelocidadNaveX() {
        velocidadNaveX += 1.0;
    
    }

    public double getVelocidadNaveY() {
        return velocidadNaveY;
    }
    // aumenta velocidadY
    public void setVelocidadNaveY() {
        velocidadNaveY += 1.0;
    }
    
    public int getVelocidadgiro() {
        return velocidadgiro;
    }
    
    public double getAngulodireccion() {
        return angulodireccion;
    }
    
    public double getDireccionX() {
        return direccionX;
    }
    
    public double getDireccionY() {
        return direccionY;
    }    

    // detecta si la nave esta en los bordes y los transporta al contrario
    public void mover() {
        if (posicionNaveX >resolucionX) {
            posicionNaveX = 0;
        }
        if (posicionNaveX < 0) {
            posicionNaveX = resolucionX;
        }
        if (posicionNaveY <0) {
            posicionNaveY = resolucionY;
        }
        if (posicionNaveY > resolucionY) {
            posicionNaveY = 0;
        }
        
        if (velocidadNaveX >4) {
        velocidadNaveX = 4;    
        }
        
        if (velocidadNaveY >4) {
        velocidadNaveY = 4;    
        }
        
        //if (velocidadNaveX <0) {
        //velocidadNaveX = 0;
        //}
        
        //if (velocidadNaveY <0) {
        //velocidadNaveY = 0;
        //}

        if (angulo == 360) {
        angulo = 0;
        }
        
        if (angulo == -360) {
        angulo = 0;
        }
        }
    //permite el libre movimiento de la nave. 
    public void detectorDeAnguloParaGirar(){
        formNave.setLayoutX(posicionNaveX);
        formNave.setLayoutY(posicionNaveY);   
    }

    public void girarRad() {
        angulo = angulo % 360;
        direccionX = cos(Math.toRadians(angulo));
        direccionY = sin(Math.toRadians(angulo));
    }

    public void naveMovimiento(){
    posicionNaveX+= velocidadNaveX*(direccionX);
    posicionNaveY+= velocidadNaveY*(direccionY);
    System.out.println("velocidad*direccionX " + (velocidadNaveX*direccionX));
        System.out.println("velocidad*direccionY "+ (velocidadNaveY*direccionY));
    }

}