package com.cice.Interfaces.Clases;

import com.cice.enums.EnumDisenio;
import com.cice.enums.EnumMateriales;

/**
 * @author Javier Bajo Chacon  javier.bajochacon@gmail.com
 */
public class Pentagono extends Poligono {

    public Pentagono() {
        super();
        this.setSuplemento(0);
    }

    public Pentagono(EnumMateriales material, EnumDisenio disenio, String temporada, boolean autor) {
        super(material, disenio, temporada, autor);
    }

    @Override
    public void coloreaPoligono(String color) {
        if(this.getColor().equals("gris")) {
            this.setSuplemento(getDisenio().getIncremento());
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
    @Override
    public void mostrarPrecio() {

    }

    @Override
    public void descripcionProducto() {

    }

}
