package org.example;
/**
 * @author antonio8 aaron
 * @version version corregida
 */
public class Persona {
    private String nombre = "SinNombre";
    private int edad = 0;
    private double salario = 0.0;

    /**
     *
     * @param nombre recibe nombre porque se espera el nombre de la persona
     * @param edad recibe edad porque se espera la edad de la persona
     * @param salario recibe salario porque se espera el salario de la persona
     */
    public Persona(String nombre, int edad, double salario){
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }
    public Persona(){}

    /**
     *
     * @param n recibe los datos de una persona y se los asigna
     */
    public void datos(String n, int e, double s) {
        this.nombre = n;
        this.edad = e;
        this.salario = s;
    }

    /**
     * muestra los datos de una persona
     */
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
