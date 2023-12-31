package com.project.consorcio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.project.consorcio.entity.Sede;
import com.project.consorcio.repository.SedeRepository;

@Service
public class SedeService {
	@Autowired
private SedeRepository repo;
	
	public List<Sede> listarTodos(){
		return repo.findAll();
	}


}
