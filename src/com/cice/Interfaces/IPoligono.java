package com.cice.Interfaces;

/**
 * @author Javier Bajo Chacon  javier.bajochacon@gmail.com
 *
 * E02Poligon-pret-a-porter
 */
public interface IPoligono {

    void aplicarPorcantaje();
    void mostrarPrecio();
    void descripcionProducto();

    default void eliminarPorcentaje(){
      System.out.println("Vamos a colorear el Poligono");
    }

    default boolean aniadirCoordenada(float x, float y){
        System.out.println("Coordenada añadida");
        return true;
    }



}
