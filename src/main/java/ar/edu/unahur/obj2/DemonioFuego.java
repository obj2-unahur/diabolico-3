package ar.edu.unahur.obj2;

public class DemonioFuego extends Demonio {

    public DemonioFuego(int maldad) {
        super(maldad);
    }

    @Override
    protected void atormentar(AlmaSimple alma) {
        alma.setFriolenta(false);
    }

    @Override
    protected boolean puedoCazarlo(AlmaSimple a) {
        return !a.isFriolenta();
    }
}
