package ar.edu.unahur.obj2;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class DiabolicoTest {

    @BeforeMethod
    public void setUp() {
    }

    @Test
    public void entrenamiento() {
        Alma alma = new AlmaSimple(50, 100, true);
        Alma almaEntrenadaSupervivencia = new Supervivencia(alma);
        Alma almaCruzRoja = new CruzRoja(almaEntrenadaSupervivencia);

    }
}