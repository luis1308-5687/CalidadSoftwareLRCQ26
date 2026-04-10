/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pregunta;

/**
 *
 * @author PC
 */
public class Pregunta {

    public static void main(String[] args) {
     
    }

    public static boolean Validacion(String password) {
        if (password == null || password.isEmpty()) {
            return false;
        }

        if (password.length() < 8) {
            return false;
        }

        boolean Mayuscula = false;
        boolean Numero = false;

        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                Mayuscula = true;
            }
            if (Character.isDigit(c)) {
                Numero = true;
            }
        }

        return Mayuscula && Numero;
    }
}
