package com.empresa.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Getter;
import lombok.Setter;

@Entity(name ="alumno")
@Table(name = "alumno")
@Getter
@Setter


public class Alumno {

	@Id
	//con esto le decimos que este campo es de tipo identity
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idAlumno;
	 
	private String nombre;
	private String dni;
	private String correo;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	private Date fechaNacimiento;
	
	
}
