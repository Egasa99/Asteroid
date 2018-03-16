package asteroides;

import static java.lang.Math.cos;
import static java.lang.Math.sin;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;

public class Bala {
    private final Polygon Bala;
    private int velocidadBala = 8;
    double direBalaX;
    double direBalaY;
public Bala(Pane root, Nave nave) {
    
    Bala = new Polygon();
    Bala.getPoints().addAll(new Double[]{
        0.0,2.0, //1Xinicial 1Yinicial
        4.0,1.0, //2Xinicial 2Yinicial
        0.0,0.0, //3XInicial 3Yinicial
    });
    Bala.setLayoutX(nave.getPosicionNaveX());
    Bala.setLayoutY(nave.getPosicionNaveY());
    Bala.setFill(Color.RED);
    root.getChildren().add(Bala);
}

public void AnguloBala(Nave nave) {
    double anguloBala = nave.getAngulo();
    direBalaX = velocidadBala*cos(Math.toRadians(anguloBala));
    direBalaY = velocidadBala*sin(Math.toRadians(anguloBala));
}
public void movimientoBala(Nave nave) {
    Bala.setLayoutX(Bala.getLayoutX()+direBalaX);
    Bala.setLayoutY(Bala.getLayoutY()+direBalaY);
}
}