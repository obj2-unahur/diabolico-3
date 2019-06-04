package ar.edu.unahur.obj2;

public class DemonioHielo extends Demonio {

    public DemonioHielo(int maldad) {
        super(maldad);
    }

    @Override
    protected void atormentar(AlmaSimple alma) {
        alma.setFriolenta(true);
    }

    @Override
    protected boolean puedoCazarlo(AlmaSimple a) {
        return a.isFriolenta();
    }
}
