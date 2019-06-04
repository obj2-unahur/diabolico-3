package ar.edu.unahur.obj2;

public class DemonioSombra extends Demonio {

    public DemonioSombra(int maldad) {
        super(maldad);
    }

    @Override
    protected void atormentar(AlmaSimple alma) {
        alma.setValor(alma.getValor()/2);
    }

    @Override
    protected boolean puedoCazarlo(AlmaSimple a) {
        return a.getValor() < 50;
    }
}
