package modelo;
// Generated 13-dic-2018 16:06:53 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Usuario generated by hbm2java
 */
public class Usuario  implements java.io.Serializable {


     private Integer idUsuario;
     private String nombre;
     private String dni;
     private String password;
     private String email;
     private String login;
     private Set versions = new HashSet(0);
     private Set usuarioAlertas = new HashSet(0);
     private Set chatgrupos = new HashSet(0);
     private Set requisitos = new HashSet(0);
     private Set clientes = new HashSet(0);
     private Set tareas = new HashSet(0);
     private Set mensajes = new HashSet(0);
     private Set informes = new HashSet(0);
     private Set rolUsuarioProyectos = new HashSet(0);

    public Usuario() {
    }

	
    public Usuario(String nombre, String dni, String password, String email, String login) {
        this.nombre = nombre;
        this.dni = dni;
        this.password = password;
        this.email = email;
        this.login = login;
    }
    public Usuario(String nombre, String dni, String password, String email, String login, Set versions, Set usuarioAlertas, Set chatgrupos, Set requisitos, Set clientes, Set tareas, Set mensajes, Set informes, Set rolUsuarioProyectos) {
       this.nombre = nombre;
       this.dni = dni;
       this.password = password;
       this.email = email;
       this.login = login;
       this.versions = versions;
       this.usuarioAlertas = usuarioAlertas;
       this.chatgrupos = chatgrupos;
       this.requisitos = requisitos;
       this.clientes = clientes;
       this.tareas = tareas;
       this.mensajes = mensajes;
       this.informes = informes;
       this.rolUsuarioProyectos = rolUsuarioProyectos;
    }
   
    public Integer getIdUsuario() {
        return this.idUsuario;
    }
    
    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDni() {
        return this.dni;
    }
    
    public void setDni(String dni) {
        this.dni = dni;
    }
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public String getLogin() {
        return this.login;
    }
    
    public void setLogin(String login) {
        this.login = login;
    }
    public Set getVersions() {
        return this.versions;
    }
    
    public void setVersions(Set versions) {
        this.versions = versions;
    }
    public Set getUsuarioAlertas() {
        return this.usuarioAlertas;
    }
    
    public void setUsuarioAlertas(Set usuarioAlertas) {
        this.usuarioAlertas = usuarioAlertas;
    }
    public Set getChatgrupos() {
        return this.chatgrupos;
    }
    
    public void setChatgrupos(Set chatgrupos) {
        this.chatgrupos = chatgrupos;
    }
    public Set getRequisitos() {
        return this.requisitos;
    }
    
    public void setRequisitos(Set requisitos) {
        this.requisitos = requisitos;
    }
    public Set getClientes() {
        return this.clientes;
    }
    
    public void setClientes(Set clientes) {
        this.clientes = clientes;
    }
    public Set getTareas() {
        return this.tareas;
    }
    
    public void setTareas(Set tareas) {
        this.tareas = tareas;
    }
    public Set getMensajes() {
        return this.mensajes;
    }
    
    public void setMensajes(Set mensajes) {
        this.mensajes = mensajes;
    }
    public Set getInformes() {
        return this.informes;
    }
    
    public void setInformes(Set informes) {
        this.informes = informes;
    }
    public Set getRolUsuarioProyectos() {
        return this.rolUsuarioProyectos;
    }
    
    public void setRolUsuarioProyectos(Set rolUsuarioProyectos) {
        this.rolUsuarioProyectos = rolUsuarioProyectos;
    }




}


