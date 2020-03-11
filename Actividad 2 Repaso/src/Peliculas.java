
public class Peliculas {

	private String ID,titulo,director,genero;
	private int a�oEstreno;
	
	public Peliculas (String ID, String titulo, String director, String genero, int a�oEstreno) {
		super();
		setID(ID);
		setTitulo(titulo);
		setDirector(director);
		setGenero(genero);
		seta�oEstreno(a�oEstreno);
	}
	
	//getter and setter
	public String getID() {
		return ID;
	}
	public void setID(String ID) {
		this.ID = ID;
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String getDirector() {
		return director;
	}
	public void setDirector(String Director) {
		this.director = Director;
	}
	
	public String getGenero() {
		return genero;
	}
	public void setGenero(String Genero) {
		this.genero = Genero;
	}
	
	public int a�oEstreno() {
		return a�oEstreno;
	}
	public void seta�oEstreno(int a�oEstreno) {
		this.a�oEstreno = a�oEstreno;
	}
	public String toString() {
		return (ID+" Nombre: "+ titulo + " Dirigida por: "+ director +" Genero: "+genero+" Estrenada: "+a�oEstreno);
	}
}
