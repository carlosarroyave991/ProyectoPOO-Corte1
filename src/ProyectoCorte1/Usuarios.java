package ProyectoCorte1;
import java.util.Scanner;

import ProyectoCorte1.Main;


public class Usuarios {
	
	Main p = new Main();
	
	//atributos
	private Scanner sc;
	String[] nombre = new String[30];
	String[] cedula= new String[30];
	String[] edad= new String[30];
	int a;
	

	
	public Usuarios() {
		// TODO Auto-generated constructor stub
		nombre[0]= "";
		edad[0]="";
		cedula[0]="";
		a=0;
		
	}

	public void CrearUsuario() {
		sc =new Scanner(System.in);
		System.out.println("Usted decidio Crear un usuario nuevo.");
		System.out.println("Ingrese el numero de usuarios que desea ingresar:");
		a=sc.nextInt();
		for(int i=1;i<=a;i++) {
			sc.nextLine();
			System.out.println(i+".) Ingrese el nombre del usuario: ");
			nombre[i]=sc.nextLine();
			System.out.println(i+".) Ingrese la cedula del usuario: ");
			cedula[i]=sc.nextLine();
			System.out.println(i+".) Ingrese la edad del usuario: ");
			edad[i]=sc.nextLine();
			System.out.println("");
		}
		System.out.println("Los usuarios se han creado con exito.");
		
	}
	
	
	public void ListarUsuario() {
		sc =new Scanner(System.in);
		
		System.out.println("Usted decidio listar los usuarios ingresados.");
		for(int i=1;i<=a;i++) {
			System.out.println(i+".)El nombre del usuario es: "+this.nombre[i]);
			System.out.println(i+".)La cedula del usuario es: "+this.cedula[i]);
			System.out.println(i+".)La edad del usuario es: "+this.edad[i]);
			System.out.println(" ");
		}
		System.out.println("Los datos de usuario se han mostrado correctamente.");
	}
	
	public void EditarUsuarios() {
		sc =new Scanner(System.in);
		
		System.out.println("Usted decidio editar los usuarios.");
		System.out.println("Los datos tiene numeros, esas son las posiciones, escoja una para editar el usuario determinado.");
		for(int i=1;i<=a;i++) {
			System.out.println(i+".)El nombre del usuario es: "+this.nombre[i]);
			System.out.println(i+".)La cedula del usuario es: "+this.cedula[i]);
			System.out.println(i+".)La edad del usuario es: "+this.edad[i]);
			System.out.println(" ");
		}
		System.out.println("Ingrese numero:");
		int i=sc.nextInt();
		sc.nextLine();
		System.out.println(i+".) Cambie el nombre del usuario: ");
		nombre[i]=sc.nextLine();
		System.out.println(i+".) Cambie la cedula del usuario: ");
		cedula[i]=sc.nextLine();
		System.out.println(i+".) Cambie la edad de la persona: ");
		edad[i]=sc.nextLine();
		System.out.println("");
		System.out.println("Los datos han sido guardados correctamente.");
	
	}
	
	public void EliminarUsuario() {
		sc =new Scanner(System.in);
		System.out.println("Usted decidio eliminar los usuarios: ");
		System.out.println("Los datos tiene numeros, esas son las posiciones, escoja una para eliminar el usuario determinado.");
		for(int i=1;i<=a;i++) {
			System.out.println(i+".)El nombre del usuario es: "+this.nombre[i]);
			System.out.println(i+".)La cedula del usuario es: "+this.cedula[i]);
			System.out.println(i+".)La edad del usuario es: "+this.edad[i]);
			System.out.println(" ");
		}
		sc.nextLine();
		System.out.println("Ingrese numero:");
		int i=sc.nextInt();
		nombre[i]="";
		cedula[i]="";
		edad[i]="";
		System.out.println("");
		System.out.println("Los datos han sido guardados correctamente.");
	
	}

	
}
