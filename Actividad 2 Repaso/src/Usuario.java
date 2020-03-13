import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Usuario extends GestorPeliculas{
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {

		GestorPeliculas gesPel = new GestorPeliculas();
		// -------Crear-Peliculas------
		ArrayList<Peliculas> miListado = GestorPeliculas.devuelveListado();

		int Boton = 0;
		// -----Funciones-Botones-------
		String Texto = "";
		do {
			// --------Menu--------
			System.out.println("Selecciona :\r\n" + "1- Alta de pelicula\r\n" + "2- Listar Pelicula\r\n"
					+ "3- Buscar Pelicula por id\r\n" + "4- Buscar pelicula por titulo\r\n"
					+ "5- Buscar Peliculas por genero\r\n" + "6- Borrar pelicula por id\r\n"
					+ "7- Salir de la aplicación");
			// -----Interaccion-Usuario-----

			Boton = teclado.nextInt();

			switch (Boton) {
			case 1:
				gesPel.introducirPelicula(miListado);
				break;
			case 2:
				gesPel.MostrarLista(miListado);
				break;
			case 3:
				gesPel.BuscarId(miListado);
				break;
			case 4:
				gesPel.BuscarTitulo(miListado);
				break;
			case 5:
				gesPel.BuscarGenero(miListado);
				break;
			case 6:
				gesPel.BorrarPeli(miListado);
				break;
			}
			System.out.println(Texto);
		} while (Boton != 7);
		System.out.println("Has salido del programa");

	}

	
}
