package Service;

import org.springframework.stereotype.Service;

import Repository.EnderecoRepository;
import entities.Endereco;

@Service
public class EnderecoService {
	
	public EnderecoRepository repository;
	
	private Endereco cep(String string, Class<Endereco> class1) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public Endereco find(String cep) {
		Endereco endereco = cep(
				"https://viacep.com.br/ws/06330000/json/", Endereco.class);
		return endereco;
	}

	@SuppressWarnings("unchecked")
	public Endereco save (Endereco endereco) {
		repository.save(endereco);
		return endereco;
	}
	
	@SuppressWarnings("unchecked")
	public Endereco update (Endereco endereco) {
		repository.save(endereco);
		return endereco;
	}
	
	@SuppressWarnings("unchecked")
	public void delete (Integer id) {
		repository.deleteById(id);
	}

}
