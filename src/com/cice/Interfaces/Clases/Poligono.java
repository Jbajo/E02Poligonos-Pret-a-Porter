package com.cice.Interfaces.Clases;

import com.cice.Interfaces.EnumMateriales;
import com.cice.Interfaces.IPoligono;

import java.util.ArrayList;

/**
 * @author Javier Bajo Chacon  javier.bajochacon@gmail.com
 *
 * E02Poligon-pret-a-porter
 */
public abstract class Poligono implements IPoligono {
    private EnumMateriales material;
    private String color;
    private float precio;
    private ArrayList<Punto> listaVertices;
    private float suplemento;
    private String temporada;
    private boolean autor;


    public Poligono(EnumMateriales material, float precio, ArrayList<Punto> listaVertices, String temporada, boolean autor) {
        this.material = material;
        this.precio = precio;
        this.color = "gris";
        this.listaVertices = listaVertices;
        this.suplemento=0f;
        this.autor=autor;
        this.temporada = temporada;
    }


    public Poligono(EnumMateriales material, float precio, String temporada, boolean autor) {
        this.material = material;
        this.precio = precio;
        this.color = "gris";
        this.listaVertices = new ArrayList<>();
        this.suplemento=0f;
        this.autor=autor;
        this.temporada = temporada;
    }

    public Poligono() {
        this.listaVertices = new ArrayList<>();
        this.color="gris";
        this.autor=false;
    }

    public boolean isAutor() {
        return autor;
    }

    public void setAutor(boolean autor) {
        this.autor = autor;
    }

    public void setMaterial(EnumMateriales material) {
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getPrecio(){
        return this.precio;
    }


    public EnumMateriales getMaterial(){
        return this.material;

    }

    public String getTemporada() {
        return temporada;
    }

    public void setTemporada(String temporada) {
        this.temporada = temporada;
    }

    public float getSuplemento() {
        return suplemento;
    }

    public void setSuplemento(float suplemento) {
        this.suplemento = suplemento;
    }

    public ArrayList<Punto> getListaVertices() {
        return listaVertices;
    }

    public void setListaVertices(ArrayList<Punto> listaVertices) {
        this.listaVertices = listaVertices;
    }

    public int devuelveVertices(){
        int i = 0;
        for(Punto p : listaVertices){
            i++;
        }
        return i;
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

   public void setPrecio(float precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Poligono{" +
                "material=" + material + '\'' +
                ", color='" + color + '\'' +
                ", precio=" + precio +'\'' +
                ", suplemento=" + suplemento + "}";
    }


}
