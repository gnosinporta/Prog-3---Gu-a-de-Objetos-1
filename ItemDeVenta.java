package com.company;

public class ItemDeVenta {
    private String id;
    private String descripcion;
    private int cantidad;
    private float precioUnitario;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public float getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(float precioUnitario) {   //por qué si le paso un float sin la f al final me dice que es double?
        this.precioUnitario = precioUnitario;   //cuando se usa el this.?
    }

    public float precioTotal(){
        float precioTotal = precioUnitario*cantidad;
        return precioTotal;
    }

    public void mostrarItem(){
        System.out.print("ItemVenta[id = " + id + ", descripción = " + descripcion + ", cantidad = " + cantidad);
        System.out.println(", pUnitario = " + precioUnitario + ", pTotal = " + this.precioTotal());
    }
}
