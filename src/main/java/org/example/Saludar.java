package org.example;
/**
 * @author antonio8 aaron
 * @version version corregida
 */
public class Saludar {
    /**
     *
     * @param persona recibe persona para obtener su nombre y saludar
     */
    static void imprimirSaludo(Persona persona) {
        if (persona.getEdad() < 18) {
            System.out.println("Hola, joven " + persona.getNombre());
        } else {
            System.out.println("Hola, señor/a " + persona.getNombre());
        }
    }
}
