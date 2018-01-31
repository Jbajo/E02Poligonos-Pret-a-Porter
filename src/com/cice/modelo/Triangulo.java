package com.cice.modelo;

import com.cice.Interfaces.EnumMateriales;

/**
 * @author Javier Bajo Chacon  javier.bajochacon@gmail.com
 */
public class Triangulo extends Poligono {

    public Triangulo() {
        super();
        this.setSuplemento(0);
    }

    public Triangulo(EnumMateriales material, float precio, String temporada) {
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
        return "Triangulo{" +
                "material=" + material + '\'' +
                ", color='" + color + '\'' +
                ", precio=" + precio +'\'' +
                ", suplemento=" + suplemento + "}";
    }


}
