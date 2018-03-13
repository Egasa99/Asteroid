package asteroides;

import javafx.scene.layout.Pane;
import javafx.scene.shape.Polygon;

public class Bala {
    private final Polygon Bala;
    

public Bala(Pane root) {
    Bala = new Polygon();
    Bala.getPoints().addAll(new Double[]{
        0.0,1.0, //1Xinicial 1Yinicial
        2.0,0.5, //2Xinicial 2Yinicial
        0.0,0.0, //3XInicial 3Yinicial
    });
    root.getChildren().add(Bala);
}
}