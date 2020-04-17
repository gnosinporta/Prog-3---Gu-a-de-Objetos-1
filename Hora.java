package com.company;

public class Hora {
    private int hora = 00;
    private int minuto = 0;
    private int segundo = 0;


    public int getHora(){
        return hora;
    }

    public void setHora(int hora) {
        if (hora >= 0 && hora <= 24) {
            this.hora = hora;
        }else{
            System.out.println("Rango incorrecto para la hora");
        }
    }

    public int getMinuto(){
        return minuto;
    }

    public void setMinuto(int minuto) {
        if (minuto >= 0 && minuto <= 59) {
            this.minuto = minuto;
        }else{
            System.out.println("Rango incorrecto para los minutos");
        }
    }

    public int getSegundo(){
        return segundo;
    }

    public void setSegundo(int segundo) {
        if (segundo >= 0 && segundo <= 59) {
            this.segundo = segundo;
        }else{
            System.out.println("Rango incorrecto para los segundos");
        }
    }

    public String horaFormateada() {
        String hora_string;
        if(hora < 10){
            hora_string = "0" + Integer.toString(hora);     //usé esta forma para darle formato a la hora hh
        }else{
            hora_string = Integer.toString(hora);
        }
        return hora_string;
    }

    public String minutoFormateado() {
        String minuto_string;
        if(minuto < 10){
            String aux = Integer.toString(minuto);
            minuto_string = "0" + aux;
        }else{
            minuto_string = Integer.toString(minuto);
        }
        return minuto_string;
    }

    public String segundoFormateado() {
        String segundo_string;
        if(segundo < 10){
            segundo_string = "0" + Integer.toString(segundo);
        }else{
            segundo_string = Integer.toString(segundo);
        }
        return segundo_string;
    }

    public void mostrarHora(){
        System.out.println(horaFormateada() + ":" + minutoFormateado() + ":" + segundoFormateado());
    }

    public void avanzarHora(){
        if(this.getHora() == 23){
            this.setHora(0);
        }else{
            hora++;
        }
    }

    public void avanzarMinuto(){
        if(this.getMinuto() == 59){
            this.setMinuto(0);
            this.avanzarHora();
        }else{
            minuto++;
        }
    }

    public Hora avanzarSegundo(){
        if(this.getSegundo() == 59){
            this.setSegundo(0);
            this.avanzarMinuto();
        }else{
            segundo++;
        }
        return this;
    }

    public void retrocederHora(){
        if(this.getHora() == 0){
            this.setHora(23);
        }else{
            hora--;
        }
    }

    public void retrocederMinuto(){
        if(this.getMinuto() == 0){
            this.setMinuto(59);
            this.retrocederHora();
        }else{
            minuto--;
        }
    }

    public Hora retrocederSegundo(){
        if(this.getSegundo() == 0){
            this.setSegundo(59);
            this.retrocederMinuto();
        }else {
            segundo--;
        }
        return this;
    }
}
