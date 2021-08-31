package com.empresa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.empresa.entity.Medicamento;
import com.empresa.service.MedicamentoService;



@RestController
@RequestMapping("/rest/medicamento")
public class MedicamentoController {

	@Autowired
	private MedicamentoService serviceMedic;
	
	//medicamento
	
	
	
	@GetMapping
	@ResponseBody
	public ResponseEntity<List<Medicamento>> listaMedicamento(){

		List<Medicamento> lista = serviceMedic.listaMedicamento();

		return ResponseEntity.ok(lista);

	}
	
	
	
	
	@PostMapping
	@ResponseBody

	public ResponseEntity<Medicamento> registraAlumno(@RequestBody Medicamento obj){
		
		Medicamento objSalida = serviceMedic.insertaActualiza(obj);

		if (objSalida == null) {

			return ResponseEntity.noContent().build();

		}

		return ResponseEntity.ok(objSalida);

	}
	
	
}
