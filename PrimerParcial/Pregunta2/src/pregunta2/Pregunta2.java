/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pregunta2;

/**
 *
 * @author PC
 */
public class Pregunta2 {

    public static void main(String[] args) {

    }

    public static double Promedio(double[] lista) {
        if (lista == null || lista.length == 0) {
            return 0;
        }
        double suma = 0;
        for (double num : lista) {
            suma += num;
        }

        return suma / lista.length;
    }
}
