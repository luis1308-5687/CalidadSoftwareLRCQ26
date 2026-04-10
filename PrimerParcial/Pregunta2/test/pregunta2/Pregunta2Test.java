package pregunta2;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import org.junit.Test;
import static org.junit.Assert.*;
/**
 *
 * @author PC
 */
public class Pregunta2Test {

    @Test
    public void Positivos() {
        double[] datos = {10, 20, 30, 40};
        assertEquals(25, Pregunta2.Promedio(datos), 0.01);
    }

    @Test
    public void Negativos() {
        double[] datos = {-10, -20, -30, -40};
        assertEquals(-25, Pregunta2.Promedio(datos), 0.01);
    }

    @Test
    public void Mixta() {
        double[] datos = {5, -5, 10, -10};
        assertEquals(0, Pregunta2.Promedio(datos), 0.01);
    }

    @Test
    public void Elemento() {
        double[] datos = {100};
        assertEquals(100, Pregunta2.Promedio(datos), 0.01);
    }

    @Test
    public void Vacia() {
        double[] datos = {};
        assertEquals(0, Pregunta2.Promedio(datos), 0.01);
    }
}