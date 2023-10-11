/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 * Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a
 * contar de dos clases. Perro, que tendrá como atributos: nombre, raza, edad y
 * tamaño; y la clase Persona con atributos: nombre, apellido, edad, documento y
 * Perro. Ahora deberemos en el main crear dos Personas y dos Perros. Después,
 * vamos a tener que pensar la lógica necesaria para asignarle a cada Persona un
 * Perro y por ultimo, mostrar desde la clase Persona, la información del Perro
 * y de la Persona
 *
 * @author kamil
 */
public class Persona {

    private String nombre;
    private String apellido;
    private int edad;
    private double documento;
    private Perro perro;

   

    public Persona(String nombre, String apellido, int edad, double documento ) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.documento = documento;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getDocumento() {
        return documento;
    }

    public void setDocumento(double documento) {
        this.documento = documento;
    }

    public Perro getPerro() {
        return perro;
    }

    public void setPerro(Perro perro) {
        this.perro = perro;
    }

    public String toString() {
        return "Nombre: " + this.nombre + " " + this.apellido + "\n"
                + "Edad: " + this.edad + "\n"
                + "Documento: " + this.documento + "\n"
                + "Perro: " + this.perro.getNombre() + ", "
                + this.perro.getRaza() + ", "
                + this.perro.getEdad() + " años, "
                + this.perro.getTamano();
    }
}
// private String nombre;
//    private String apellido;
//    private int edad;
//    private double documento;
//    private Perro perro;
//
//    public Persona(String nombre, String apellido, int edad, double documento) {
//        this.nombre = nombre;
//        this.apellido = apellido;
//        this.edad = edad;
//        this.documento = documento;
//    }
//
//    public String getNombre() {
//        return nombre;
//    }
//
//    public void setNombre(String nombre) {
//        this.nombre = nombre;
//    }
//
//    public String getApellido() {
//        return apellido;
//    }
//
//    public void setApellido(String apellido) {
//        this.apellido = apellido;
//    }
//
//    public int getEdad() {
//        return edad;
//    }
//
//    public void setEdad(int edad) {
//        this.edad = edad;
//    }
//
//    public double getDocumento() {
//        return documento;
//    }
//
//    public void setDocumento(double documento) {
//        this.documento = documento;
//    }
//
//    public Perro getPerro() {
//        return perro;
//    }
//
//    public void setPerro(Perro perro) {
//        this.perro = perro;
//    }
//}