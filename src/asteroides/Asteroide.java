
package asteroides;

import javafx.scene.layout.Pane;
import javafx.scene.shape.Polygon;
import java.util.Random;

public class Asteroide {
    Random rand = new Random();
    private final int resolucionX = 800; //Resolucion ventana eje X
    private final int resolucionY = 400;
    private double  posicionAsteroideX = rand.nextInt(resolucionX);
    private double posicionAsteroideY = rand.nextInt(resolucionY);
    private final double velocidadAsteroideX = rand.nextDouble()*6-3;
    private final double velocidadAsteroideY = rand.nextDouble()*6-3;
    private final Polygon asteroide;
    private double angulo = 0;
    private double velocidadgiro = rand.nextDouble()*5;

    Nave nave;
    public double getPosicionAsteroideX(){
        return posicionAsteroideX;
    }

    public Polygon getAsteroide(){
        return this.asteroide;
    }
    public double getPosicionAsteroideY(){
        return posicionAsteroideY;
    }

public void rotacion() {
        asteroide.setRotate(velocidadgiro);
        angulo = angulo % 360;
    }

public Asteroide(Pane root) {
    asteroide = new Polygon();
    asteroide.getPoints().addAll(new Double[]{
        10.0,20.0,    //1Xinicial 1Yinicial
        -30.0,10.0,   //2Xinicial 2Yinicial
        -10.0,-30.0,  //3XInicial 3Yinicial
        20.0,-10.0,   //4XInicial 4Yinicial
    }); 
       root.getChildren().add(asteroide);

}

public void posicion(){
        asteroide.setLayoutX(posicionAsteroideX);
        asteroide.setLayoutY(posicionAsteroideY);   
    }

public void setLimites() {
    if (posicionAsteroideX >resolucionX) {
            posicionAsteroideX = 0;
        }
        if (posicionAsteroideX < 0) {
            posicionAsteroideX = resolucionX;
        }
        if (posicionAsteroideY <0) {
            posicionAsteroideY = resolucionY;
        }
        if (posicionAsteroideY > resolucionY) {
            posicionAsteroideY = 0;
        }
}
public void movimientoAsteroide() {
    posicionAsteroideX+= velocidadAsteroideX;
    posicionAsteroideY+= velocidadAsteroideY;
}
}
