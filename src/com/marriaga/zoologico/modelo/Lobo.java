package com.marriaga.zoologico.modelo;

public class Lobo extends Canino {

    private int numeroCamada;
    private String especieLobo;

    public Lobo(String habitat, double altura, double largo, double peso, String nombreCientifico,
                String color, double tamanoColmillos, int numeroCamada, String especieLobo) {
        super(habitat, altura, largo, peso, nombreCientifico, color, tamanoColmillos);
        this.numeroCamada = numeroCamada;
        this.especieLobo = especieLobo;
    }

    public int getNumeroCamada() {
        return numeroCamada;
    }

    public String getEspecieLobo() {
        return especieLobo;
    }

    @Override
    public String comer() {
        return "El lobo " + this.getColor() + " se alimenta mayormente de pequeñas presas de " +
                this.getHabitat();
    }

    @Override
    public String dormir() {
        return "El lobo " + this.getEspecieLobo() + " duerme en cuevas medianas en mandas de al rededor de " +
                this.getNumeroCamada() + " integrantes";
    }

    @Override
    public String correr() {
        return "El lobo corre con facilidad ya que su peso de " + this.getPeso() + " kg le da gran agilidad";
    }

    @Override
    public String comunicarse() {
        return "A lo largo de su vida, el lobo " + this.getEspecieLobo() + "suele comunicarse con " +
                "otras especies de canino para generar vínculos";
    }
}
