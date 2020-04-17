package com.company;

public class Empleado {
    private String dni;
    private String nombre;
    private String apellido;
    private float salario;


    public Empleado() {
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public float salarioAnual(){
        float salarioAnual = 12*salario;
        return salarioAnual;
    }

    public void aumentarSalario(float porcentaje){
        float p = porcentaje/100;
        this.salario *= p;
    }

    public void mostrarEmpleado(){
        System.out.print("Empleado[dni = "+ dni + ", nombre = " + nombre);
        System.out.println(", apellido = " + apellido + ", salario = " + salario + "]");
    }
}
