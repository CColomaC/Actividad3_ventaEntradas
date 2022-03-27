package venta_entradas;

import java.time.LocalDate;



public class Ventas {
	
	Clientes cliente;
	Entradas entrada;
	private LocalDate fechaVenta;

	public Ventas(LocalDate fechaVenta, Clientes cliente, Entradas entrada) {
		
		this.fechaVenta = fechaVenta;
		this.cliente = cliente;
		this.entrada = entrada;
	}
	
	public Ventas() {
		
	}
	
	public Clientes getCliente() {
		return cliente;
	}

	public void setCliente(Clientes cliente) {
		this.cliente = cliente;
	}

	public Entradas getEntrada() {
		return entrada;
	}

	public void setEntrada(Entradas entrada) {
		this.entrada = entrada;
	}

	

	public LocalDate getFechaVenta() {
		return fechaVenta;
	}

	public void setFechaVenta(LocalDate fechaVenta) {
		this.fechaVenta = fechaVenta;
	}
	
	

}
