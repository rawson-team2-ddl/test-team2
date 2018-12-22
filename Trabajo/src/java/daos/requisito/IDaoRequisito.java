/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos.requisito;

import daos.IGenericDao;
import excepciones.InstanceException;
import java.util.List;
import modelo.Requisito;
import org.hibernate.Session;

/**
 *
 * @author hmia
 */
public interface IDaoRequisito extends IGenericDao<Requisito, Integer>{
    
    List<Requisito> getByParameter(String parameter, String value, Session session) throws InstanceException;
}
