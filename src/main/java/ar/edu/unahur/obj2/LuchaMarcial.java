package ar.edu.unahur.obj2;

public class LuchaMarcial extends Entrenamiento {
    public LuchaMarcial(Alma alma) {
        super(alma);
    }

    @Override
    public int getValor() {
        return super.getValor()*2;
    }
}
