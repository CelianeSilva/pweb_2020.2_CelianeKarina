package br.com.celiane.cadpessoas.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.celiane.cadpessoas.model.Pessoa;
import br.com.celiane.cadpessoas.repositorys.PessoaRepository;

@Controller
@RequestMapping("/")
public class PessoaController {

	@Autowired
	PessoaRepository pessoaRepo;
	
	@GetMapping
	public String index() {
		return "index.html";
		
	}
	
	@GetMapping("listarPessoas")
	public ModelAndView ListarPessoas() {
		List<Pessoa> lista = pessoaRepo.findAll();
		ModelAndView mav = new modelAndView ("listarPessoas");
		mav.addobject("pessoas", lista);
		
		return mav;
		
	}
}
