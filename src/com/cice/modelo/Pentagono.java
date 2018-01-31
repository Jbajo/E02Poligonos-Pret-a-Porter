package com.cice.modelo;

import com.cice.Interfaces.EnumMateriales;

/**
 * @author Javier Bajo Chacon  javier.bajochacon@gmail.com
 */
public class Pentagono extends Poligono {

    public Pentagono() {
        super();
        this.setSuplemento(0);
    }

    public Pentagono(EnumMateriales material, float precio, String temporada) {
        super(material, precio, temporada);
    }
    @Override
    public void coloreaPoligono(String color) {
        this.color = color;
        this.setSuplemento(0.20f);
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
        return "Pentagono{" +
                "material=" + material + '\'' +
                ", color='" + color + '\'' +
                ", precio=" + precio +'\'' +
                ", suplemento=" + suplemento + "}";
    }

}
