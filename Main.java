/*
GUIA DE OBJETOS 1 - MODELADO E IMPLEMENTACIÓN

Alumno:     Cristian Oscar Ovando
Comisión:   3

NOTA:   los 5 ejercicios se encuentran implementados en el main.
        Para mayor claridad, están comentados los ejercicios 2 al 5, y al ejecutar este main
        solo se mostrará el ejercicio 1. Descomentar cada uno para poder ver su funcionamiento.
*/

package com.company;

public class Main {

    public static void main(String[] args) {

        //EJERCICIO 1

        //inciso a
        Rectangulo rect = new Rectangulo();

        rect.setAlto(10);
        rect.setAncho(11);

        //inciso b
        System.out.println("el alto del rectangulo es " + rect.getAlto());
        System.out.println("el ancho del rectangulo es " + rect.getAncho());

        //inciso c
        System.out.println("el perimetro del rectangulo es " + rect.perimetro());
        System.out.println("el area del rectangulo es " + rect.area());

        //inciso d
        rect.setAlto(25);
        rect.setAncho(65);

        //inciso e
        System.out.println("\nel perimetro del rectangulo es " + rect.perimetro());
        System.out.println("el area del rectangulo es " + rect.area());

        //inciso f
        Rectangulo nuevo_rect = new Rectangulo();
        System.out.println("\nel alto del rectangulo es " + nuevo_rect.getAlto());
        System.out.println("el ancho del rectangulo es " + nuevo_rect.getAncho());


        /*
        //EJERCICIO 2

        //inciso a
        Empleado empleado1 = new Empleado();
        empleado1.setNombre("Carlos");
        empleado1.setApellido("Gutiérrez");
        empleado1.setDni("23456345");
        empleado1.setSalario(25000);

        //inciso b
        Empleado empleado2 = new Empleado();
        empleado2.setNombre("Ana");
        empleado2.setApellido("Sánchez");
        empleado2.setDni("34234123");
        empleado2.setSalario(27500);

        //inciso c
        empleado1.mostrarEmpleado();
        empleado2.mostrarEmpleado();

        //inciso d
        empleado1.aumentarSalario(15);
        System.out.println("El salario anual del empleado " + empleado1.getNombre() + " es " + empleado1.salarioAnual());
        */

        /*
        //EJERCICIO 3

        //inciso a
        ItemDeVenta item = new ItemDeVenta();

        item.setId("1");
        item.setDescripcion("choclos");
        item.setCantidad(12);
        item.setPrecioUnitario(10.50f);

        //inciso b
        item.mostrarItem();
         */

        /*
        //EJERCICIO 4

        //inciso 1
        CuentaDeBanco cuenta = new CuentaDeBanco();

        cuenta.setBalance(15000);
        cuenta.setId("1");
        cuenta.setNombre("carlos");

        //inciso 2
        cuenta.credito(2500);

        //inciso 3
        cuenta.debito(1500);

        //inciso 4
        cuenta.debito(30000);

        //inciso 5
        cuenta.mostrarCuenta();
         */

        /*
        //EJERCICIO 5

        //inciso 1
        Hora horita = new Hora();

        horita.setHora(13);
        horita.setMinuto(4);
        horita.setSegundo(22);

        horita.mostrarHora();

        //inciso 2
        horita.avanzarSegundo();
        horita.mostrarHora();

        //inciso 3
        horita.retrocederSegundo();
        horita.mostrarHora();
        */
    }
}
