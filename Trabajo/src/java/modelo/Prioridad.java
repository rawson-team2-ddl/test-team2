package modelo;
// Generated 13-dic-2018 16:06:53 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Prioridad generated by hbm2java
 */
public class Prioridad  implements java.io.Serializable {


     private Integer idPrioridad;
     private String nombre;
     private Set requisitos = new HashSet(0);

    public Prioridad() {
    }

	
    public Prioridad(String nombre) {
        this.nombre = nombre;
    }
    public Prioridad(String nombre, Set requisitos) {
       this.nombre = nombre;
       this.requisitos = requisitos;
    }
   
    public Integer getIdPrioridad() {
        return this.idPrioridad;
    }
    
    public void setIdPrioridad(Integer idPrioridad) {
        this.idPrioridad = idPrioridad;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Set getRequisitos() {
        return this.requisitos;
    }
    
    public void setRequisitos(Set requisitos) {
        this.requisitos = requisitos;
    }




}


