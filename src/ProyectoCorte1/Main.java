package ProyectoCorte1;
import java.util.Scanner;
import ProyectoCorte1.Usuarios;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int num=0;
		int op;
		Usuarios u=new Usuarios();
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
			System.out.println(" USTED DECIDIO INGRESAR A LAS OPCIONES DE USUARIO.");
			break;
		case 3:
			System.out.println("");
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
