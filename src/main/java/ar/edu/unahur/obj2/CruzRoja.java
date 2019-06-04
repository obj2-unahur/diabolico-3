package ar.edu.unahur.obj2;

public class CruzRoja extends Entrenamiento {
    public CruzRoja(Alma alma) {
        super(alma);
    }

    @Override
    public int getBondad() {
        int bondadActual = super.getBondad();
        return bondadActual < 100 ? 100 : bondadActual;
    }
}
