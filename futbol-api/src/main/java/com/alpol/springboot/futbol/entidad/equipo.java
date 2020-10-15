package com.alpol.springboot.futbol.entidad;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "equipos")
public class equipo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column
	private String nombre;
	@Column
	private String pais;
	
	@Column
	@Temporal(TemporalType.DATE)
	private Date feFundacion;

	
	public equipo(long id, String nombre, String pais, Date feFundacion) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.pais = pais;
		this.feFundacion = feFundacion;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public Date getFeFundacion() {
		return feFundacion;
	}

	public void setFeFundacion(Date feFundacion) {
		this.feFundacion = feFundacion;
	}

	
}
