package modelo.entidades;
// Generated 13-dic-2018 16:06:53 by Hibernate Tools 4.3.1



/**
 * UsuarioAlertaId generated by hbm2java
 */
public class UsuarioAlertaId  implements java.io.Serializable {


     private int idUsuario;
     private int idAlerta;

    public UsuarioAlertaId() {
    }

    public UsuarioAlertaId(int idUsuario, int idAlerta) {
       this.idUsuario = idUsuario;
       this.idAlerta = idAlerta;
    }
   
    public int getIdUsuario() {
        return this.idUsuario;
    }
    
    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }
    public int getIdAlerta() {
        return this.idAlerta;
    }
    
    public void setIdAlerta(int idAlerta) {
        this.idAlerta = idAlerta;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof UsuarioAlertaId) ) return false;
		 UsuarioAlertaId castOther = ( UsuarioAlertaId ) other; 
         
		 return (this.getIdUsuario()==castOther.getIdUsuario())
 && (this.getIdAlerta()==castOther.getIdAlerta());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getIdUsuario();
         result = 37 * result + this.getIdAlerta();
         return result;
   }   


}


