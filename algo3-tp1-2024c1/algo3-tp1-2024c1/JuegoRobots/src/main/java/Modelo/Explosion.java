package Modelo;

public class Explosion extends Entidad {
    public Explosion(int posicionX, int posicionY) {
        super(posicionX, posicionY);
    }

    // No se mueve
    @Override
    public void mover(Direccion direccion){}
}
