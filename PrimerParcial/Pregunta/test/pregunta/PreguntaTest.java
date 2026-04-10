/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

package pregunta;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author PC
 */
public class PreguntaTest {

    @Test
    public void contraValida() {
        assertTrue(Pregunta.Validacion("Password1"));
    }

    @Test
    public void sinMayuscula() {
        assertFalse(Pregunta.Validacion("password1"));
    }

    @Test
    public void sinNumero() {
        assertFalse(Pregunta.Validacion("Password"));
    }

    @Test
    public void muyCorta() {
        assertFalse(Pregunta.Validacion("Pasw1"));
    }

    @Test
    public void Vacia() {
        assertFalse(Pregunta.Validacion(""));
    }
}