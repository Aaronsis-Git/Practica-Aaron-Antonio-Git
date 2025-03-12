package org.example;

public class Saludar {
    static void imprimirSaludo(Persona persona) {
        if (persona.getEdad() < 18) {
            System.out.println("Hola, joven " + persona.getNombre());
        } else {
            System.out.println("Hola, señor/a " + persona.getNombre());
        }
    }
}
