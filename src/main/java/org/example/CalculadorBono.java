package org.example;

public class CalculadorBono {
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
