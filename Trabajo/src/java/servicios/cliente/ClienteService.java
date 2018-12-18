/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios.cliente;

import controlador.HibernateUtil;
import daos.Usuario.DaoUsuario;
import daos.cliente.ClienteDao;
import daos.singletons.ClienteSingleton;
import daos.singletons.UsuarioSingleton;
import excepciones.InstanceException;
import java.util.ArrayList;
import java.util.List;
import modelo.Cliente;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author LUCIA
 */
public class ClienteService {
    
//    protected Session session = HibernateUtil.getSessionFactory().getCurrentSession();
//    protected Transaction t = session.beginTransaction();
    private ClienteDao dao;
    
    public ClienteService(Session session, Transaction t){
        dao = ClienteSingleton.getDao(session, t);
    }
    public Cliente insertarCliente(Cliente cliente) throws InstanceException{
    
        try{
         return dao.save(cliente);
        }catch(HibernateException e){
            throw new InstanceException();
        }
    }
    
    
    public void updateCliente(Cliente client) throws InstanceException{
        try{
            dao.update(client);
        }catch(HibernateException e){
            throw new InstanceException();
        }
    }
    
    public Cliente getByCIF(String cif) throws InstanceException{
        List<Cliente> result = new ArrayList();
        try{
            result = dao.getByParameter("cif", cif);
            if(result.size()!=1)
                throw new InstanceException();
        }catch(HibernateException e){
            throw new InstanceException();
        }
        return result.get(0);
    }
    
    public List<Cliente> getByName(String name) throws InstanceException{
        try{
            return dao.getByParameter("nombre", name);
        }catch(HibernateException e){
            throw new InstanceException();
        }
    }
}
