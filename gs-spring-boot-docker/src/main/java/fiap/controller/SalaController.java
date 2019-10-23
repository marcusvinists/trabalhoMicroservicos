package fiap.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import fiap.model.Grupo;
import fiap.repository.GrupoRepository;

@Controller
@RequestMapping(path="/sala")
public class SalaController {

	@Autowired
	private GrupoRepository grupoRepository;
	
	@GetMapping(path="/grupo")
	public @ResponseBody Iterable<Grupo> addNewUser () {
		return grupoRepository.findAll();
	} 
}
