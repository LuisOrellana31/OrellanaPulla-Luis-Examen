package ec.edu.ups.DAO;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import ec.edu.ups.entidades.Capitulos;
import ec.edu.ups.entidades.Libro;

@Stateless
public class CapitulosDAO {

	@PersistenceContext
	private EntityManager em;
	
	public void InsertarCapitulo(Capitulos ca) {
		em.persist(ca);
	}
	
	
	//public BuscarCapitulo(String p) {
		//String jpql = "SELECT t FROM Capitulos";
	//}
	
	
	public List<Capitulos> ListaLibros(String parametros )throws Exception{
        
        String jpql = "SELECT e FROM Capitulos e JOIN e.libro p where  p.nombre  ='" + parametros +" '";
         
        TypedQuery<Capitulos> q = em.createQuery(jpql,Capitulos.class);
        return q.getResultList();
    }
	
	
}
