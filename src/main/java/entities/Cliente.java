package entities;

public class Cliente {
	
	private Integer id;
	private String nome;
	private String cpf;
	private String telefone;
	private String email;
	private Endereco endereco;
	
	

    public Cliente() {
		super();
		// TODO Auto-generated constructor stub
	}

	@SuppressWarnings("unused")
	private boolean validarNome(String nome) {
        if(nome !=null && !nome.isEmpty() && !nome.isBlank()) {
            return true;
        }
        return false;
    }
    
    @SuppressWarnings("unused")
	private boolean validarCpf(String cpf) {
        if(cpf !=null && !cpf.isEmpty() && !cpf.isBlank()) {
            return true;
        }
        return false;
    }
    
    @SuppressWarnings("unused")
	private boolean validarEmail(String email) {
        if(email !=null && !email.isEmpty() && !email.isBlank()) {
            return true;
        }
        return false;
    }
    
    @SuppressWarnings("unused")
	private boolean validarTelefone(String telefone) {
        if(telefone !=null && !telefone.isEmpty() && !telefone.isBlank()) {
            return true;
        }
        return false;
    }
    

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

    
	
	

}
