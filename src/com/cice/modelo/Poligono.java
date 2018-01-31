package com.cice.modelo;

import java.util.ArrayList;

/**
 * @author Javier Bajo Chacon  javier.bajochacon@gmail.com
 *
 * E02Poligon-pret-a-porter
 */
public abstract class Poligono implements IPoligono {
    protected String material;
    protected String color;
    protected float precio;
    protected ArrayList<Punto> listaVertices;
    protected float suplemento;
    protected boolean coloreado;

    public Poligono(String material, float precio, ArrayList<Punto> listaVertices) {
        this.material = material;
        this.precio = precio;
        this.color = "gris";
        this.listaVertices = listaVertices;
        this.suplemento=0f;
        this.coloreado=false;
    }

    public Poligono() {
        this.listaVertices = new ArrayList<>();
        this.color="gris";
        this.coloreado=false;
    }

    public void setMaterial(String material) {
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


    public String getMaterial(){
        return this.material;

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
