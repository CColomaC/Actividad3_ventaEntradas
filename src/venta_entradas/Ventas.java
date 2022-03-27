package venta_entradas;

import java.time.LocalDate;

public class Ventas {
	
	private LocalDate fechaVenta;

	public Ventas(LocalDate fechaVenta) {
		
		this.fechaVenta = fechaVenta;
	}
	
	public Ventas() {
		
	}

	public LocalDate getFechaVenta() {
		return fechaVenta;
	}

	public void setFechaVenta(LocalDate fechaVenta) {
		this.fechaVenta = fechaVenta;
	}
	
	

}
