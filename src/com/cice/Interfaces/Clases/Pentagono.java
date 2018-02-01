package com.cice.Interfaces.Clases;

import com.cice.Interfaces.EnumMateriales;

/**
 * @author Javier Bajo Chacon  javier.bajochacon@gmail.com
 */
public class Pentagono extends Poligono {

    public Pentagono() {
        super();
        this.setSuplemento(0);
    }

    public Pentagono(EnumMateriales material, String temporada, boolean autor) {
        super(material, temporada, autor);
    }

    @Override
    public void coloreaPoligono(String color) {
        if(this.getColor().equals("gris")) {
            if (this.isAutor())
                this.setSuplemento(0.20f);
            else
                this.setSuplemento(0.15f);
            this.setPrecio(this.getPrecio() * (1 + this.getSuplemento()));
            this.setColor(color);
        }
    }



    @Override
    public void quitaColorPoligono() {
        this.setColor("gris");        ;
        this.setPrecio(this.getPrecio()/ (1 + this.getSuplemento()));
        this.setSuplemento(0f);
    }
    @Override
    public String toString() {
        return "Pentagono{" +
                "material=" + this.getMaterial() + '\'' +
                ", color='" + this.getColor() + '\'' +
                ", precio=" + this.getPrecio() + '\'' +
                ", suplemento=" + this.getSuplemento() + "}";
    }

}
