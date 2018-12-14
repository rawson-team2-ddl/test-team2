package modelo;
// Generated 13-dic-2018 16:06:53 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Tipopermiso generated by hbm2java
 */
public class Tipopermiso  implements java.io.Serializable {


     private Integer idTipoPermiso;
     private String nombre;
     private Set permisos = new HashSet(0);

    public Tipopermiso() {
    }

	
    public Tipopermiso(String nombre) {
        this.nombre = nombre;
    }
    public Tipopermiso(String nombre, Set permisos) {
       this.nombre = nombre;
       this.permisos = permisos;
    }
   
    public Integer getIdTipoPermiso() {
        return this.idTipoPermiso;
    }
    
    public void setIdTipoPermiso(Integer idTipoPermiso) {
        this.idTipoPermiso = idTipoPermiso;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Set getPermisos() {
        return this.permisos;
    }
    
    public void setPermisos(Set permisos) {
        this.permisos = permisos;
    }




}


