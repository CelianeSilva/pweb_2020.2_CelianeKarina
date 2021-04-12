package br.com.celiane.cadastroPessoas1.controlllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CadastroConstroller {
	
	
	@RequestMapping("/CadastrarPessoas")
	public String fom() {
		
		return"cadastro/formCadastro";
	}
	

}
