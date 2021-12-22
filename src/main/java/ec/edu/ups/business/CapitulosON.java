package ec.edu.ups.business;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import ec.edu.ups.DAO.CapitulosDAO;
import ec.edu.ups.entidades.Capitulos;
import ec.edu.ups.entidades.Libro;

@Stateless
public class CapitulosON {

	@Inject
	private CapitulosDAO dao;
	
	
	public void InsertarC(Capitulos c1) {
		dao.InsertarCapitulo(c1);
	}
	
	public List<Capitulos> ListaLibros(String parametros )throws Exception{
		return dao.ListaLibros(parametros);
	}
}
