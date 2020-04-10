package com.ingjuanfg.herencia;

public class Conductor extends Persona{
    private int numeroLicencia;
    private String tallaUniforme;

    public Conductor(int cedula, String nombre, String apellido, int numeroLicencia, String tallaUniforme){
        super(cedula,nombre,apellido);
        this.numeroLicencia = numeroLicencia;
        this.tallaUniforme = tallaUniforme;
    }

    public int getNumeroLicencia() {
        return numeroLicencia;
    }

    public void setNumeroLicencia(int numeroLicencia) {
        this.numeroLicencia = numeroLicencia;
    }

    public String getTallaUniforme() {
        return tallaUniforme;
    }

    public void setTallaUniforme(String tallaUniforme) {
        this.tallaUniforme = tallaUniforme;
    }
}
