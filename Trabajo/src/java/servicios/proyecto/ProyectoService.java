/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios.proyecto;

import controlador.HibernateUtil;
import daos.cliente.ClienteDao;
import daos.proyecto.ProyectoDao;
import daos.singletons.ClienteSingleton;
import daos.singletons.ProyectoSingleton;
import excepciones.InstanceException;
import java.util.List;
import javax.management.InstanceNotFoundException;
import modelo.Proyecto;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author LUCIA
 */
public class ProyectoService {
    
//     protected Session session = HibernateUtil.getSessionFactory().getCurrentSession();
//    protected Transaction t = session.beginTransaction();
    private ProyectoDao dao;
    
    public ProyectoService(Session session, Transaction t){
        dao = ProyectoSingleton.getDao(session, t);
    }
    public Proyecto insertarProyecto(Proyecto proyecto) throws InstanceException{
        try{
            return dao.save(proyecto);
        }catch(HibernateException e){
            throw new InstanceException();
        }
    
    }
    
    public Proyecto obtenerPorId(int id) throws InstanceNotFoundException, InstanceException{
    
        try{
          return dao.findbyId(id);
        }catch(HibernateException e){
            throw new InstanceException();
        }
      }
    
    public List<Proyecto> obtenerProyectos() throws InstanceException{
    
        try{
        return dao.findAll();
        }catch(HibernateException e){
            throw new InstanceException();
        }
    }
    
}
