package com.company;

public class CuentaDeBanco {
    private String id;
    private String nombre;
    private float balance = 0f;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public float credito(float deposito){
        this.balance += deposito;
        return balance;
    }

    public float debito(float sustraccion){
        float nuevoBalance = balance - sustraccion;

        if (nuevoBalance < 0){
            System.out.println("El dinero no es suficiente para realizar la operación");
        }
        else{
            this.balance -= sustraccion;
        }

        return balance;
    }

    public void mostrarCuenta(){
        System.out.print("Cuenta[id = " + id + ", nombre = " + nombre + ", balance = " + balance + "]");
    }
}
