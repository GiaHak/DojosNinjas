package com.gia.dojosninjas.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gia.dojosninjas.models.Dojo;
import com.gia.dojosninjas.repository.DojosRepository;

@Service
public class DojosService {
	@Autowired
	DojosRepository dojoRepo;
	
	
	// Method to find all the Dojos
	public List<Dojo> allDojos() {
		return dojoRepo.findAll();
	}
	
	// Method to create a Dojo
	public Dojo create(Dojo dojo ) {
		return dojoRepo.save(dojo);
	}
	
	public Dojo oneDojo(Long id) {
		Optional<Dojo> optionalDojo = dojoRepo.findById(id);
		if(optionalDojo.isPresent()) {
			return optionalDojo.get();
		} else {
			return null;
		}
	}

}
