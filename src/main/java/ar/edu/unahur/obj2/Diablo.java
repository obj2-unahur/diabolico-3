package ar.edu.unahur.obj2;

import java.util.List;

public class Diablo {

    private List<Demonio> demonios;

    public Diablo(List<Demonio> demonios) {
        this.demonios = demonios;
    }

    public void enviarACazar(Demonio demonio, Lugar lugar) {
        demonio.cazar(lugar);
    }
}
