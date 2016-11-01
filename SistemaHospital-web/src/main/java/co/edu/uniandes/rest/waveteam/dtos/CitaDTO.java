/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.rest.waveteam.dtos;


import co.edu.uniandes.waveteam.sistemahospital.entities.CitaEntity;
import java.util.ArrayList;

/**
 *
 * @author jm.lizarazo10
 */
public class CitaDTO {

    public ArrayList a = new ArrayList();

    
    private Long id;
    private String fecha;
    private Long hora;
    private int duracion;
    private MedicoDTO doctor;
    private PatientDTO paciente;
    private String habilitada;
    
    
    public CitaDTO(){
        
    }
    
    //***********************************************************************
    //CAMBIOS PARA QUITAR ERRORES EN PACIENTDETAIL
    
    public CitaDTO(CitaEntity entity){
        if (entity != null) {
        this.id = id;
        this.fecha = fecha;
        this.hora = hora;
        this.duracion = duracion;
        this.doctor = doctor;
        this.paciente = paciente; 
        this.habilitada = habilitada;
        }
    }
    
    
    public CitaEntity toEntity() {
        CitaEntity entity = new CitaEntity();
        entity.setDuracion(duracion);
        entity.setFecha(fecha);
        entity.setHabilitada(habilitada);
        entity.setHora(hora);
        entity.setId(id);
        entity.setName(fecha);
        return entity;
    }
   
     //***********************************************************************
    
    public CitaDTO(Long id, String fecha, Long hora, int duracion, MedicoDTO medico, PatientDTO paciente, String habilitada){
        this.id = id;
        this.fecha = fecha;
        this.hora = hora;
        this.duracion = duracion;
        this.doctor = doctor;
        this.paciente = paciente; 
        this.habilitada = habilitada;

    }
    
    
    
    
    public Long getId(){
        return id;
    }
    
    
    
    public void setId(Long id){
        this.id = id;
    }
    
    public String getFecha(){
        return fecha;
    }
    
    public void setFecha(String fecha){
        this.fecha = fecha;
    }
    
    
    public Long getHora(){
        return hora;
    }
    
    
    public void setHora(Long hora){
        this.hora = hora;
    }
    
    
    public int getDuracion(){
        return duracion;
    }
    
    public void setDuracion(int duracion){
        this.duracion = duracion;
    }
    
    
    public MedicoDTO getMedico(){
        return doctor;
    }
    
    public void setMedico(MedicoDTO doctor){
        this.doctor = doctor;
    }
    
    
    public PatientDTO getPaciente(){
        return paciente;
    }
    
    
    public void setPaciente(PatientDTO paciente){
        this.paciente = paciente;
    }
    
    
    public void desactivar(){
        this.habilitada = "false";
    }
    
    public String getHabilitada(){
        return this.habilitada;
    }

    public void setHabilitada(String habilitada){
        this.habilitada = habilitada;
    }

    public void addSm(Long t){
        a.add(t);
    }
    
    @Override
    public String toString(){

        return  "{ id : " + id +
                ", fecha : " + fecha + 
                ", hora : " +hora + 
                ", duracion : " + duracion + 
                ", medico : " + doctor.toString() + 
                ", paciente : " + paciente.toString() +
                ", habilitada : " + habilitada 
                +" }";
    }
    
    
}
