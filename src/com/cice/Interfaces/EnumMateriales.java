package com.cice.Interfaces;

/**
 * @author Javier Bajo Chacon  javier.bajochacon@gmail.com
 */
public enum EnumMateriales {
    CARTON(100f),
    PLASTICO(300f),
    MADERA(500f);

    private float precio;

    EnumMateriales(float precio) {
        this.precio = precio;
    }

    public float getPrecio() {
        return precio;
    }
}
