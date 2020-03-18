import java.util.ArrayList;
import java.util.Scanner;

public class Usuario extends GestorPeliculas {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {

		GestorPeliculas gesPel = new GestorPeliculas();
		// -------Crear-Peliculas------
		ArrayList<Peliculas> miListado = GestorPeliculas.devuelveListado();

		int Boton = 0;
		// -----Funciones-Botones-------
		do {
			// --------Menu--------
			System.out.println("Selecciona :\r\n" + "1- Alta de pelicula\r\n" + "2- Listar Pelicula\r\n"
					+ "3- Buscar Pelicula por id\r\n" + "4- Buscar pelicula por titulo\r\n"
					+ "5- Buscar Peliculas por genero\r\n" + "6- Borrar pelicula por id\r\n"
					+ "7- Salir de la aplicación");

			// -----Interaccion-Usuario-----

			Boton = teclado.nextInt();

			switch (Boton) {
			//-------------------------------------------------------------------------------------
			case 1:
				teclado.nextLine();
				System.out.println("Creando pelicula:");
				System.out.println("Introduzca un ID: ");
				String identi = teclado.nextLine();

				System.out.println("Introduzca un Titulo: ");
				String titulou = teclado.nextLine();

				System.out.println("Introduzca uno o varios Director/es: ");
				String Directoru = teclado.nextLine();

				System.out.println("Introduzca genero: ");
				String Generou = teclado.nextLine();

				System.out.println("Introduzca un año: ");
				int anoEstreno = teclado.nextInt();
				gesPel.introducirPelicula(identi, titulou, Directoru, Generou, anoEstreno);
				break;
	//-------------------------------------------------------------------------------------			
			case 2:
				for (Peliculas films : listaPeliculas) {
					System.out.println(films.toString());
				}
				break;
	//-------------------------------------------------------------------------------------
			case 3:
				System.out.println("Introduce el Id a buscar:");
				String idABuscar = teclado.next();
				try {
					Peliculas peliEncontrada = gesPel.BuscarId(idABuscar);
					System.out.println(peliEncontrada.toString());
				} catch (Exception e) {
					System.out.println("No existe el ID solicitado " + e);
				}
				break;
	//-------------------------------------------------------------------------------------			
			case 4:
				System.out.println("Introduce el Titulo a buscar:");
				String TituloABuscar = teclado.next();
				try {
					Peliculas peliEncontrada = gesPel.BuscarTitulo(TituloABuscar);
					System.out.println(peliEncontrada.toString());
				} catch (Exception e) {
					System.out.println("No existe el Titulo solicitado " + e);
				}
				break;
	//-------------------------------------------------------------------------------------
			case 5:
				//No hacemos un Exception, porque en el arrayList "pelisConMismoGenero",
				//si no encuentra nada parecido a lo introducido, sera null automaticamente.
				System.out.println("Introduce el Genero a buscar:");
				String generoBuscar = teclado.next();
				ArrayList<Peliculas> miarrray = gesPel.BuscarGenero(generoBuscar);
				for(Peliculas pel : miarrray) {
					pel.toString();
				}
				break;
	//-------------------------------------------------------------------------------------			
			case 6:
				System.out.println("Introduce el ID a borrar:");
				String IDABorrar = teclado.next();
				gesPel.BorrarPeli(IDABorrar);
				break;
			}
		} 
		while (Boton != 7);
		System.out.println("Has salido del programa");
	}

}
