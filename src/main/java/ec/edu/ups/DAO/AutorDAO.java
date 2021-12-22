package ec.edu.ups.DAO;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import ec.edu.ups.entidades.Autor;
import ec.edu.ups.entidades.Capitulos;

@Stateless
public class AutorDAO {
	
	@PersistenceContext
	private EntityManager em;
	
	public void InsertarAutor(Autor a) {
		em.persist(a);
	}
	

}
