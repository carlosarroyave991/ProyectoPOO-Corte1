package ProyectoCorte1;
import java.util.Scanner;
import ProyectoCorte1.*;


public class Peliculas {

		Main p = new Main();
		//atributos
		private Scanner sc;
		String[] pelicula= new String[120];
		String[] pelisala=new String[120];
		int a;
		int b;
		int cont;
		Salas s=new Salas();
		
		public Peliculas() {
			pelicula[0]="";
			pelisala[0]="";
			int a=0;
			int b=0;
			int cont=0;
		}
		
		
		public void CrearPelicula() {
			sc =new Scanner(System.in);
			System.out.println("Usted decidio crear una pelicula nueva.");
			System.out.println("Ingrese el numero de peliculas que desea crear:");
			if(a>0) {
				b=sc.nextInt();
				cont =a+b;
				for(int i = a+1;i<=cont;i++) {
					sc.nextLine();
					System.out.println(i+".) Ingrese el nombre de la pelicula: ");
					pelicula[i]=sc.nextLine();
					System.out.println("");
					s.ListarSala();
					/*for(int j=1;j<=s.a;j++) {	
						System.out.println(i+".)El nombre de la sala es: "+this.s.sala[j]);
						System.out.println(" ");
					}*/
					System.out.println("Escoja una sala para la pelicula, seleccione el numero de la sala: ");
					int j=sc.nextInt();
					pelisala[i]=s.sala[j];
					System.out.println("La sala es: "+this.pelisala[i]);
				}
			}else {
				a=sc.nextInt();
				for(int i=1;i<=a;i++) {
					sc.nextLine();
					System.out.println(i+".) Ingrese el nombre de la pelicula: ");
					pelicula[i]=sc.nextLine();
					System.out.println("");
					s.ListarSala();
					/*for(int j=1;j<=s.a;j++) {	
						System.out.println(i+".)El nombre de la sala es: "+this.s.sala[j]);
						System.out.println(" ");
					}*/
					System.out.println("Escoja una sala para la pelicula, seleccione el numero de la sala: ");
					int j=sc.nextInt();
					pelisala[i]=s.salas[j];
					System.out.println("La sala es: "+this.pelisala[i]);
			}
			
			System.out.println("Las peliculas se han creado con exito.");
			
		}
		}
		
		
		public void ListarPelicula() {
			sc =new Scanner(System.in);
			
			System.out.println("Usted decidio listar las salas ingresadas.");
			for(int i=1;i<=a;i++) {
				System.out.println(i+".)El nombre de la pelicula es: "+this.pelicula[i]);
				System.out.println(i+".)El nombre de la sala es:"+this.pelisala[i]);
				System.out.println(" ");
			}
			System.out.println("Los datos de la pelicula se han mostrado correctamente.");
		}
		
		
		public void EditarUsuarios() {
			sc =new Scanner(System.in);
			System.out.println("Usted decidio editar los usuarios.");
			System.out.println("Los datos tiene numeros, esas son las posiciones, escoja una para editar la pelicula determinada.");
			for(int i=1;i<=a;i++) {
				System.out.println(i+".)El nombre del pelicula es: "+this.pelicula[i]);
				System.out.println(" ");
			}
			System.out.println("Ingrese numero:");
			int i=sc.nextInt();
			sc.nextLine();
			System.out.println(i+".) Cambie el nombre de la pelicula: ");
			pelicula[i]=sc.nextLine();
			System.out.println("");
			System.out.println("Los datos han sido guardados correctamente.");
		}
		
		
		public void EliminarSala() {
			sc =new Scanner(System.in);
			System.out.println("Usted decidio eliminar las salas: ");
			System.out.println("Los datos tiene numeros, esas son las posiciones, escoja una para eliminar la pelicula determinada.");
			for(int i=1;i<=a;i++) {
				System.out.println(i+".)El nombre de la pelicula es: "+this.pelicula[i]);
				System.out.println(" ");
			}
			System.out.println("Ingrese numero:");
			int i=sc.nextInt();
			pelicula[i]="";
			System.out.println("");
			System.out.println("Los datos han sido guardados correctamente.");
		
		}
		
}
