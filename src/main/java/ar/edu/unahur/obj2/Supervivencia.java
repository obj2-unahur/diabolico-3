package ar.edu.unahur.obj2;

public class Supervivencia extends Entrenamiento {

    public Supervivencia(Alma alma) {
        super(alma);
    }

    @Override
    public boolean isFriolenta() {
        return false;
    }
}
