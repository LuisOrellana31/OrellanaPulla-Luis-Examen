package ec.edu.ups.entidades;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity 
public class Libro implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	private int codigo;
	private String nombre;
	private int ISBN;
	private int NumPagina;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "libro")
	private Set<Capitulos> capi= new HashSet<Capitulos>();
	
	
	public int getCodigo() {
		return codigo;
	}


	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getISBN() {
		return ISBN;
	}


	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}


	public int getNumPagina() {
		return NumPagina;
	}


	public void setNumPagina(int numPagina) {
		NumPagina = numPagina;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	public Libro(int codigo, String nombre, int iSBN, int numPagina) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.ISBN = iSBN;
		this.NumPagina = numPagina;
	}


	public Libro() {
		super();
		// TODO Auto-generated constructor stub
	}


	
	
	
	

}
