package ec.edu.ups.DAO;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import ec.edu.ups.entidades.Capitulos;
import ec.edu.ups.entidades.Libro;

@Stateless
public class LibroDAO {

	@PersistenceContext
	private EntityManager em;
	
	public void InsertarLibro(Libro l) {
		em.persist(l);
	}
	
	public List<Capitulos> ListaLibros(String parametros )throws Exception{
        
        String jpql = "SELECT e FROM Capitulos e JOIN e.libro p where  p.nombre  ='" + parametros +" '";
         
        TypedQuery<Capitulos> q = em.createQuery(jpql,Capitulos.class);
        return q.getResultList();
    }
	
	
}
