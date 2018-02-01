package com.cice.Interfaces.Clases;

import com.cice.Interfaces.EnumMateriales;

/**
 * @author Javier Bajo Chacon  javier.bajochacon@gmail.com
 */
public class Cuadrilatero extends Poligono {

    public Cuadrilatero() {
        super();
        this.setSuplemento(0);
    }

    public Cuadrilatero(EnumMateriales material, float precio, String temporada, boolean autor) {
        super(material, precio, temporada, autor);
    }

    @Override
    public void coloreaPoligono(String color) {
        this.setColor(color);
        if(this.isAutor())
            this.setSuplemento(0.20f);
        else
            this.setSuplemento(0.15f);
        this.setPrecio(this.getPrecio()* (1 + this.getSuplemento()));
    }


    @Override
    public String toString() {
        return "Cuadrilatero{" +
                "material=" + this.getMaterial() + '\'' +
                ", color='" + this.getColor() + '\'' +
                ", precio=" + this.getPrecio() +'\'' +
                ", suplemento=" + this.getSuplemento() + "}";
    }

}
