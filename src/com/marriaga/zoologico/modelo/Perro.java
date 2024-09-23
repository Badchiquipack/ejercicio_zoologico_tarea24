package com.marriaga.zoologico.modelo;

public class Perro extends Canino {

    private int fuerzaMordida;

    public Perro(String habitat, double altura, double largo, double peso, String nombreCientifico,
                 String color, double tamanoColmillos, int fuerzaMordida) {
        super(habitat, altura, largo, peso, nombreCientifico, color, tamanoColmillos);
        this.fuerzaMordida = fuerzaMordida;
    }

    public int getFuerzaMordida() {
        return fuerzaMordida;
    }

    @Override
    public String comer() {
        return "El perro, de nombre cientifico " + this.getNombreCientifico() + " has sido domesticado y requiere" +
                " una alimentación frecuente vigilada por el ser humano";
    }

    @Override
    public String dormir() {
        return "El perro suele dormir entre 8 y 12 horas al dia";
    }

    @Override
    public String correr() {
        return "La velocidad del perro a disminuido ya que su habitat suele ser " + this.getHabitat() + " y no hay mucho que deban hacer";
    }

    @Override
    public String comunicarse() {
        return "Para comunicarse un perro usa su ladrido y su cola";
    }
}
