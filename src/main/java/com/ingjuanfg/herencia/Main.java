package com.ingjuanfg.herencia;

public class Main {
    public static void main(String args[]){
        Conductor conductorTaxi = new Conductor(1,"Carlos", "Lopez", 120,"M");
        Conductor conductoVolqueta = new Conductor(3, "Diego", "Gutierrez", 150, "L");
        System.out.println("Nombre de conductor Taxi ");
        System.out.println(conductorTaxi.getNombre());
        System.out.println("Nombre de conductor volqueta ");
        System.out.println(conductoVolqueta.getNombre());
    }
}
