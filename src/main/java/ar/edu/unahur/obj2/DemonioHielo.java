package ar.edu.unahur.obj2;

public class DemonioHielo extends Demonio {

    public DemonioHielo(int maldad) {
        super(maldad);
    }

    @Override
    protected void atormentar(Alma alma) {
        alma.setFriolenta(true);
    }

    @Override
    protected boolean puedoCazarlo(Alma a) {
        return a.isFriolenta();
    }
}
