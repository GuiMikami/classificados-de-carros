package br.com.melfhcars.model;

public class Login {
    
    private String cpfLogado;


    private String email;
    private String senha;

    public Login() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
        public String getCpfLogado() {
        return cpfLogado;
    }

    public void setCpfLogado(String cpfLogado) {
        this.cpfLogado = cpfLogado;
    }
}
