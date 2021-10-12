package com.gia.dojosninjas.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gia.dojosninjas.models.Ninja;
import com.gia.dojosninjas.repository.NinjaRepository;
@Service
public class NinjaService {
	@Autowired
	NinjaRepository ninjaRepo;
	
	
	// Method to find all Ninja
	public List<Ninja> allNinjas() {
		return ninjaRepo.findAll();
	}

	// Method to Create a Ninja
	
	public Ninja createNinja(Ninja ninja) {
		return ninjaRepo.save(ninja);
	}
	
	// Method to Find One Ninja
	public Ninja oneNinja(Long id) {
		Optional<Ninja> optionalNinja = ninjaRepo.findById(id);
		if (optionalNinja.isPresent()) {
			return optionalNinja.get();
		} else {
			return null;
		}
	}
	// Method to update a Ninja
	
		public Ninja updateNinja(Ninja ninja) {
			return ninjaRepo.save(ninja);
		}
		
		
		// Method to Delete Ninja
		public void destroy(Long id) {
			ninjaRepo.deleteById(id);
		}
	
}
