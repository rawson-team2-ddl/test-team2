package modelo;
// Generated 13-dic-2018 16:06:53 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Rol generated by hbm2java
 */
public class Rol  implements java.io.Serializable {


     private Integer idRol;
     private String nombre;
     private Set permisos = new HashSet(0);
     private Set rolUsuarioProyectos = new HashSet(0);

    public Rol() {
    }

	
    public Rol(String nombre) {
        this.nombre = nombre;
    }
    public Rol(String nombre, Set permisos, Set rolUsuarioProyectos) {
       this.nombre = nombre;
       this.permisos = permisos;
       this.rolUsuarioProyectos = rolUsuarioProyectos;
    }
   
    public Integer getIdRol() {
        return this.idRol;
    }
    
    public void setIdRol(Integer idRol) {
        this.idRol = idRol;
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
    public Set getRolUsuarioProyectos() {
        return this.rolUsuarioProyectos;
    }
    
    public void setRolUsuarioProyectos(Set rolUsuarioProyectos) {
        this.rolUsuarioProyectos = rolUsuarioProyectos;
    }




}


