package modelo.daos.prioridad;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


;
import java.util.List;
import modelo.daos.GenericDao;
import modelo.entidades.Prioridad;
import modelo.excepciones.InstanceException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author hmia
 */
public class DaoPrioridad extends GenericDao<Prioridad, Integer> implements IDaoPrioridad {

    public List<Prioridad> getByParameter(String parameter, String value, Session session) throws InstanceException {
        return (List<Prioridad>) session.createCriteria(Prioridad.class).add(Restrictions.like(parameter, value)).list();
    }
}
