package ec.edu.ups.entidades;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Capitulos {

	
	
	private static final long serialVerionUID=1L;
	
	@Id
	private int codigo;
	private int numero;
	private String titulo;
	
	@ManyToOne
	@JoinColumn
	private Libro libro;
	
	@OneToOne(cascade = CascadeType.ALL, mappedBy = "cap")
	private Autor autor;
	
	
	public Capitulos() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Capitulos(int codigo, int numero, String titulo) {
		super();
		this.codigo = codigo;
		this.numero = numero;
		this.titulo = titulo;
	}



	public Libro getLibro() {
		return libro;
	}



	public void setLibro(Libro libro) {
		this.libro = libro;
	}



	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public static long getSerialverionuid() {
		return serialVerionUID;
	}
	
	
		
}
