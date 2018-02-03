package com.cice.enums;

/**
 * @author Javier Bajo Chacon  javier.bajochacon@gmail.com
 */
public enum EnumDisenio {
    BASICO(1.0f),
    COLOREADO(1.15f),
    COLOREADODEAUTOR(1.20f),
    ESTAMPADO(1.17f);

    private float incremento;

    EnumDisenio(float incremento) {
        this.incremento = incremento;

    }

    public float getIncremento() {
        return incremento;
    }
}

