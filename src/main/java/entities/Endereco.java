package entities;


public class Endereco {
	
	private Integer id;
	private String logradouro;
	private String bairro;
	private String cidade;
	private String uf;
	private String cep;
	
	
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	@Override
    public String toString() {
        return "Endereco{" + "logradouro=" + logradouro + ", bairro=" + bairro + ", cidade=" + cidade + ", uf=" + uf + ", cep=" + cep + "}";
    }
	

}
