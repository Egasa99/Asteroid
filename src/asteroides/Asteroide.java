
package asteroides;

import javafx.scene.layout.Pane;
import javafx.scene.shape.Polygon;
public class Asteroide {
    private int posicionAsteroideX = 100;
    private int posicionAsteroideY = 100;
    private double velocidadAsteroide = 10;
    private Polygon asteroide;
    
    public int getPosicionAsteroideX(){
        return posicionAsteroideX;
    }
    
    public int getPosicionAsteroideY(){
        return posicionAsteroideY;
    }
public Asteroide(Pane root) {
    asteroide = new Polygon();
    asteroide.getPoints().addAll(new Double[]{
        -10.0,60.0,    //1Xinicial 1Yinicial
        -20.0,40.0,    //2Xinicial 2Yinicial
         20.5,10.0,    //3XInicial 3Yinicial
        20.0,-20.0,    //4XInicial 4Yinicial
       -20.0,-20.0,    //5XInicial 5Yinicial
        -40.0,20.0 }); //6XInicial 6Yinicial
       root.getChildren().add(asteroide);
    
    
}

public void movimientoAsteroide() {
    posicionAsteroideX+= velocidadAsteroide;
    posicionAsteroideY+= velocidadAsteroide;
}
}

