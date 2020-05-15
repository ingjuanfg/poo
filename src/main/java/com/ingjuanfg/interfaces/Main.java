package com.ingjuanfg.interfaces;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static ArrayList<Persona> ciudadanos = new ArrayList<Persona>();

    public static void main(String[] args) {
        Map<String, String> datosMedico = new HashMap<>();
        datosMedico.put("cedula", "1088");
        datosMedico.put("nombre", "Juan");
        datosMedico.put("apellido", "Fernandez");
        datosMedico.put("edad", "27");
        datosMedico.put("especialidad", "Pediatra");
        datosMedico.put("turno", "Diurno");

        Map<String, String> datosPaciente = new HashMap<>();
        datosPaciente.put("cedula", "2088");
        datosPaciente.put("nombre", "Pepe");
        datosPaciente.put("apellido", "Perez");
        datosPaciente.put("edad", "12");
        datosPaciente.put("enfermedad", "Anemia");
        datosPaciente.put("isAfiliado", "true");
        datosPaciente.put("eps", "Sura");

        Medico drFernandez = new Medico(datosMedico);
        Paciente ninoPerez = new Paciente(datosPaciente);

        ciudadanos.add(drFernandez);
        ciudadanos.add(ninoPerez);

        System.out.println("INFORMACION DE LOS CIUDADANOS");
        for(Persona ciudadano : ciudadanos){
            System.out.println(ciudadano.getNombre() + " -- " + ciudadano.getApellido());
            ciudadano.conducir();
            ciudadano.ingresoCentroHospitalario();
        }

        System.out.println("ACCIONES DE LOS CIUDADANOS");
        for(Persona ciudadano : ciudadanos){
            System.out.println(ciudadano.getNombre() + " -- " + ciudadano.getApellido());
            ciudadano.realizarExamen();
            ciudadano.solicitarCitaMedica();
        }
    }
}
