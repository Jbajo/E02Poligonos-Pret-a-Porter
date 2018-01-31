package com.cice.modelo;

/**
 * @author Javier Bajo Chacon  javier.bajochacon@gmail.com
 */
public class Cuadrilatero extends Poligono {
    @Override
    public void setMaterial(String material) {
        super.setMaterial(material);
    }

    @Override
    public void setPrecio(float precio) {
        super.setPrecio(precio);
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
