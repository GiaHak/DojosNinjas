package com.gia.dojosninjas.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.gia.dojosninjas.models.Dojo;
import com.gia.dojosninjas.models.Ninja;
import com.gia.dojosninjas.service.DojosService;
import com.gia.dojosninjas.service.NinjaService;

@Controller
public class DojosController {
	@Autowired
	NinjaService ninjaService;
	DojosService dojosService;


	 public DojosController(DojosService dojosService) { 
		 
		 this.dojosService = dojosService; 
	 }
	 

	// Shows all the Ninjas
	@RequestMapping("/")
	public String index(Model model) {

		List<Ninja> allNinjas = ninjaService.allNinjas();
		List<Dojo> allDojos = dojosService.allDojos();

		model.addAttribute("ninjas", allNinjas);
		model.addAttribute("dojos", allDojos);

		return "index.jsp";
	}

	// Renders the Form for creating a Ninja
	 @RequestMapping("/createNinja")
	    public String createNinja(Model model, @ModelAttribute("ninja") Ninja ninja) {
	    	
	    	List<Ninja> ninjas = ninjaService.allNinjas();
	    	List<Dojo> dojos = dojosService.allDojos();
	    	
	        model.addAttribute("ninjas", ninjas);
	    	model.addAttribute("dojos", dojos);
	    	
	        return "newninja.jsp";
	    }
	    @RequestMapping(value="/newninja", method=RequestMethod.POST)
	    public String create(@Valid @ModelAttribute("ninja") Ninja ninja, BindingResult result) {
	    	
	   	 if (result.hasErrors()) {
	   		 return "newninja.jsp";
	   	 } else {
	   		 ninjaService.createNinja(ninja);
	   		 return "redirect:/";
	   	 }
	    }

	// Renders the Form for creating a DOjo
	@RequestMapping("/newdojo")
	public String newdojo(Model model, @Valid @ModelAttribute("dojo") Dojo dojo, BindingResult result) {
		 List<Dojo> dojos = dojosService.allDojos();
	        model.addAttribute("dojos", dojos);
		return "newdojo.jsp";
	}

	

	// This is for the action from the form to actually make the dojo
	@RequestMapping(value = "/createDojo", method = RequestMethod.POST)
	public String createDojo(@Valid @ModelAttribute("dojo") Dojo dojo, BindingResult result) {
		if (result.hasErrors()) {
			return "newdojo.jsp";
		}
		else {
			dojosService.create(dojo);
			return "redirect:/";
			
		}
	}

	
	
	// Show one Dojo
	@RequestMapping("oneDojo/{id}")
	public String oneDojo(@PathVariable("id") Long id, Model model) {
		model.addAttribute("dojos", dojosService.oneDojo(id));
		return "show.jsp";
	}

	// Delete one Ninja
	@RequestMapping("/destroy/{id}")
	public String destroy(@PathVariable("id") Long id) {
		ninjaService.destroy(id);
		return "redirect:/";
	}
}
