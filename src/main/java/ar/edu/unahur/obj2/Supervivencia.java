package ar.edu.unahur.obj2;

public class Supervivencia extends Entrenamiento {

    public Supervivencia(Alma alma) {
        super(alma);
        alma.setFriolenta(false);
    }

    @Override
    public void setFriolenta(boolean friolenta) {
        super.setFriolenta(false);
    }
}
