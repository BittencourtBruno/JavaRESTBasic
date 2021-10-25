package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import Service.ClienteService;
import entities.Cliente;

@Controller
public class ClienteController {
	
	public ClienteService service;
	
	@RequestMapping("/save")
	public Cliente salvar (Cliente cliente) {
		Cliente cliente1 = new Cliente();
		cliente1.setNome(cliente.getNome());
		cliente1.setCpf(cliente.getCpf());
		cliente1.setEmail(cliente.getEmail());
		cliente1.setTelefone(cliente.getTelefone());
		cliente1.setEndereco(cliente.getEndereco());
		service.save(cliente1);
		return cliente1;
		
	}
	
	@RequestMapping("/atualizar")
	public Cliente atualizar (Cliente cliente) {
		Cliente cliente1 = new Cliente();
		cliente1.setNome(cliente.getNome());
		cliente1.setEmail(cliente.getEmail());
		cliente1.setTelefone(cliente.getTelefone());
		cliente1.setEndereco(cliente.getEndereco());
		service.save(cliente1);
		return cliente1;
		
	}
	
	@RequestMapping("/{id}")
	public Cliente buscar (Cliente cliente) {
		service.GetById(cliente.getId());
		return cliente;
		
	}
	
	@RequestMapping("/delete/{id}")
	public Cliente deletar (Cliente cliente) {
		service.delete(cliente.getId());
		return cliente;
		
	}
	
	@RequestMapping("/all")
	public Cliente listar (Cliente cliente) {
		service.GetAll(cliente);
		return cliente;
		
	}

}
