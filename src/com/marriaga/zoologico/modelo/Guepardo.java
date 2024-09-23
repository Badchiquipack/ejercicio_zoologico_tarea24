package com.marriaga.zoologico.modelo;

public class Guepardo extends Felino {

    public Guepardo(String habitat, double altura, double largo, double peso,
                    String nombreCientifico, double tamanoGarras, int velocidad) {
        super(habitat, altura, largo, peso, nombreCientifico, tamanoGarras, velocidad);
    }

    @Override
    public String comer() {
        return "El guepardo, también conocido como " + this.getNombreCientifico() +
                " caza una vez a la semana para alimentarse";
    }

    @Override
    public String dormir() {
        return "El guepardo puede dormir en lugares pequeños ya que tiene una altura aproximada de "+
                this.getAltura()+" m en su etapa adulta";
    }

    @Override
    public String correr() {
        return "El guepardo es considerado uno de los seres más veloces en el planeta ya que" +
                "puede correr a una velocidad de hasta "+this.getVelocidad()+" km/h";
    }

    @Override
    public String comunicarse() {
        return "El guepardo suele comunicarse con los miembros de su manada para realizar caza en grupo";
    }
}
