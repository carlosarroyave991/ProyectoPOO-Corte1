package ProyectoCorte1;
import java.util.Scanner;
import ProyectoCorte1.Main;
import ProyectoCorte1.*;

public class Salas {
	Main p = new Main();
	//atributos
	private Scanner sc;
	String[] sala= new String[30];
	int a;
	int b;
	int cont;
	
	public Salas() {
		sala[0]="";
		int a=0;
		int b=0;
		int cont=0;
	}
	
	public void CrearSala() {
		sc =new Scanner(System.in);
		System.out.println("Usted decidio crear una sala nueva.");
		System.out.println("Ingrese el numero de salas que desea crear:");
		if(a>0) {
			b=sc.nextInt();
			cont =a+b;
			for(int i = a+1;i<=cont;i++) {
				sc.nextLine();
				System.out.println(i+".) Ingrese el nombre de la sala: ");
				sala[i]=sc.nextLine();
				System.out.println("");
			}
		}else {
			a=sc.nextInt();
			for(int i=1;i<=a;i++) {
				sc.nextLine();
				System.out.println(i+".) Ingrese el nombre de la sala: ");
				sala[i]=sc.nextLine();
				System.out.println("");
			}
		}
		
		System.out.println("Las salas se han creado con exito.");
		
	}
	
	
	public void ListarSala() {
		sc =new Scanner(System.in);
		
		System.out.println("Usted decidio listar las salas ingresadas.");
		for(int i=1;i<=a;i++) {
			System.out.println(i+".)El nombre de la sala es: "+this.sala[i]);
			System.out.println(" ");
		}
		System.out.println("Los datos de las salas se han mostrado correctamente.");
	}
	
	
	public void EditarUsuarios() {
		sc =new Scanner(System.in);
		System.out.println("Usted decidio editar las salas.");
		System.out.println("Los datos tiene numeros, esas son las posiciones, escoja una para editar la sala determinada.");
		for(int i=1;i<=a;i++) {
			System.out.println(i+".)El nombre de la sala es: "+this.sala[i]);
			System.out.println(" ");
		}
		System.out.println("Ingrese numero:");
		int i=sc.nextInt();
		sc.nextLine();
		System.out.println(i+".) Cambie el nombre de la sala: ");
		sala[i]=sc.nextLine();
		System.out.println("");
		System.out.println("Los datos han sido guardados correctamente.");
	}
	
	
	public void EliminarSala() {
		sc =new Scanner(System.in);
		System.out.println("Usted decidio eliminar las salas: ");
		System.out.println("Los datos tiene numeros, esas son las posiciones, escoja una para eliminar la sala determinada.");
		for(int i=1;i<=a;i++) {
			System.out.println(i+".)El nombre de la sala es: "+this.sala[i]);
			System.out.println(" ");
		}
		System.out.println("Ingrese numero:");
		int i=sc.nextInt();
		sala[i]="";
		System.out.println("");
		System.out.println("Los datos han sido guardados correctamente.");
	
	}
	

}
