package org.example;

/**
 * @author antonio8 aaron
 * @version version corregida
 */
public class CalculadorBono {
    /**
     * @param persona recipe persona de tipo persona para calcular su bono
     */
    static void calcularBono(Persona persona) {
        double bono = 0;
        if (persona.getEdad() > 50) {
            bono = persona.getSalario() * 0.10;
        } else {
            bono = persona.getSalario() * 0.05;
        }
        System.out.println("Bono: " + bono);
    }
}
