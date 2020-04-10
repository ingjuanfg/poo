package com.ingjuanfg.polimorfismo;

public abstract class EmpresaSoftware {
    private int local;
    private String nombreEmpresa;
    private int cantidadSalas;

    public EmpresaSoftware(int local, String nombreEmpresa, int cantidadSalas) {
        this.local = local;
        this.nombreEmpresa = nombreEmpresa;
        this.cantidadSalas = cantidadSalas;
    }

    public int getLocal() {
        return local;
    }

    public void setLocal(int local) {
        this.local = local;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public int getCantidadSalas() {
        return cantidadSalas;
    }

    public void setCantidadSalas(int cantidadSalas) {
        this.cantidadSalas = cantidadSalas;
    }

    public void llamar(){
        System.out.println("Realizar llamada (Clase Padre)");
    }

    public void enviarCorreos(){
        System.out.println("Enviar correos (Clase Padre)");
    }

    public abstract void programar();
}
