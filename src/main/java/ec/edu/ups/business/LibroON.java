package ec.edu.ups.business;

import javax.ejb.Stateless;
import javax.inject.Inject;

import ec.edu.ups.DAO.LibroDAO;
import ec.edu.ups.entidades.Libro;

@Stateless
public class LibroON {

	@Inject 
	private LibroDAO dao;
	
	public void insertarLibro(Libro l) {
		dao.InsertarLibro(l);
	}
	
	
}
