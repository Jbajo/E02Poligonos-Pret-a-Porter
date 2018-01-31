package com.cice.modelo;

import com.cice.Interfaces.EnumMateriales;

import java.util.ArrayList;

/**
 * @author Javier Bajo Chacon  javier.bajochacon@gmail.com
 */
public class Cuadrilatero extends Poligono {

    public Cuadrilatero() {
        super();
        this.setSuplemento(0);
    }

    public Cuadrilatero(EnumMateriales material, float precio, String temporada) {
        super(material, precio, temporada);
    }

    @Override
    public void coloreaPoligono(String color) {
            this.color = color;
            this.setSuplemento(0.15f);
            this.precio *= (1 + this.suplemento);
            this.coloreado = true;
    }

    @Override
    public void quitaColorPoligono() {
        this.coloreado = false;
        this.precio /= (1 + this.suplemento);
        this.suplemento = 0;
        this.color = "gris";
    }
    @Override
    public String toString() {
        return "Cuadrilatero{" +
                "material=" + material + '\'' +
                ", color='" + color + '\'' +
                ", precio=" + precio +'\'' +
                ", suplemento=" + suplemento + "}";
    }

}
