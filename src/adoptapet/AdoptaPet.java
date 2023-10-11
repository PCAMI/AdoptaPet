/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adoptapet;

import Entidades.Perro;
import Entidades.Persona;


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
public class AdoptaPet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {


        Perro perro1 = new Perro("Tommy", "Mestizo", 6, "Mediano");
        Perro perro2 = new Perro("Nami", "Golden", 1, "Grande");

        Persona persona1 = new Persona("Anderson", "Arevalo", 27, 1012483973);
        Persona persona2 = new Persona("Camila", "Puentes", 27, 1026585159);

        persona1.setPerro(perro1);
        persona2.setPerro(perro2);

        System.out.println(persona1.toString());
        System.out.println(persona2.toString());
    }

}
    
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
//public class AdoptaPet {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        List<Persona> personas = new ArrayList<>();
//        List<Perro> perros = new ArrayList<>();
//
//        // Agregar algunos perros a la lista de perros
//        perros.add(new Perro("Tommy", "Mestizo", 6, "Mediano"));
//        perros.add(new Perro("Nami", "Golden", 1, "Grande"));
//        perros.add(new Perro("Max", "Labrador", 3, "Grande"));
//
//        // Agregar algunas personas a la lista de personas
//        personas.add(new Persona("Anderson", "Arevalo", 27, 1012483973));
//        personas.add(new Persona("Camila", "Puentes", 27, 1026585159));
//        personas.add(new Persona("Juan", "Pérez", 30, 123456789));
//
//        for (Persona persona : personas) {
//            System.out.println(persona.getNombre() + ", ¿qué perro quieres adoptar?");
//            String nombrePerro = scanner.nextLine();
//            Perro perro = buscarPerro(nombrePerro, perros);
//            if (perro == null) {
//                System.out.println("Lo siento, el perro no está disponible.");
//            } else if (perro.isAdoptado()) {
//                System.out.println("Lo siento, el perro ya fue adoptado por otra persona.");
//            } else {
//                persona.setPerro(perro);
//                perro.setAdoptado(true);
//            }
//        }
//
//        // Mostrar todas las personas con sus respectivos perros
//        for (Persona persona : personas) {
//            System.out.println(persona.getNombre() + " adoptó a " + persona.getPerro().getNombre());
//        }
//    }
//
//    private static Perro buscarPerro(String nombre, List<Perro> perros) {
//        for (Perro perro : perros) {
//            if (perro.getNombre().equalsIgnoreCase(nombre)) {
//                return perro;
//            }
//        }
//        return null;
//    }
//}
