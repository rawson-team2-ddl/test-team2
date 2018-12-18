package modelo;
// Generated 13-dic-2018 16:06:53 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Informe generated by hbm2java
 */
public class Informe  implements java.io.Serializable {


     private Integer idInforme;
     private Usuario usuario;
     private String rutaInforme;
     private Date fecha;
     private Set tareas = new HashSet(0);

    public Informe() {
    }

	
    public Informe(Usuario usuario, String rutaInforme, Date fecha) {
        this.usuario = usuario;
        this.rutaInforme = rutaInforme;
        this.fecha = fecha;
    }
    public Informe(Usuario usuario, String rutaInforme, Date fecha, Set tareas) {
       this.usuario = usuario;
       this.rutaInforme = rutaInforme;
       this.fecha = fecha;
       this.tareas = tareas;
    }
   
    public Integer getIdInforme() {
        return this.idInforme;
    }
    
    public void setIdInforme(Integer idInforme) {
        this.idInforme = idInforme;
    }
    public Usuario getUsuario() {
        return this.usuario;
    }
    
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    public String getRutaInforme() {
        return this.rutaInforme;
    }
    
    public void setRutaInforme(String rutaInforme) {
        this.rutaInforme = rutaInforme;
    }
    public Date getFecha() {
        return this.fecha;
    }
    
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    public Set getTareas() {
        return this.tareas;
    }
    
    public void setTareas(Set tareas) {
        this.tareas = tareas;
    }




}


