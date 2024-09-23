package com.marriaga.zoologico.modelo;

public class Leon extends Felino {

    private int numeroManada;
    private double potenciaRugido;

    public Leon(String habitat, double altura, double largo, double peso, String nombreCientifico,
                double tamanoGarras, int velocidad, int numeroManada, double potenciaRugido) {
        super(habitat, altura, largo, peso, nombreCientifico, tamanoGarras, velocidad);
        this.numeroManada = numeroManada;
        this.potenciaRugido = potenciaRugido;
    }

    public int getNumeroManada() {
        return numeroManada;
    }

    public double getPotenciaRugido() {
        return potenciaRugido;
    }

    @Override
    public String comer() {
        return "La hembra de león caza para alimentar a los "+ this.getNumeroManada() +
                "miembros de su manada.";
    }

    @Override
    public String dormir() {
        return "El leon africano puede dormir hasta 12 horas";
    }

    @Override
    public String correr() {
        return "El león corre a una velocidad de hasta "+this.getVelocidad()+" km/h";
    }

    @Override
    public String comunicarse() {
        return "Gracias a su rugido de "+this.getPotenciaRugido()+ " decibeles el león puede comunicarse a distancia";
    }
}
