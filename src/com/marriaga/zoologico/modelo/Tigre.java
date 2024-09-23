package com.marriaga.zoologico.modelo;

public class Tigre extends Felino {

    private String especie;

    public Tigre(String habitat, double altura, double largo, double peso, String nombreCientifico,
                 double tamanoGarras, int velocidad, String especie) {
        super(habitat, altura, largo, peso, nombreCientifico, tamanoGarras, velocidad);
        this.especie = especie;
    }

    public String getEspecie() {
        return especie;
    }

    @Override
    public String comer() {
        return "El tigre puede cazar presas fácilmente para poder comer gracias a sus garras de casi " +
                this.getTamanoGarras() + " cm";
    }

    @Override
    public String dormir() {
        return "El tigre puede alcanzar las ramas de los árboles para dormir ya que tiene un largo de " +
                "aproximadamente "+ this.getLargo()+ " m";
    }

    @Override
    public String correr() {
        return "El tigre es capaz de alcanzar velocidades de hasta "+this.getVelocidad()+
                " km/h";
    }

    @Override
    public String comunicarse() {
        return "El tigre "+this.getEspecie()+ " en especial, solo se comunica con miembros de su manada";
    }
}
