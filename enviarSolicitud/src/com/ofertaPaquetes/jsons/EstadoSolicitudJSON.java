package com.ofertaPaquetes.jsons;

public class EstadoSolicitudJSON {
	
	int id;
	String tipo;
	String detalle;
	String estado;
	public EstadoSolicitudJSON() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EstadoSolicitudJSON(int id, String tipo, String detalle, String estado) {
		super();
		this.id = id;
		this.tipo = tipo;
		this.detalle = detalle;
		this.estado = estado;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getDetalle() {
		return detalle;
	}
	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	
	
	

}
