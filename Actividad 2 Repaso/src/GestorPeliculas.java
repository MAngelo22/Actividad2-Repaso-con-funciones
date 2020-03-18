import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class GestorPeliculas {
	static Scanner teclado = new Scanner(System.in);
	static ArrayList<Peliculas> listaPeliculas = new ArrayList<Peliculas>();

	//Peliculas de ejemplo, para que no este vacio el Array.
	public static ArrayList<Peliculas> rellenarLista(ArrayList<Peliculas> listaPeliculas) {
		Peliculas Peli1, Peli2, Peli3;
		
		Peli1 = new Peliculas("P1", "BlackHat, Amenaza en la red", "Michael Mann", "Thriller|Crimen", 2015);
		Peli2 = new Peliculas("P2", "The Imitation Game(Descifrando Enigma)", "Morten Tyldum", "Thriller|Biográfico",2014);
		Peli3 = new Peliculas("P3", "Avengers Endgame", "Anthony Russo, Joe Russo (Hrmns Russo)","Ciencia Ficción|Superheroes", 2019);
		
		listaPeliculas.add(Peli1);
		listaPeliculas.add(Peli2);
		listaPeliculas.add(Peli3);
		
		return listaPeliculas;
	}

	public static ArrayList<Peliculas> devuelveListado() {
		return rellenarLista(listaPeliculas);
	}

	public void introducirPelicula(String IDu, String titulou, String directoru, String Generou, int anoEstreno) {
		listaPeliculas.add(new Peliculas(IDu, titulou, directoru, Generou, anoEstreno));
	}

	public Peliculas BuscarId(String idABuscar) {
		//Solo puede existir ese ID y no se puede duplicar o repetir.
		for (Peliculas i : listaPeliculas) {
			if (idABuscar.equals(i.getID())) {
				return i;
			}
		}
		return null;
	}

	public Peliculas BuscarTitulo(String TituloABuscar) {
		//Solo puede existir esa pelicula con el mismo titulo, es como el ID
		for (Peliculas t : listaPeliculas) {
			if (TituloABuscar.equals(t.getTitulo())) {
				return t;
			}
		}
		return null;
	}

	public ArrayList<Peliculas> BuscarGenero(String generoBuscar) {
		//Creo un nuevo array por las siguientes razones: Puede repetirse el mismo genero,
		//y deberemos guardar las peliculas con ese genero en algun sitio, usamos un objeto arrayList,
		//y al recorrerlo y cumpla la condicion añadira esa pelicula al nuevo arrayList
		ArrayList<Peliculas> pelisConMismoGenero = new ArrayList<Peliculas>();
		for (Peliculas g : listaPeliculas) {
			if (generoBuscar.equals(g.getGenero())) {
				pelisConMismoGenero.add(g);
			}
		}
		return pelisConMismoGenero;
	}

	public void BorrarPeli(String IDABorrar) {
		Iterator<Peliculas> iteradorPelis = listaPeliculas.iterator();
		while (iteradorPelis.hasNext()) {
			Peliculas peliBorra = iteradorPelis.next();
			System.out.println(peliBorra.toString());
			if (peliBorra.getID().equals(IDABorrar)) {
				iteradorPelis.remove();
			}
		}
	}
}
