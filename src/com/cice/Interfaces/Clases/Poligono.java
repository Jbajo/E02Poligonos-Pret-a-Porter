package com.cice.Interfaces.Clases;

import com.cice.enums.EnumDisenio;
import com.cice.enums.EnumMateriales;
import com.cice.Interfaces.IPoligono;

import java.util.ArrayList;

/**
 * @author Javier Bajo Chacon  javier.bajochacon@gmail.com
 *
 * E02Poligon-pret-a-porter
 */
public abstract class Poligono implements IPoligono {
    private EnumMateriales material;
    private EnumDisenio disenio;
    private String color;
    private float precio;
    private ArrayList<Punto> listaVertices;
    private float suplemento;
    private String temporada;
    private boolean autor;


    protected Poligono(EnumMateriales material, EnumDisenio disenio, ArrayList<Punto> listaVertices, String temporada, boolean autor) {
        this.material = material;
        this.disenio=disenio;
        this.precio = material.getPrecio();
        this.color = "gris";
        this.listaVertices = listaVertices;
        this.suplemento=0f;
        this.autor=autor;
        this.temporada = temporada;
    }

    protected Poligono (String temporada, boolean autor){
        this.temporada=temporada;
        this.autor=autor;

    }
    protected Poligono(EnumMateriales material, EnumDisenio disenio, String temporada, boolean autor) {
        this.material = material;
        this.disenio=disenio;
        this.precio = material.getPrecio();
        this.color = "gris";
        this.listaVertices = new ArrayList<>();
        this.suplemento=0f;
        this.autor=autor;
        this.temporada = temporada;
    }

    protected void setDisenio(EnumDisenio disenio) {
        this.disenio = disenio;
    }

    protected EnumDisenio getDisenio() {
        return disenio;
    }

    protected Poligono() {
        this.listaVertices = new ArrayList<>();
        this.color="gris";
        this.autor=false;

    }

    protected boolean isAutor() {
        return autor;
    }

    protected void setAutor(boolean autor) {
        this.autor = autor;
    }

    protected void setMaterial(EnumMateriales material) {
        this.material = material;
    }

    protected String getColor() {
        return color;
    }

    protected void setColor(String color) {
        this.color = color;
    }

    protected float getPrecio(){
        return this.precio;
    }


    protected EnumMateriales getMaterial(){
        return this.material;

    }

    protected String getTemporada() {
        return temporada;
    }

    protected void setTemporada(String temporada) {
        this.temporada = temporada;
    }

    protected float getSuplemento() {
        return suplemento;
    }

    protected void setSuplemento(float suplemento) {
        this.suplemento = suplemento;
    }

    protected ArrayList<Punto> getListaVertices() {
        return listaVertices;
    }

    protected void setListaVertices(ArrayList<Punto> listaVertices) {
        this.listaVertices = listaVertices;
    }

    public boolean aniadirCoordenada (float x, float y){
        if(listaVertices.size()>0) {
            for (Punto punto : listaVertices) {
                if (!(x == punto.getCoordenadaX() && y == punto.getCoordenadaY())) {
                    Punto p = new Punto(x, y);
                    listaVertices.add(p);
                    return true;
                } else if ((!(y == punto.getCoordenadaX() && x == punto.getCoordenadaY()))) {
                    Punto p = new Punto(y, x);
                    listaVertices.add(p);
                    return true;
                }
            }
        }
        else{
            Punto p = new Punto(y, x);
            listaVertices.add(p);
            return true;
        }
        return false;
    }

   protected void setPrecio(float precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Poligono{" +
                "material=" + material +
                ", disenio=" + disenio +
                ", precio=" + precio +
                ", suplemento=" + suplemento +
                ", temporada='" + temporada + '\'' +
                '}';
    }
}
