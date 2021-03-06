package com.cice.Interfaces.Clases;

import com.cice.enums.EnumDisenio;
import com.cice.enums.EnumMateriales;

/**
 * @author Javier Bajo Chacon  javier.bajochacon@gmail.com
 */
public class Hexagono extends Poligono{

    public Hexagono() {
        super();
        this.setSuplemento(0);
    }

    public Hexagono(EnumMateriales material, EnumDisenio disenio, String temporada, boolean autor) {
        super(material,disenio, temporada, autor);
    }
    public Hexagono(String temporada, boolean autor){
        super (temporada, autor);
    }
    @Override
    public void aplicarPorcantaje() {
        this.setSuplemento(getDisenio().getIncremento());
        this.setPrecio(this.getPrecio() * (1 + this.getSuplemento()));
    }

    @Override
    public void eliminarPorcentaje() {
        this.setPrecio(this.getPrecio() / (1 + this.getSuplemento()));
        this.setSuplemento(0f);
    }
    @Override
    public String toString() {
        return "Hexagono{" +
                "material=" + this.getMaterial()+
                ", disenio=" + this.getDisenio() +
                ", precio=" + this.getPrecio() +
                ", suplemento=" + this.getSuplemento()+
                ", temporada='" + this.getTemporada() + '\'' +
                '}';
    }
    @Override
    public void mostrarPrecio() {
        System.out.println("El precio del Hexagono es --> " + this.getPrecio());
    }


    @Override
    public void descripcionProducto() {
        System.out.println("Hexagono{" +
                "material=" + this.getMaterial()+
                ", disenio=" + this.getDisenio() +
                ", precio=" + this.getPrecio() +
                ", suplemento=" + this.getSuplemento()+
                ", temporada='" + this.getTemporada() + '\'' +
                '}');
    }

}
