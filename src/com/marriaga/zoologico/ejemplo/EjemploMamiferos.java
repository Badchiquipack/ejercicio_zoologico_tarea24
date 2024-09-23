package com.marriaga.zoologico.ejemplo;

import com.marriaga.zoologico.modelo.*;

public class EjemploMamiferos {
    public static void main(String[] args) {

        Mamifero[] mamiferos = new Mamifero[5];

        Mamifero leon = new Leon("Saabana", 1.7, 2, 170, "Panthera Leo",
                10, 45, 5, 5.4);
        Mamifero tigre = new Tigre("Selva", 2, 2.5, 180, "Panthera tigris",
                11, 45, "Bengala");
        Mamifero guepardo = new Guepardo("Saabana", 1.4, 1.7, 110, "Acinonyx jubatus",
                7, 90);
        Mamifero lobo = new Lobo("Desierto", 1.5, 1.7, 97, "Canis lupus baileyi",
                "Gris", 7, 8, "Mexicano");
        Mamifero perro = new Perro("Ciudad", 1, 1.3, 70, "Canis familiaris",
                "Blanco", 5, 50);

        mamiferos[0] = leon;
        mamiferos[1] = tigre;
        mamiferos[2] = guepardo;
        mamiferos[3] = lobo;
        mamiferos[4] = perro;

        for (Mamifero mamifero : mamiferos) {
            System.out.println(mamifero.getClass().getSimpleName());
            System.out.println("Habitat: " + mamifero.getHabitat());
            System.out.println("Altura (m): " + mamifero.getAltura());
            System.out.println("Largo (m): " + mamifero.getLargo());
            System.out.println("Peso (kg): " + mamifero.getPeso());
            System.out.println("Nombre Científico: " + mamifero.getNombreCientifico());

            if (mamifero instanceof Felino) {
                System.out.println("Tamaño de Garras (cm): " + ((Felino) mamifero).getTamanoGarras());
                System.out.println("Velocidad (km/h): " + ((Felino) mamifero).getVelocidad());
                if (mamifero instanceof Leon) {
                    System.out.println("Tamaño de manada: " + ((Leon) mamifero).getNumeroManada());
                    System.out.println("Potencia de rugido en decibeles: " + ((Leon) mamifero).getPotenciaRugido());
                }
                if (mamifero instanceof Tigre) {
                    System.out.println("Especie: " + ((Tigre) mamifero).getEspecie());
                }
            }

            if (mamifero instanceof Canino) {
                System.out.println("Tamaño de colmillos (cm): " + ((Canino) mamifero).getTamanoColmillos());
                System.out.println("Color: " + ((Canino) mamifero).getColor());
                if (mamifero instanceof Lobo) {
                    System.out.println("Especie: " + ((Lobo) mamifero).getEspecieLobo());
                    System.out.println("Tamaño de jauría: " + ((Lobo) mamifero).getNumeroCamada());
                }
                if (mamifero instanceof Perro) {
                    System.out.println("Fuerza de mordida (psi): " + ((Perro) mamifero).getFuerzaMordida());
                }
            }

            System.out.println(mamifero.comer());
            System.out.println(mamifero.dormir());
            System.out.println(mamifero.correr());
            System.out.println(mamifero.comunicarse());
            System.out.println();
        }
    }

}
