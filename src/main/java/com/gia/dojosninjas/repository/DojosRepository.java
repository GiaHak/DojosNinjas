package com.gia.dojosninjas.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.gia.dojosninjas.models.Dojo;

@Repository
public interface DojosRepository extends CrudRepository<Dojo, Long> {

	List<Dojo> findAll();
	

}
