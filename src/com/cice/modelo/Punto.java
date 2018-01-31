package com.cice.modelo;

/**
 * @author Javier Bajo Chacon  javier.bajochacon@gmail.com
 *
 * E02Poligon-pret-a-porter
 */
public class Punto {
    private float coordenadaX;
    private float coordenadaY;

    public Punto(float coordenadaX, float coordenadaY) {
        this.coordenadaX = coordenadaX;
        this.coordenadaY = coordenadaY;
    }

    public Punto() {
    }

    public float getCoordenadaX() {
        return coordenadaX;
    }

    public void setCoordenadaX(float coordenadaX) {
        this.coordenadaX = coordenadaX;
    }

    public float getCoordenadaY() {
        return coordenadaY;
    }

    public void setCoordenadaY(float coordenadaY) {
        this.coordenadaY = coordenadaY;
    }
}
