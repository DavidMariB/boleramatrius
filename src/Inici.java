import java.util.Scanner;

public class Inici {
	
	Bolera laMatriu[][];
	int numPista[]={1,2,3,4,5,6,7,8,9};

	public static void main(String[] args) {
		Inici ini = new Inici();
		
		int elec=0;
		do{
			elec = ini.menu();
			switch(elec){
			case 1: ini.matriuIrregular();
					ini.omplirMatriuIrregular();
					break;
			case 2: System.out.println("¡Hasta Pronto!");
					break;
			default: System.out.println("La tecla introduida no es correcta");
					break;
			}
		}while(elec!=3);
		
		
		

	}
	
	public void matriuIrregular(){
		Scanner sc = new Scanner(System.in);
		//Así introduim el numero de files
		int numPistes;
		do{
			System.out.println("Introdueix el numero de Pistes a reservar (Se poden reservar 9 pistes en 1 reserva com a maxim):");
			numPistes = sc.nextInt();
		}while(numPistes<=0 || numPistes>9);
		
		laMatriu = new Bolera[numPistes][];
		//Ara introduim el numero de columnes
		for(int fila=0;fila<laMatriu.length;fila++){
			System.out.println("Introduix el numero de persones per a la pista "+numPista[fila]);
			int numJugadors = sc.nextInt();
			laMatriu[fila] = new Bolera[numJugadors];
		}
	}
	
	public void omplirMatriuIrregular(){
		//Este metod l'enllaçem al demanaDadesJugador per a poder omplir la matriu
		for (int fila=0;fila<laMatriu.length;fila++){
			for (int columna=0;columna<laMatriu[fila].length;columna++){
				Bolera unJugador = demanaDadesJugador(fila,columna);
				laMatriu[fila][columna] = unJugador;
			}
		}
	}
	
	public Bolera demanaDadesJugador(int fila, int columna){
		Scanner nombre = new Scanner(System.in);
		Scanner edad = new Scanner(System.in);
		Scanner dni = new Scanner(System.in);
		System.out.println("Pista "+numPista[fila]+" Jugador numero: "+(columna+1)+"/"+(laMatriu[fila].length));
		//Demanem els datos del jugador
		System.out.print("Nom del Jugador:");
		String n = nombre.nextLine();
		System.out.print("Edad del Jugador:");
		int e = edad.nextInt();
		System.out.println("DNI del Jugador (sense lletra):");
		int d = dni.nextInt();
		
		Bolera unJugador = new Bolera(n,e,d);
		
		return unJugador;
	}
	
	public int menu(){
		Scanner sc = new Scanner(System.in);
		System.out.println("1. Reservar Pistas");
		System.out.println("2. Eixir del menu");
		int elec = sc.nextInt();
		return elec;
	}
	
	}
	

}
