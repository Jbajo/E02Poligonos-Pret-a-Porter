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
    void eliminarPorcentaje();
    boolean aniadirCoordenada(float x, float y);
}
