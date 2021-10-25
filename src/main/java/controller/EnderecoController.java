package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import Service.EnderecoService;
import entities.Endereco;

@Controller
public class EnderecoController {
	
	public EnderecoService service;
	
	@RequestMapping("{cep}")
	public Endereco getEndereco (String cep) {
		Endereco endereco = new Endereco();
		endereco = service.find(cep);
		return endereco;
		
	}
	
	@RequestMapping("/save")
	public Endereco salvar (Endereco endereco) {
		Endereco endereco1 = new Endereco();
		endereco1.setLogradouro(endereco.getLogradouro());
		endereco1.setBairro(endereco.getBairro());
		endereco1.setCidade(endereco.getCidade());
		endereco1.setUf(endereco.getUf());
		endereco1.setCep(endereco.getCep());
		service.save(endereco1);
		return endereco1;
		
	}
	
	@RequestMapping("/update")
	public Endereco atualizar (Endereco endereco) {
		Endereco endereco1 = new Endereco();
		endereco1.setLogradouro(endereco.getLogradouro());
		endereco1.setBairro(endereco.getBairro());
		endereco1.setCidade(endereco.getCidade());
		endereco1.setUf(endereco.getUf());
		endereco1.setCep(endereco.getCep());
		service.save(endereco1);
		return endereco1;
		
	}
	
	@RequestMapping("/delete/{id}")
	public Endereco delete (Endereco endereco) {
		service.delete(endereco.getId());
		return endereco;
		
	}

}
