package com.project.consorcio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.consorcio.entity.Especialidad;
import com.project.consorcio.repository.EspecialidadRepository;

@Service
public class EspecialidadService {
	@Autowired
	private EspecialidadRepository repo;
	
	public List<Especialidad> listarTodos(){
		return repo.findAll();
	}


}
