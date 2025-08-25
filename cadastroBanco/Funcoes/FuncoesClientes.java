package cadastroBanco.Funcoes;

import cadastroBanco.objetos.Cliente;

public class FuncoesClientes extends Cliente {

    public FuncoesClientes(String nome, String endereco, String cpf, String telefone, String clienteId, String senha) {
        super(nome, endereco, cpf, telefone, clienteId, senha);
    }

    public String getClienteId() {
        return clienteId;
    }

    public void setClienteId(String clienteId) {
        this.clienteId = clienteId;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}