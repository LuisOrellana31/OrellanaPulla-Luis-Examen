package prueba;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ec.edu.ups.business.AutorOn;
import ec.edu.ups.business.CapitulosON;
import ec.edu.ups.business.LibroON;
import ec.edu.ups.entidades.Autor;
import ec.edu.ups.entidades.Capitulos;
import ec.edu.ups.entidades.Libro;



@WebServlet("/libros")
public class Pincipan extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1675928624331200378L;
	@Inject
	private CapitulosON on;
	
	@Inject
	private LibroON onL;
	
	@Inject
	private AutorOn onA;
	

	
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    
	    
        try {
            response.getWriter().println("<h1>Gestion Empleados Pruebas..</h1>");
            
            Libro li= new Libro();
           
            
            li.setCodigo(1);
            li.setNombre("la vaca lola");
            li.setISBN(345456);
            li.setNumPagina(23);
            Capitulos ca = new Capitulos();
            ca.setCodigo(1);
            ca.setNumero(23);
            ca.setTitulo("harry potter");
            ca.setLibro(li);
           
            Autor au = new Autor();
            au.setCodigo(1);
            au.setNombre("luis");
            au.setNacionalidad("ecuatoriano");
            au.setCap(ca);
            
            onL.insertarLibro(li);
            on.InsertarC(ca);
            onA.InsertarAutor(au);
            
         } catch (Exception ex) {
             response.getWriter().println("<h1>Erro al completar la operacion</h1>");
           
        }
	}
}
