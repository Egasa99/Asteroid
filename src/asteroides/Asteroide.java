
package asteroides;

import javafx.scene.layout.Pane;
import javafx.scene.shape.Polygon;
public class Asteroide {
    private int posicionAsteroideX = 40;
    private int posicionAsteroideY = 40;
    private final double velocidadAsteroide = 10;
    private final Polygon asteroide;
    public double direccionX= 0;
    public double direccionY= 0;
    
    public int getPosicionAsteroideX(){
        return posicionAsteroideX;
    }
    
    public int getPosicionAsteroideY(){
        return posicionAsteroideY;
    }
public Asteroide(Pane root) {
    asteroide = new Polygon();
    asteroide.getPoints().addAll(new Double[]{
        0.0,2.0,    //1Xinicial 1Yinicial
        -3.0,1.0,    //2Xinicial 2Yinicial
         -1.0,-3.0,    //3XInicial 3Yinicial
        2.0,-1.0,    //4XInicial 4Yinicial
    }); 
       root.getChildren().add(asteroide);
    
    
}

public void movimientoAsteroide() {
    posicionAsteroideX+= velocidadAsteroide;
    posicionAsteroideY+= velocidadAsteroide;
}
}

