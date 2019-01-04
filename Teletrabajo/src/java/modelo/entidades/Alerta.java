package modelo.entidades;
// Generated 13-dic-2018 16:06:53 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Alerta generated by hbm2java
 */
public class Alerta  implements java.io.Serializable {


     private Integer idAlerta;
     private Tarea tarea;
     private Tipoalerta tipoalerta;
     private String descripcion;
     private Date fecha;
     private Set usuarioAlertas = new HashSet(0);

    public Alerta() {
    }

	
    public Alerta(Tarea tarea, Tipoalerta tipoalerta, String descripcion, Date fecha) {
        this.tarea = tarea;
        this.tipoalerta = tipoalerta;
        this.descripcion = descripcion;
        this.fecha = fecha;
    }
    public Alerta(Tarea tarea, Tipoalerta tipoalerta, String descripcion, Date fecha, Set usuarioAlertas) {
       this.tarea = tarea;
       this.tipoalerta = tipoalerta;
       this.descripcion = descripcion;
       this.fecha = fecha;
       this.usuarioAlertas = usuarioAlertas;
    }
   
    public Integer getIdAlerta() {
        return this.idAlerta;
    }
    
    public void setIdAlerta(Integer idAlerta) {
        this.idAlerta = idAlerta;
    }
    public Tarea getTarea() {
        return this.tarea;
    }
    
    public void setTarea(Tarea tarea) {
        this.tarea = tarea;
    }
    public Tipoalerta getTipoalerta() {
        return this.tipoalerta;
    }
    
    public void setTipoalerta(Tipoalerta tipoalerta) {
        this.tipoalerta = tipoalerta;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public Date getFecha() {
        return this.fecha;
    }
    
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    public Set getUsuarioAlertas() {
        return this.usuarioAlertas;
    }
    
    public void setUsuarioAlertas(Set usuarioAlertas) {
        this.usuarioAlertas = usuarioAlertas;
    }




}

