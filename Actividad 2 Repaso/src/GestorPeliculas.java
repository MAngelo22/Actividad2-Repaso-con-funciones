import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class GestorPeliculas {
	static Scanner teclado = new Scanner(System.in);
	static ArrayList<Peliculas> listaPeliculas = new ArrayList<Peliculas>();
	
	public static ArrayList<Peliculas> rellenarLista(ArrayList<Peliculas> listaPeliculas) {
		Peliculas Peli1, Peli2, Peli3;

		Peli1 = new Peliculas("P1", "BlackHat, Amenaza en la red", "Michael Mann", "Thriller|Crimen", 2015);
		Peli2 = new Peliculas("P2", "The Imitation Game(Descifrando Enigma)", "Morten Tyldum", "Thriller|Biográfico",2014);
		Peli3 = new Peliculas("P3", "Avengers Endgame", "Anthony Russo, Joe Russo (Hrmns Russo)",
				"Ciencia Ficción|Superheroes", 2019);
		listaPeliculas.add(Peli1);
		listaPeliculas.add(Peli2);
		listaPeliculas.add(Peli3);
		return listaPeliculas;
	}
	
	public static ArrayList<Peliculas> devuelveListado(){
		return rellenarLista(listaPeliculas);
	}

	public void MostrarLista(ArrayList<Peliculas> listaPeliculas) {
		for (Peliculas films : listaPeliculas) {
			System.out.println(films.toString());
		}
	}
	
	public void introducirPelicula(ArrayList<Peliculas> listaPeliculas, String IDu, String titulou, String directoru, String Generou, int anoEstreno) {
		listaPeliculas.add(new Peliculas(IDu, titulou, directoru, Generou, anoEstreno));
	}

	public void BuscarId(ArrayList<Peliculas> listaPeliculas, String idABuscar) {
		for (Peliculas i : listaPeliculas) {
			if (idABuscar.equals(i.getID())) {
				System.out.println(i.toString());
			}
		}
	}

	public void BuscarTitulo(ArrayList<Peliculas> listaPeliculas, String TituloABuscar) {
		for (Peliculas e : listaPeliculas) {
			if (TituloABuscar.equals(e.getTitulo())) {
				System.out.println(e.toString());
			}
		}
	}

	public void BuscarGenero(ArrayList<Peliculas> listaPeliculas, String generoBuscar) {
		for (Peliculas a : listaPeliculas) {
			if (generoBuscar.equals(a.getGenero())) {
				System.out.println(a.toString());
			}
		}
	}

	public void BorrarPeli(ArrayList<Peliculas> listaPeliculas, String IDABorrar) {
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
