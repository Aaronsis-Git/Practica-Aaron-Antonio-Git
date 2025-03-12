package org.example;

public class Persona {
    private String nombre = "SinNombre";
    private int edad = 0;
    private double salario = 0.0;

    public Persona(String nombre, int edad, double salario){
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }
    public Persona(){}
    public void datos(String n, int e, double s) {
        this.nombre = n;
        this.edad = e;
        this.salario = s;
    }

    public void mostrar() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Salario: " + salario);
    }

    public String getNombre() {
        return nombre;
    }
    public int getEdad() {
        return edad;
    }
    public double getSalario() {
        return salario;
    }
}
