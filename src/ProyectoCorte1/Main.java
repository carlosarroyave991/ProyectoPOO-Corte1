package ProyectoCorte1;
import java.util.Scanner;
import ProyectoCorte1.Usuarios;
import ProyectoCorte1.Salas;
import ProyectoCorte1.Peliculas;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int num=0;
		int op;
		Salas s=new Salas();
		Usuarios u=new Usuarios();
		Peliculas p=new Peliculas();
		do {
		System.out.println("		BIEMVENIDO AL MENU DEL CINEMA.  ");
		System.out.println("1.) Opciones de usuario.");
		System.out.println("2.) Opciones de sala.");
		System.out.println("3.) Opciones de pelicula.");
		System.out.println("4.) Opciones de boletos.");
		System.out.println("5.) Opciones de reservas.");
		System.out.println("6.) Salir del programa.");
		System.out.println("Escoja una opcion:");
		num=sc.nextInt();
		switch(num) {
		case 1:
			do {
				System.out.flush();
				System.out.println(" USTED DECIDIO INGRESAR A LAS OPCIONES DE USUARIO.");
				System.out.println("1.) Listar usuarios.");
				System.out.println("2.) Crear usuarios.");
				System.out.println("3.) Editar usuarios.");
				System.out.println("4.) Eliminar usuarios.");
				System.out.println("5.) Regresar a menu anterior.");
				System.out.println("Escoja opcion:");
				op=sc.nextInt();
				switch(op) {
				case 1:
					System.out.flush();
					u.ListarUsuario();
					new java.util.Scanner(System.in).nextLine();
					break;
				case 2:
					System.out.flush();
					u.CrearUsuario();
					new java.util.Scanner(System.in).nextLine();
					break;
				case 3:
					System.out.flush();
					u.EditarUsuarios();
					new java.util.Scanner(System.in).nextLine();
					break;
				case 4:
					System.out.flush();
					u.EliminarUsuario();
					new java.util.Scanner(System.in).nextLine();
					break;
				case 5:
					//do {
					System.out.println("Usted decidio regresar al menu de inicio.");
					System.out.print("");
					new java.util.Scanner(System.in).nextLine();
				System.out.flush();
					break;
				default:
					System.out.println("Esa opcion no esta en el rango especificado.");
					new java.util.Scanner(System.in).nextLine();
				System.out.flush();
					break;
				}
			}while(op!=5);
			break;
		case 2:
			do {
				System.out.flush();
				System.out.println(" USTED DECIDIO INGRESAR A LAS OPCIONES DE SALA.");
				System.out.println("1.) Listar salas.");
				System.out.println("2.) Crear salas.");
				System.out.println("3.) Editar salas.");
				System.out.println("4.) Eliminar salas.");
				System.out.println("5.) Regresar a menu anterior.");
				System.out.println("Escoja opcion:");
				op=sc.nextInt();
				switch(op) {
				case 1:
					System.out.flush();
					s.ListarSala();
					new java.util.Scanner(System.in).nextLine();
					break;
				case 2:
					System.out.flush();
					s.CrearSala();
					new java.util.Scanner(System.in).nextLine();
					break;
				case 3:
					System.out.flush();
					s.EditarUsuarios();
					new java.util.Scanner(System.in).nextLine();
					break;
				case 4:
					System.out.flush();
					u.EliminarUsuario();
					new java.util.Scanner(System.in).nextLine();
					break;
				case 5:
					//do {
					System.out.println("Usted decidio regresar al menu de inicio.");
					System.out.print("");
					new java.util.Scanner(System.in).nextLine();
				System.out.flush();
					break;
				default:
					System.out.println("Esa opcion no esta en el rango especificado.");
					new java.util.Scanner(System.in).nextLine();
				System.out.flush();
					break;
				}
			}while(op!=5);
			break;
		case 3:
			do {
				System.out.flush();
				System.out.println(" USTED DECIDIO INGRESAR A LAS OPCIONES DE PELICULA.");
				System.out.println("1.) Listar peliculas.");
				System.out.println("2.) Crear peliculas.");
				System.out.println("3.) Editar peliculas.");
				System.out.println("4.) Eliminar peliculas.");
				System.out.println("5.) Regresar a menu anterior.");
				System.out.println("Escoja opcion:");
				op=sc.nextInt();
				switch(op) {
				case 1:
					System.out.flush();
					p.ListarPelicula();
					new java.util.Scanner(System.in).nextLine();
					break;
				case 2:
					System.out.flush();
					p.CrearPelicula();
					new java.util.Scanner(System.in).nextLine();
					break;
				case 3:
					System.out.flush();
					p.EditarUsuarios();
					new java.util.Scanner(System.in).nextLine();
					break;
				case 4:
					System.out.flush();
					p.EliminarSala();
					new java.util.Scanner(System.in).nextLine();
					break;
				case 5:
					//do {
					System.out.println("Usted decidio regresar al menu de inicio.");
					System.out.print("");
					new java.util.Scanner(System.in).nextLine();
				System.out.flush();
					break;
				default:
					System.out.println("Esa opcion no esta en el rango especificado.");
					new java.util.Scanner(System.in).nextLine();
				System.out.flush();
					break;
				}
			}while(op!=5);
			break;
		case 4:
			System.out.println("");
			break;
		case 5:
			System.out.println("");
			break;
		case 6:
			System.out.println("");
			break;
		}
		}while(num!=6);
		
		
	sc.close();	
	}

}
