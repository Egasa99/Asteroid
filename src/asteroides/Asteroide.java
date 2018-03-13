
package asteroides;

import javafx.scene.layout.Pane;
import javafx.scene.shape.Polygon;
public class Asteroide {
    private int posicionAsteroideX = 100;
    private int posicionAsteroideY = 100;
    private double velocidadAsteroideX = 1;
    private double velocidadAsteroideY = 1;
    private double anguloAsteroide = 0;
    private Polygon asteroide;
    
public Asteroide(Pane root) {
    asteroide = new Polygon();
    asteroide.getPoints().addAll(new Double[]{
        -1.0,6.0,    //1Xinicial 1Yinicial
        -2.0,4.0,    //2Xinicial 2Yinicial
         2.5,1.0,    //3XInicial 3Yinicial
        2.0,-2.0,    //4XInicial 4Yinicial
       -2.0,-2.0,    //5XInicial 5Yinicial
        -4.0,2.0 }); //6XInicial 6Yinicial
       root.getChildren().add(asteroide);
    
    
}
}
