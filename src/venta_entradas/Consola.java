package venta_entradas;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Consola {
	static Scanner scanner = new Scanner(System.in);
	private static ArrayList<Clientes> clientes = new ArrayList<Clientes>();
	private static ArrayList<Entradas> entradas = new ArrayList<Entradas>();
	private static ArrayList<Ventas> ventas = new ArrayList<Ventas>();
	private static ArrayList<Asientos> asientos = new ArrayList<Asientos>();
	
	// constantes para el menu
		public final static int OPCION_MENU_COMPRAR_TICKET = 1;
		public final static int OPCION_MENU_VER_VENTAS= 2;
		public final static int OPCION_MENU_ENTRADAS_DISPONIBLES = 3;
		public final static int OPCION_MENU_VER_RECAUDACIONES = 4;
		public final static int OPCION_MENU_SALIR = 0;
	

	public static void main(String[] args) {
		
		inicializar();		
		menu();
	}

	private static void inicializar() {

		for (int i = 1; i <= 30; i++) {
			System.out.println("A�adido asiento: "+i);
			Asientos asiento = new Asientos(i);
			asientos.add(asiento);
		}
		for (Asientos asiento : asientos) {
			Entradas entrada = new Entradas(1000, true, LocalDate.now(), "Peliculon", asiento);
			System.out.println("A�adida entrada");
			
		}
		
	}

	//MENU
//////////////////////////////////////////////
	private static void menu() {
		int opcion;		
		
		do {
			opcion = opcionMenu();
			System.out.printf("Ha seleccionado la opcion %d \n \n", opcion);		
			switch(opcion) {
				case OPCION_MENU_COMPRAR_TICKET:
					comprarTicket();
					break;
				case OPCION_MENU_VER_VENTAS:
					verEntradasVendidas();
					break;
				case OPCION_MENU_ENTRADAS_DISPONIBLES:
					verEntradasDisponibles();
					break;
				case OPCION_MENU_VER_RECAUDACIONES:
					verRecaudaciones();
					break;
				case OPCION_MENU_SALIR:
					System.out.println("Saliendo...");
					break;
				default:
					System.out.println("Opcion escogida no valida. Vuelva a intentarlo");
					break;
			}
		}while(opcion!= OPCION_MENU_SALIR);
		
	}
	
	private static int opcionMenu() {
		System.out.println("SISTEMA ENTRADAS:\n"); // "\n" para saltarse una linea
		System.out.println("1. COMPRAR TICKET");
		System.out.println("2. VER VENTAS");
		System.out.println("3. ENTRADAS DISPONIBLES");
		System.out.println("4. VER RECAUDACIONES");
		System.out.println("0. Salir \n");

		System.out.println("Seleccione una opcion del 1 al 4. Seleccione 0 para salir.");

		int opcionSeleccionada = scanner.nextInt(); 
		return opcionSeleccionada;
	}
//////////////////////////////////////////////
	
	//VER RECAUDACIONES
///////////////////////////////////////////////
	private static void verRecaudaciones() {
		System.out.println("No implementado aun");
		
	}
///////////////////////////////////////////////
	private static void verEntradasDisponibles() {
		System.out.println("No implementado aun");		
	}
	//VER ENTRADAS VENDIDAS
///////////////////////////////////////////////
	private static void verEntradasVendidas() {
		System.out.println("No implementado aun");		
	}
///////////////////////////////////////////////
	// COMPRAR TICKET
///////////////////////////////////////////////
	private static void comprarTicket() {
		System.out.println("No implementado aun");
	}
///////////////////////////////////////////////
}
