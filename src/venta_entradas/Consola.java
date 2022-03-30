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
			System.out.println("Añadido asiento: "+i);
			Asientos asiento = new Asientos(i);
			asientos.add(asiento);
		}
		for (Asientos asiento : asientos) {
			Entradas entrada = new Entradas(1000, true, LocalDate.now(), "Peliculon", asiento);
			System.out.println("Añadida entrada");
			
		}
		private static int menu() {
			System.out.println("\nMENU COMPRA DE ENTRADAS\n_______________________\n");
			System.out.println("1. Comprar Ticket");
			System.out.println("2. Ver Ventas");
			System.out.println("3. Ver Entradas Disponibles");
			System.out.println("4. Ver Recaudaciones");
			System.out.println("0. Salir");
	
			
			System.out.println("\nPor favor digite la opción deseada:");
			Scanner scanner = new Scanner( System.in );
			int opcionSeleccionada = scanner.nextInt();
			return opcionSeleccionada;
			
		}
}
