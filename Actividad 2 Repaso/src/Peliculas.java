
public class Peliculas {

	private String ID,titulo,director,genero;
	private int añoEstreno;
	
	public Peliculas (String ID, String titulo, String director, String genero, int añoEstreno) {
		super();
		setID(ID);
		setTitulo(titulo);
		setDirector(director);
		setGenero(genero);
		setañoEstreno(añoEstreno);
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
	
	public int añoEstreno() {
		return añoEstreno;
	}
	public void setañoEstreno(int añoEstreno) {
		this.añoEstreno = añoEstreno;
	}
	public String toString() {
		return (ID+" Nombre: "+ titulo + " Dirigida por: "+ director +" Genero: "+genero+" Estrenada: "+añoEstreno);
	}
}
