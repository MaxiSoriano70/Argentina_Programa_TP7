package modelos;

import java.time.LocalDateTime;

public class Compra {
	private double total;
	private Item[] items;
	private LocalDateTime fecha;
	private IDescuento descuento;
	
	public Compra() {
		this.items = new Item[10];
		this.fecha = LocalDateTime.now();
	}
	
	public double getTotal() {
		return total;
	}
	
	public void setTotal(double total) {
		this.total = total;
	}
	
	public Item[] getItems() {
		return items;
	}
	
	public void setItems(Item[] items) {
		this.items = items;
	}
	
	public LocalDateTime getFecha() {
		return fecha;
	}
	
	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}
	
	public IDescuento getDescuento() {
		return descuento;
	}

	public void setDescuento(IDescuento descuento) {
		this.descuento = descuento;
	}
	
	public void aplicarDescuento() {
		double aux=this.descuento.calcularDescuento();
		this.setTotal(aux);
	}

	public String calcularTotalCompra() {
		for(int i=0;i<this.getItems().length;i++) {
			Item it=this.getItems()[i];
			if(it!=null) {
				this.total+=Double.parseDouble(it.calcularTotal());
			}
		}
		return String.valueOf(this.getTotal());
	}
	
	
	
	
	
	
}
