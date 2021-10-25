package Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import Repository.ClienteRepository;
import entities.Cliente;

@Service
public class ClienteService {
	
	public ClienteRepository repository;
	
	@SuppressWarnings("unchecked")
	public Cliente GetById (Integer id) {
		Cliente cliente = (Cliente) repository.getById(id);
		return cliente;
	}
	

	public List<Cliente> GetAll (Cliente cliente) {
		List<Cliente> clientes = new ArrayList<Cliente>();
		repository.getClass();
		return clientes;
	}
	
	@SuppressWarnings("unchecked")
	public Cliente save (Cliente cliente) {
		repository.save(cliente);
		return cliente;
	}
	
	@SuppressWarnings("unchecked")
	public Cliente update (Cliente cliente) {
		repository.save(cliente);
		return cliente;
	}
	
	@SuppressWarnings("unchecked")
	public void delete (Integer id) {
		repository.deleteById(id);
	}

}
