package com.company;

public class Rectangulo {
    private float alto = 1.0f;
    private float ancho = 1.0f;

    public float getAlto() {
        return alto;
    }

    public void setAlto(float alto) {
        this.alto = alto;
    }

    public float getAncho() {
        return ancho;
    }

    public void setAncho(float ancho) {
        this.ancho = ancho;
    }

    public float area(){
        float a = alto * ancho;
        return a;
    }

    public float perimetro(){
        float p = 2*(ancho + alto);
        return p;
    }
}
