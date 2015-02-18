package elecciones;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int eleccion = 60;
		Partido partido = new Partido();

		do
		{
			System.out.println("\n1.Añadir un habitante");
			System.out.println("2.Añadir un inmueble");
			System.out.println("3.Añadir un espacio publico");
			System.out.println("4.Añadir un ayuntamiento");
			System.out.println("5.Añadir un partido politico");
			System.out.println("6.Leer lista de partidos politicos");
			System.out.println("7.Leer lista de censo");
			System.out.println("8.SALIR");

			System.out.println("¿que quieres realizar?: ");

			eleccion = sc.nextInt();	
			
			System.out.println("________________________________________________");
			
			switch (eleccion) {
				case 1:
				{
					Habitante habitante = new Habitante();
					habitante.crearHabitante();
					break;
				}
				case 2:
				{
					Inmueble inmueble = new Inmueble();
					inmueble.crearInmueble();
					break;
				}
				case 3:
				{
					EspacioPublico ep = new EspacioPublico();
					ep.crearEspacioPublico();
					break;
				}
				case 4:
				{
					Ayuntamiento ayunta = new Ayuntamiento();
					ayunta.crearAyuntamiento();
					break;
				}
				case 5:
				{
				
					partido.crearPartido();
					break;
				}
				case 6:
				{
					partido.leerMostar();
					break;
				}
				case 7:
				{
					Censo censo = new Censo();
					censo.crearCenso();
					break;
				}
			
			}
		}while(eleccion != 8);
		sc.close();
		
	}

	
}
