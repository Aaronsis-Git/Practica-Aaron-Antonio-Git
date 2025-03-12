package org.example;

public class Main {
    public static void main(String[] args) {
        Persona persona=new Persona();

        persona.datos("Juan Perez", 45, 50000);
        persona.mostrar();
        CalculadorBono.calcularBono(persona);

        Saludar.imprimirSaludo(persona);
    }
}
