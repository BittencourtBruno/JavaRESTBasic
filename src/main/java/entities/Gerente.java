package entities;

public class Gerente {
	
	private String nome;

    public Gerente(String nome) {
        this.nome = nome;
    }

    private boolean validarNome(String nome) {
        if(nome !=null && !nome.isEmpty() && !nome.isBlank()) {
            return true;
        }
        return false;
    }

    public void setNome(String nome) {
        if(this.validarNome(nome)) {
            this.nome = nome.trim();
        }
        else {
            System.out.println("O nome indicado não obedece aos requisitos!");
        }
    }

    public String getPrimeiroNome() {
        return this.nome.substring(0, this.nome.indexOf(" "));
    }

    public String getUltimoNome() {
        return this.nome.substring(this.nome.indexOf(" "), this.nome.length());
    }

    public String getNomeEmMaiusculo() {
        return this.nome.toUpperCase();
    }

    public String getNomeAbreviado() {
        String[] nomeDividido = this.nome.split(" ");
        String nomeAbreviado = "";
        for (int i = 0; i < nomeDividido.length; i++) {
            if(i == 0) {
                nomeAbreviado = nomeDividido[i]+" ";
            }
            else if(i == nomeDividido.length-1) {
                nomeAbreviado += nomeDividido[i];
            }
            else {
                nomeAbreviado += nomeDividido[i].substring(0, 1)+". ";
            }
        }
        return nomeAbreviado;
    }

}
