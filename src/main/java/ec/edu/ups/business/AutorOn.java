package ec.edu.ups.business;

import javax.ejb.Stateless;
import javax.inject.Inject;

import ec.edu.ups.DAO.AutorDAO;
import ec.edu.ups.entidades.Autor;
import ec.edu.ups.entidades.Capitulos;

@Stateless
public class AutorOn {

	@Inject AutorDAO dao;
	
	
	public void InsertarAutor(Autor a) {
		dao.InsertarAutor(a);
	}
	
}
